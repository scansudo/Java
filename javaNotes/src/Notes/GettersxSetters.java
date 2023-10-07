package Notes;
import Objects.Vehicle;
import Objects.Person;
public class GettersxSetters{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle();
		v1.setColor("Red");
		v1.setYear(1938);
		System.out.println(v1.getColor());
		System.out.println(v1.getYear());
		
		Person p1 = new Person();
		Person p2 = new Person("James");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}