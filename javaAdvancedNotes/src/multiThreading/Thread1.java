package multiThreading;

public class Thread1 extends Thread{
	
	MathTool mt;
	
	public Thread1(MathTool mt) {
		this.mt = mt;
	}
	public void run() {
		try {
			mt.getMultiples(2); // Instead of getting the multiples of 5(MathTool.java) it 
							   //  Thread1 is asking for the multiples of 2.
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
