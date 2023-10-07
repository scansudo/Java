package multiThreading;

public class Thread2 implements Runnable{
	
	MathTool mt;
	
	public Thread2(MathTool mt) {
		this.mt = mt;
	}
	public void run() {
		try {
			mt.getMultiples(3); // Instead of getting the multiples of 5(MathTool.java) it 
							   //  Thread2 is asking for the multiples of 3.
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
