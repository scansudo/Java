package generics;
// Generics are signatures (in this case <T>) that support different data types so
// that we could use them over again without having to write the same type of code.

// Single Generic Holder is giving the signature different values , data objects 
// and giving them different commands; but in this case we are giving them the
// same command which is : System.out.println(x.getObject());
public class SingleGenericHolder <T> {

	T object;
	
	// Constructor, because it doesn't return anything it just declares that
	// we are eligible to add a value to our T object. Must be same name as class.
	SingleGenericHolder(T object) {
		
		this.object = object;
	}
	
	// Getter method is going to get called in the main method
	public T getObject() {
		
		return this.object;
	}

	public static void main(String[] args) {
	
		SingleGenericHolder<Integer> iObject = new SingleGenericHolder<Integer>(10);
		
		System.out.println(iObject.getObject());
		
		SingleGenericHolder<String> sObject = new SingleGenericHolder<String>("SimpleCode");
		
		System.out.println(sObject.getObject());
	}
}