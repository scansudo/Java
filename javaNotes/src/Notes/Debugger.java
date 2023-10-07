package Notes;

public class Debugger {
	
	private int result = 0;
	
	public int getResult(){
		return result;
	}
	
	public void count() {
		for(int i = 0; i < 100; i++) {
			result += i + 1;
		}
	}

	public static void main(String[] args) {
		Debugger counter = new Debugger();
		counter.count();
		System.out.println("We have counted\n" + counter.getResult());
	}

}