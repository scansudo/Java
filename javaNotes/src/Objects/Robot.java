package Objects;

public class Robot {
	int id;
	Robot(int i){
		id = i;
		Brain brain = new Brain();
		brain.think();
	}
	private class Brain{
		public void think() {
			System.out.println(id + " Brain is thinking");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Robot bob = new Robot(1);
	}

}