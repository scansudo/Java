package multiThreading;

public class MathTool {
	void getMultiples(int x) {
		
	synchronized (this){
		for (int i=1; i<=5; i++) {
			System.out.println(x * i); // This will give the multiple of x ; 5 times
									  // ex. x=4 ; 4,8,12,16,20.
			try {
				Thread.sleep(400); // increments at 400 milliseconds
			}catch(Exception e) {
				System.out.println(e);
				}
			}
		}
	}
}
