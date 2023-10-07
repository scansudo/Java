package threading;
// If you need to extend your class from a parent class you made , then you must use 
// Runnable interface which does the same thing as extends Thread; ex. in (Thread2).
public class Thread1 extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("Thread 1 is running");
		}catch(Exception e) {
			System.out.println("Exception is caught" + e);
		}
		
	}
}
