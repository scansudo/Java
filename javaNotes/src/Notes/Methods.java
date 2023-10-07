package Notes;
// Methods

// 	Class's outside of the Main method are either methods as well or a folder that holds data types & Data (Ex.cNotes)
//	Methods = Do this ;
//	Those class methods are then called by the Main method which tells the console, Do this;

public class Methods {
	
	static void sayHello(){
		System.out.println("Hello!\n");
	}
	
	static void sayHelloName(String name){
		System.out.println("Hello " + name + "!");
	}
	
	static int sum(int val1, int val2) {
		return val1 + val2;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		sayHello();
		sayHello();
		
		sayHelloName("David");
		sayHelloName("Amy"); 
		
		int x = sum(2,5);
		System.out.println(x);
	}
}