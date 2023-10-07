package multiThreading;
// Scenario: 2 threads accessing the same object(MathTool); threads supplying different values 
// and expecting the output.
public class Synchronization {

	public static void main(String[] args) {

		MathTool object = new MathTool();
		
		Thread1 t1 = new Thread1(object); // extends Thread
		Thread t2 = new Thread(new Thread2(object)); // implements Runnable
		
		t1.start();
		t2.start();
// Output executes t1 first then t2 after with no problem.		
	}

}
