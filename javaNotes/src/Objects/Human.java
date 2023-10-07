package Objects;

public interface Human {
	
	// Polymorphism 
	public void speak();
	public void eat();
	public void sleep();

public class Kyle implements Human {
	
	@Override
	public void speak() {
		System.out.println("Hi I Am Kyle");
	}
	
	@Override
	public void eat() {
		System.out.println("...I am Eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("...I Am Sleeping");
		
		}
	}
}