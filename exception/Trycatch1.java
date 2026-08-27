package exception;
import java.util.*;

public class Trycatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: object is null!");
        }finally {
        	sc.close();
        }
        
        
    }
}
