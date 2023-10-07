package Notes;

public class OOPMain {

	public static void main(String[] args) {
		OOP c1 = new OOP();
		OOP c2 = new OOP();
		
		c1.color = "Black";
		c1.type = "Sedan";
		c1.year = 1997;
		c1.maxSpeed = 160;
		c1.fuelCapacity = 5.0;
		
		c2.color = "White";
		c2.type = "Coupe";
		c2.year = 2012;
		c2.maxSpeed = 200;
		c2.fuelCapacity = 7.5;	
		
		c2.horn();
		System.out.println(c1.color);

	}

}