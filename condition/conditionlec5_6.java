
package condition;

import java.util.*;

public class conditionlec5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			
		/*//Even and Odd
		 //if-else 
		 
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even ");
		
		else
			System.out.println(num+" is Odd ");
		
		
		// Password and Amount
		int pass=1234;
		int amount=100000;
		int upass=sc.nextInt();
		
		if(upass==pass) {
			
		
		System.out.println("passsword is coreect");
		System.out.println("Enter the Amount to Deposit");
		int uamount=sc.nextInt();
		
			if(uamount>0)
				amount+=uamount;
			else
				System.out.println("Enter valid amount");
			
		}
		else
			System.out.println("Password is wrong");
				
		System.out.println("Total amount is "+amount);*/
		
		/*//else if ladder(lecture 6)
		while(true) {
			System.out.println("ENter the number");
			int num=sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" is Positive");
		}else if(num<0) {
			System.out.println(num+" is Negative");
		}else {
			System.out.println("Number is zero");
		}
		
	
	}*/
		
		//switch statement(lecture 6)
		
	/*	
		System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }*/
		
		

		        System.out.print("Enter a number (1-7): ");
		        int day = sc.nextInt();

		        switch (day) {
		            case 1:
		                System.out.println("Sunday");
		                break;
		            case 2:
		                System.out.println("Monday");
		                break;
		            case 3:
		                System.out.println("Tuesday");
		                break;
		            case 4:
		                System.out.println("Wednesday");
		                break;
		            case 5:
		                System.out.println("Thursday");
		                break;
		            case 6:
		                System.out.println("Friday");
		                break;
		            case 7:
		                System.out.println("Saturday");
		                break;
		            default:
		                System.out.println("Invalid input! Please enter a number between 1 and 7.");
		        }

		     	sc.close();



     
    }
		
		
		
		
	}


