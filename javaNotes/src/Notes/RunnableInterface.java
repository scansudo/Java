package Notes;
// Runnnable class lets you extend from another class, as well
class Loaderx implements Runnable{
	public void run() {
		System.out.println("Running!");
	}
}
public class RunnableInterface {
	public static void main(String[] args) {
		Thread a1 = new Thread(new Loaderx());
		a1.start();
	}

}