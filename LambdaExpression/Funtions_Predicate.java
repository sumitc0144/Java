package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Funtions_Predicate {
//		boolean test(T t, U u);
//	It’s a functional interface in the java.util.function package.
//	You use it when you want to check a condition on an object.
//	It represents a boolean-valued function of one argument.
//	It has one abstract method:
	public static void main(String[] args) {
		// SIMPLE
		
		Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7));//false

//        Predicate with Strings
        
        Predicate<String> startsWithA = s -> s.startsWith("A");

        System.out.println(startsWithA.test("Apple"));  // true
        System.out.println(startsWithA.test("Banana")); // false
        
//        Predicate with Collections
        List<String> names = Arrays.asList("Sumit", "Anita", "Ravi", "Aman");

        Predicate<String> startsWithB = s -> s.startsWith("S");

        names.stream()                  // Convert List into a Stream
             .filter(startsWithB)       // Keep only elements that start with "A"
             .forEach(System.out::println); // Print each element

	}

}
