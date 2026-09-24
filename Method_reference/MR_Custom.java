package Method_reference;

import java.util.Arrays;
import java.util.List;

class MyPrinter {
    // static object like System.out
    public static MyPrinter out = new MyPrinter();

    public void println(String msg) {
        System.out.println("Custom Print: " + msg);
    }
}
public class MR_Custom {

	public static void main(String[] args) {
		  MyPrinter.out.println("Hello World");

	        // Method reference usage
	        String[] names = {"Sumit", "Anita", "Ravi"};
	        Arrays.stream(names).forEach(MyPrinter.out::println);
	        
//	        Arrays in Java do not have a forEach method.
//	        They only have indexed access (names[0], names[1], …).
//	        To use forEach, you need a Collection (like List, Set) or a Stream.
//	        his converts the array into a Stream, which supports forEach.
	        
	        List<String> name = Arrays.asList("Sumit", "Anita", "Ravi");

	        // Method reference usage
	        name.forEach(MyPrinter.out::println);
	}

}
