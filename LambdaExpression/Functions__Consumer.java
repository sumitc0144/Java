package LambdaExpression;

import java.util.*;
import java.util.function.Consumer;

//Represents an operation that takes one input and returns nothing.
//Abstract method:
//	void accept(T t);
//		You use it when you want to perform an action on a value (like printing, logging, saving),
//		but don’t need to return anything.
public class Functions__Consumer {

	public static void main(String[] args) {
		// Simple
		 Consumer<String> printer = s -> System.out.println(s);

	        printer.accept("Hello Consumer!");  // Output: Hello Consumer!
	        
//	     Consume with List
	        List<String> names = Arrays.asList("Sumit", "Anita", "Ravi");

	        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

	        names.forEach(printUpper);  
	        
//	        Chaining Consumers
//	        Consumers have a default method andThen() that lets you chain multiple actions:
	        Consumer<String> print = s -> System.out.println("Name: " + s);
	        Consumer<String> length = s -> System.out.println("Length: " + s.length());

	        Consumer<String> combined = print.andThen(length);

	        combined.accept("Sumit");
	}

}
