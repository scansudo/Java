package Notes;
// Thread class run(){} & start();
// Thread.sleep() || Thread.wait() executes the argument after time set Ex. Notes.iNotes (1000)= 1 second
class Loader extends Thread{
	public void run(){
		System.out.println("...Running");
	}
}
public class Threads {
	public static void main(String[] args) {
		Loader obj = new Loader();
		obj.start();
	}

}