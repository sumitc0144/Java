package exception;
import java.util.*;

public class Trycatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        A NumberFormatException in Java happens when you try to convert
//        a String into a number (like int, double, etc.)
//        but the string isn’t in a valid numeric format.
        
        
        //NumberFormatException
//        try {
//            System.out.print("Enter a number: ");
//            String value = sc.next();
//            int number = Integer.parseInt(value);
//            System.out.println("You entered: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println(e+"Invalid input! Please enter a valid number.");
//        } finally {
//            sc.close(); 
//        }
        
        
    // This exception occurs when the input type does not match
    // For example: entering "abc" when nextInt() expects a number
        
        
        
        //InputMismatchException
//        try {
//            System.out.print("Enter a number: ");
//            int number = sc.nextInt(); 
//            System.out.println("You entered: " + number);
//        } catch (InputMismatchException e) {
//            System.out.println(e+"Invalid input! Please enter a valid integer.");
//        } finally {
//            sc.close();
//        }    
        
        
        // A NullPointerException in Java happens when you try to use 
        //   an object reference that hasn’t been initialized (it’s null).
        // In other words, you’re calling a method or accessing a property
        // on something that doesn’t exist yet.      
       
        //NullPointerException
//        String str = null;
//        try {
//            System.out.println(str.length());
//        } catch (NullPointerException e) {
//            System.out.println("Caught NullPointerException: object is null!");
//        }finally {
//        	sc.close();
//        }
//        
        
        
        // This happens if user enters something other than "true" or "false"
        
        //InputMismatchException
        try {
            System.out.print("Enter a boolean value (true/false): ");
            boolean flag = sc.nextBoolean();  
            System.out.println("You entered: " + flag);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter only 'true' or 'false'.");
        } finally {
            sc.close();
        }
        
    }
}
