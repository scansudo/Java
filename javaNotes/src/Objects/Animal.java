package Objects;

public class Animal {

	protected int legs;
	protected String species;
	protected String diet;
	protected boolean isAnimalAgressive;
	protected double avgSizeWeightKg;
	protected double avgSizeHeightFt;
	protected double avgSizeLengthFt;
	protected double avgSizeWidthFt;
	protected String avgSize;


	public void makeSound() {
		System.out.println("Grrrr");
	}
	public void eat(){
		System.out.println("...Animal eating");
	}
}

class Dog extends Animal{
	Dog(){
		legs = 4;
		diet = "carnivore";
		species = "mammal";	
		isAnimalAgressive = false;
		avgSize = "Large";
		avgSizeWeightKg = 12.5;
		avgSizeHeightFt = 3.7;
		avgSizeLengthFt = 5.5;
		avgSizeWidthFt = 2.5;
	}

	public void makeSound() {
		System.out.println("Woof");
	}
}

class Cat extends Animal{
	Cat(){
		legs = 4;
		diet = "carnivore";
		species = "mammal";	
		isAnimalAgressive = false;
		avgSize = "Small";
		avgSizeWeightKg = 12.5;
		avgSizeHeightFt = 3.7;
		avgSizeLengthFt = 5.5;
		avgSizeWidthFt = 2.5;

	}


public static void main(String[] args) {
	Dog d = new Dog();
	d.eat();
	d.makeSound(); // Woof , this is called polymorphism 
	System.out.println(d.diet);
	
	Cat c = new Cat();
	c.eat();
	c.makeSound();
	System.out.println(c.diet);
}
}

