package exception;
import java.util.*;
public class ExceptionHandling {

	//throw
//	Used inside a method or block to actually throw an exception object.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			if(age<18 || age>60) {
				 throw new IllegalArgumentException("Age must be between 18 and 60");
			}
			else {
				System.out.println("You are eligble");
			}
		}catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        
	}
  }
}
