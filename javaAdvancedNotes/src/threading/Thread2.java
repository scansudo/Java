package threading;
// java has Runnable interface in case you need to extend Thread2 from a parent class.
// java does not support double extend , this is why Runnable is available.
public class Thread2 implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread 2 is running");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
		
	}
}
