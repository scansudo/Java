package threading;

public class Main {

	public static void main(String[] args) {
		int x = 10; // Number of threads that will be incremented and stopped at x
		for(int i=0; i < x; i++){
			Thread1 t1 = new Thread1();
			t1.start(); // start() method comes from the extended Thread class in Thread1. (ready -> running)  
		
			Thread t2 = new Thread(new Thread2()); // Object Has to be named Thread because it is the java Thread class not our own
			t2.start();
		}

	}

}
