package Objects;
// Getters & Setters 
// Getter & Setters are used to access and modify private variables (Encapsulation)

public class Vehicle{
	// private variables cannot be modified or accessed DIRECTLY from another class 
	// The Vehicle class is accessible; with its private variables already set.
	// the values can be given to these variables from another class but the other class cannot modify, add, or delete them.
	private String color;
	private int year;
	
// Getters returns value which we will do in GettersxSetters.java
	// public String/int/etc. getX(){
	//	return x;					}
	public String getColor(){
		return color;
	}
	public int getYear(){
		return year;
	}
// Setter allows modification of the variables value from another class. Not the variable itself (can be confusing).
	// public void setX(String/int/etc. x){
	//	this.x = x;							  }
	public void setYear(int year){
		this.year = year;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void pressHorn(){
		System.out.println("Beep!");
	}
}