package LambdaExpression;




import java.util.function.BiPredicate;

//Found in java.util.function.
//Represents a condition (boolean function) with two arguments.

@FunctionalInterface
interface TriPredicate<T, U, V> {
    boolean test(T t, U u, V v);
}


public class Functions__Bipredicate {
	   public static void main(String[] args) {
		   //BiPredicate
	        BiPredicate<String, Integer> longerThan = (str, len) -> str.length() > len;
	        System.out.println("BiPredicate");
	        System.out.println(longerThan.test("Hello", 3)); // true
	        System.out.println(longerThan.test("Hi", 3));    // false
	       
	        //Custom
//	        create your own functional interface if you need more parameters:
	        
	        TriPredicate<String, Integer, Boolean> check = (str, len, flag) ->
            flag && str.length() > len;
            
            System.out.println(" Custom");
		    System.out.println(check.test("Hello", 3, true));  // true
		    System.out.println(check.test("Hi", 3, true));     // false
		    System.out.println(check.test("Hello", 3, false)); // false
	    }
}
