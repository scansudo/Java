package Notes;
// Encapsulation, Inheritance, Polymorphism, & abstract / interface class
	/*
	 * 1. Encapsulation = Secure implementation details from user (clean code/data hiding)
	 *                 
	 *                 -control the way data is accessed
	 *                 -More flexible and easily change code
	 *                 -Ability to change one piece of the code w/out affecting the other pieces
	 * Ex. */
public class Encapsulation {
	class BankAccount{
		@SuppressWarnings("unused")
		private double balance = 0;
		public void deposit(double x) {
			if(x>0) {
				balance += x;
			}
		}
	}
}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	class Employee{
		private int idNum;
		private String idName;
		
		// Setter x Getter for idNum
		
		public void setidNum(int n){
			idNum = n;
		}
		public int getidNum() {
			return idNum;
		}
		
		// Setter x Getter for idName
		
		public void setidName(String x){
			idName = x;
		}
		public String getidName() {
			return idName;
		}

		
// Set idNum & idName in the main method
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setidNum(32);
		e1.setidName("James");
		System.out.println(e1.getidNum());
		System.out.println(e1.getidName());
	}
}
	/*                             Rules to Method Overriding
	 *          - Should have the same return type and Arguments{}
	 *          - The access level cannot be more restrictive than the overridden method's access level
	 *          	example : If the superclass method is public, the overriding method in the sub class
	 *          			  can't be private nor protected.
	 *          - A method declared final or static can't be overridden
	 *          - Constructors can't be overridden
	 *              
	 *              
	 * 2. Inheritance = Enables one class to acquire the properties(methods x variables) of another class
	 *              -when one class inherits another it only inherits the super class's non-private properties
	 *              -Super class a.k.a Base class or Parent class
	 *              -Sub class a.k.a child class which extends the superclass 
	 *     Ex. Objects.Animal
	 *     
	 * 3. Polymorphism = "Having many forms" ... changing the methods based upon the objects through inheritance
	 *     Ex. Objects.Animals cow.sound(); && duck.sound();
	 *     
	 * 4. Abstract / Interface = super class with unvalued method(s) or variable(s) leaving it up to 
	 *                           the sub classes to value the method(s)/varibale(s)
	 *    Ex. Objects.Human & Tools.Interface
	 *    
	 *    @Override example : Objects.Machine
	 */