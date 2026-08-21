package Loop;
import java.util.*;
public class loop {
	//lecture(7)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner sc = new Scanner(System.in);
//
//	        System.out.print("Enter a number: ");
//	        int num = sc.nextInt();
//	        // table 
//	        System.out.println("Multiplication table of " + num + ":");
//	        for (int i = 1; i <= 10; i++) {
//	            System.out.println(num + " x " + i + " = " + (num * i));
//	        }
//	        System.out.print(" factorial of  number: ");
//	        //Factorial
//	        long factorial = 1;
//	        for (int i = 1; i <= num; i++) {
//	            factorial *= i;
//	        }
//
//	        System.out.println("Factorial of " + num + " = " + factorial);
//	        
	//Lecture 8	 		
/*		         int choice = 0;

		         while (choice != 5) {
		             System.out.println("\n=== Arithmetic Operations Menu ===");
		             System.out.println("1. Addition");
		             System.out.println("2. Subtraction");
		             System.out.println("3. Multiplication");
		             System.out.println("4. Division");
		             System.out.println("5. Exit");
		             System.out.print("Enter your choice: ");
		             
		             choice = sc.nextInt();

		             switch (choice) {
		                 case 1:
		                     System.out.print("Enter two numbers: ");
		                     int a1 = sc.nextInt();
		                     int b1 = sc.nextInt();
		                     System.out.println("Result = " + (a1 + b1));
		                     break;
		                 case 2:
		                     System.out.print("Enter two numbers: ");
		                     int a2 = sc.nextInt();
		                     int b2 = sc.nextInt();
		                     System.out.println("Result = " + (a2 - b2));
		                     break;
		                 case 3:
		                     System.out.print("Enter two numbers: ");
		                     int a3 = sc.nextInt();
		                     int b3 = sc.nextInt();
		                     System.out.println("Result = " + (a3 * b3));
		                     break;
		                 case 4:
		                     System.out.print("Enter two numbers: ");
		                     int a4 = sc.nextInt();
		                     int b4 = sc.nextInt();
		                     if (b4 != 0) {
		                         System.out.println("Result = " + (a4 / b4));
		                     } else {
		                         System.out.println("Error: Division by zero!");
		                     }
		                     break;
		                 case 5:
		                     System.out.println("Exiting program...");
		                     break;
		                 default:
		                     System.out.println("Invalid choice, please try again.");
		             }
		         }
*/ // lecture 8
		 
	/*	 System.out.println("Enter the numbner");
		 int num = sc.nextInt();
		 int original =num;
	        int reversed = 0;

	        while (num > 0) {
	            int digit = num % 10;         
	            reversed = reversed * 10 + digit; 
	            num = num / 10;             
	        }
	        
	       if(original == reversed) {
	    	   System.out.println(original+" is palindrome");
	       }else
	       {
	    	   System.out.println(original+" is not palindrome");
	       }
*/
		 
		// sc.close();
		int a=1;
		int n=5;
		int i,j,k;
		for(i=0;i<=n;i++) {
			
			for(k=0;k<=i;k++) {
			
				System.out.print(i+k+" ");	
				a++;
			}
//			for(j=0;j<=n-i;j++) {
//				System.out.print("* ");
//			}
//				
			
			
			
			System.out.println();			
		}
		 
	}

}
