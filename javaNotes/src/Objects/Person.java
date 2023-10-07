package Objects;
// GettersxSetters (Info in Vehicle.java)
public class Person{
	
	private String name;
	
	public Person(){
		this.setName("Peter");
	}
	public Person(String n){
		this.setName(n);
	}
	public void setName(String n){
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public static void sayHello() {
		System.out.println("Hello!");
	}
}