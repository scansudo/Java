package generics;
// Generics are signatures (in this case <T,U>) that support different data types so
// that we could use them over again without having to write the same type of code.

// <T> gets the String
// <U> get the Integer
// But we can change that at any time in our class we are calling it from in this case 
// the main method.
public class MultiGenericHolder <T,U> {
	
	T object1;
	U object2;

	// Construct so we can give the <T,U> values later in the main method.
	MultiGenericHolder(T object1, U object2) {
		
		this.object1 = object1;
		this.object2 = object2;
	}
	
	// Create any kind of method(s) to do whatever and you can call it later in the main.
	public void theDisplayMethod() {
		
		System.out.println(object1);
		System.out.println(object2);
	}
	
	public static void main(String[] args) {
		
		MultiGenericHolder<String, Integer> xObject = new MultiGenericHolder<String, Integer>("SimpleCode", 10);
		
		xObject.theDisplayMethod();


	}

}
