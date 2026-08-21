package practice;

import java.util.*;

// lecture 9-10

public class practice {
	public static void main(String[] args){
		
	//	 Scanner sc = new Scanner(System.in);

	      //  System.out.print("Enter a number:\n ");
//	        int num = sc.nextInt();
//	        // table 
//	        System.out.println("Multiplication table of " + num + ":");
//	        for (int i = 1; i <= 10; i++) {
//	            System.out.println(num + " x " + i + " = " + (num * i));
//	        }
//	        
//	      //Factorial
//	        
//	        int factorial = 1;
//	        for (int i = 1; i <= num; i++) {
//	            factorial *= i;
//	        }
//
//	        System.out.println("\nFactorial of " + num + " = " + factorial);
//	
	        
	        //Swapping of two number
	        
//	        int a=sc.nextInt();
//	        int b=sc.nextInt();
//	        
//	        System.out.println("Before swapping");
//	        System.out.println("a="+a+"\nb="+b);
//	        //Swap with extra varible
////	        int temp=a;
////	        a=b;
////	        b=temp;
//	        
//	        // Swap without Extra Vraibale
//	        a=a+b;
//	        b=a-b;
//	        a=a-b;
//	        
//	        System.out.println("AFter swapping");
//	        System.out.println("a="+a+"\nb="+b);
//	   
//	        
	        
	        
	        //find length of A DIGIT
//	        
//	        int no=sc.nextInt();
//	        int count=0;
//	        int sum=0;
//	        while (no != 0) {
//	        	int mod=no%10;
//	        	 sum+=mod;
//                no = no / 10;  
//                count++; 
//                
//            }
//	        	
//	        
//	        System.out.println("Total length of number is :"+count);
//	        System.out.println("Sum of digit is :"+sum);
//	        
//	        
	      //prime number
//	        System.out.println("Enter the number ");
//	        int numb=sc.nextInt();
//	        boolean isprime=true;
//	        
//	        if(numb<=0) {
//	        	System.out.println(numb+"Number is not prime");
//	        }else {
//	        for(int i=2;i<numb;i++) {
//	        	if(numb%i==0) {
//	        		isprime=false;
//	        		break;
//	        	}
//	        }
//	        
//	        if(isprime)
//	        	System.out.println(numb+" is prime");
//	        else
//	        	System.out.println(numb+" is not prime");
//	     }
		// Largest number from a digit 
//		   System.out.println("Enter the number ");
//		   int num=sc.nextInt();
//		   int max=0;
//		   while (num != 0) {
//	            int digit = num % 10;   
//	            if (digit < max) {
//	                max = digit;        
//	            }
//	            num = num / 10;         
//	        }
//
//	        System.out.println("Largest digit: " + max);
		  
		 
	//	 int row=5;
		 
//		 for(int i=1;i<=row;i++) {
//			 for(int j=1;j<=i;j++) {
//				 System.out.print("*");			 
//				 }
//			 System.out.println();
//		 }
//		  
//		 *
//		 **
//		 ***
//		 ****
		 
		 
		 
		
//		 
//		 for(int i=row;i>=1;i--) {
//			 for(int j=i;j>=1;j--) {
//				 System.out.print("*");			 
//				 }
//			 System.out.println();
////		 }
////		 * * * * * 
////		 * * * * 
////		 * * * 
////		 * * 
////		 * 
///
	
//		  for (int i = 1; i <= row; i++) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print(j);
//	            }
//	            System.out.println();
//	        }
//		  for(int i=row;i>=0;i--) {
//				 for(int j=1;j<=i;j++) {
//					 System.out.print(i);			 
//					 }
//				 System.out.println();
//        	 }
//	1
//	12
//	123
//	1234
//	12345
//	55555
//	4444
//	333
//	22
//	1
		  

//		  for (int i = 1; i <= row; i++) {
//	            for (int j = i; j < row; j++) {
//	           
//	                System.out.print(" ");
//	            }
//	            for(int k=1;k<=(i*2-1);k++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//	
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;   
        int reversed = 0;

        while (n > 0) {//121//12
            int mod = n % 10;   //1           
            reversed = reversed * 10 + mod; 
            n = n / 10;   //12   //1               
        }

        if (temp == reversed) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not palindrome");
        }
		
				
        
        sc.close();
		
		 
	
	}     
	        
	 
}
