package customAnnotations;

import java.lang.reflect.Method;

import customAnnotations.MyCustomAnnotation.xMyCustomAnnotation;

public class Main {
	
	@xMyCustomAnnotation(value = 3200)
	public void sayHello() {
		System.out.println("Hello ! (:");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Main h = new Main();
		Method methodValue = h.getClass().getMethod("sayHello");
		xMyCustomAnnotation xxMyCustomAnnotation = methodValue.getAnnotation(xMyCustomAnnotation.class);
		System.out.println("Value is: " + xxMyCustomAnnotation.value());

		
	}

}
