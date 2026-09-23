package LambdaExpression;


import java.util.function.Function;

public class Functions_Function {

//	Represents a function that takes one input of type T and returns a result of type R.
//	Abstract method:
//		R apply(T t);
	public static void main(String[] args) {
	
        
     // 1. Simple Function: String → Integer (length of string)
        Function<String, Integer> length = s -> s.length();
        System.out.println("Length of 'Hello': " + length.apply("Hello")); // 5
        System.out.println("Length of 'Sumit': " + length.apply("Sumit")); // 5

        // 2. Function: Integer → Integer (square of number)
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 6: " + square.apply(6)); // 36

        // 3. Function: Integer → String (convert to string)
        Function<Integer, String> intToString = n -> "Number: " + n;
        System.out.println(intToString.apply(10)); // Number: 10

        // 4. Chaining Functions with andThen()
        // First square, then convert to string
        Function<Integer, String> squareThenString = square.andThen(intToString);
        System.out.println(squareThenString.apply(7)); // Number: 49

        // 5. Composing Functions with compose()
        // First convert to string, then find length
        Function<Integer, String> intLength = intToString.compose(square);
        System.out.println("Length after compose: " + intLength.apply(5)); // Length of "Number: 25" → 10

        // 6. Identity Function (returns input as is)
        Function<String, String> identity = Function.identity();
        System.out.println("Identity: " + identity.apply("Hello World")); // Hello World

        // 7. Function with null safety (example)
        Function<String, Integer> safeLength = s -> (s == null ? 0 : s.length());
        System.out.println("Safe length of null: " + safeLength.apply(null)); // 0
	}

}
