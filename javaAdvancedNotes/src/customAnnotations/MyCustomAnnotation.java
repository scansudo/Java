package customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyCustomAnnotation {
	
// Only applies to methods and is ran at runtime
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

	public @interface xMyCustomAnnotation{
	int value();
	
	}
}
