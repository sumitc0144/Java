package LambdaExpression;


import java.util.function.Function;

public class Functions_Function {

//	Represents a function that takes one input of type T and returns a result of type R.
//	Abstract method:
//		R apply(T t);
	public static void main(String[] args) {
		// : Simple Function
		Function<String, Integer> length = s -> s.length();

        System.out.println(length.apply("Hello")); // 5
        System.out.println(length.apply("Sumit")); // 5
	}

}
