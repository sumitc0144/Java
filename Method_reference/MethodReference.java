package Method_reference;

import java.util.*;
import java.util.function.*;

class MathUtil {
    // Static method
    static int square(int n) {
        return n * n;
    }
}

//ClassName::staticMethodName
//objectReference::instanceMethodName
//ClassName::instanceMethodName (unbound reference)
//ClassName::new (constructor reference)
public class MethodReference {
//	A lambda expression is often used to pass behavior (a block of code) into methods.
//	If the lambda only calls an existing method, you can replace it with a method reference for cleaner, more readable code.
	public static void main(String[] args) {
		 // 1. Static Method Reference
        Function<Integer, Integer> staticRef = MathUtil::square;
        System.out.println("Square of 5: " + staticRef.apply(5));

        // 2. Instance Method Reference (particular object)
        Consumer<String> instanceRef = System.out::println;
        instanceRef.accept("Hello from instance method reference!");

        // 3. Instance Method Reference (unbound, class::method)
        Function<String, Integer> unboundRef = String::length;
        System.out.println("Length of 'Copilot': " + unboundRef.apply("Copilot"));

        // 4. Constructor Reference
        Supplier<List<String>> constructorRef = ArrayList::new;
        List<String> list = constructorRef.get();
        list.add("Java");
        list.add("Method Reference");
        list.forEach(System.out::println);

	}

}
