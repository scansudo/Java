package Objects;
public class Machine {
	public void start(){
		System.out.println("...Machine is starting");
	}
public static void main(String[] args){
	Machine m = new Machine() {
		@Override public void start() {
			System.out.println("...Override start");
		}
	};
	Machine m2 = new Machine();
	m.start();
	m2.start();
}
}