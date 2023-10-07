package serialization;

import java.io.Serializable;

public class employee implements Serializable {
	
	// This give the object a Unique/Universal ID number.
	private static final long serialVersionUID = 1L;
	
	// Declare private variables
	private String name;
	private int age;
	private String email;
	private int employeeID;
	
	
	public employee(String name, int age, String email, int employeeID) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.employeeID = employeeID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	// toString() method that just to prints the object nicely
	@Override
	public String toString() {
		return ( "Employee ID #: " + this.getEmployeeID() + "\n" + "Employee Name: " + this.getName()
				+ "\n" + "Employee Age: " + this.getAge() + "\n" + "Employee Email Address: " + this.getEmail());
	}

}
