package Array;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Lecture 11
		//Internal working of Array indexing
		//Formula with example
		//int[] arr={1,2,3,4};
		//           0 1 2 3 
		
		// address=1000 ,1004,1008,1012
		//arr[3]= base adddres +index*size of data type
		//arr[3]=1000+3*4
		//arr[3]=1012
		//arr[3]=4
		
		
	//Direct way	
//		int[] arr={1,2,3,4};
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+"-> ");
//		}

		
		
	// Uisng new Keyword	
//		int[] arr1=new int[5];
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=i+2;
//		}
//		for(int i=0;i<=arr1.length-1;i++) {
//			System.out.print(arr1[i]+"-> ");
//		}
	
	
		
	//sum of element in arrays
	
//		int[] arr={1,2,3,4};
//		int sum=0;
//		for(int i=0;i<=arr.length-1;i++) {
//			sum+=arr[i];
//		}
//		System.out.print("Sum of element in arrays is :"+sum);
		
		//Average of array
		
		
//		int[] arr={1,2,3,4};
//		int sum=0;
//	
//		int average;
//		for(int i=0;i<=arr.length-1;i++) {
//			sum+=arr[i];
//			
//			
//		}
//		
//		average=sum/arr.length;
//		System.out.println("Sum of element in arrays is :"+sum);
//		System.out.println("Average of  arrays is :"+average);
		
		
		// largest number in array
		
//		int[] array= {1,4,22,3,6,8,4,11};
//		int largest=array[0];
//		for(int i=1;i<array.length;i++) {
//			if(largest<array[i]) {
//				largest=array[i];
//			}
//		}
//		System.out.println("largest number in array is "+largest);
//		
		
		 //Smallest number
		
//		int[] array= {1,4,22,3,6,8,4,11};
//		int smallest=array[0];
//		for(int i=1;i<array.length;i++) {
//			if(smallest>array[i]) {
//				smallest=array[i];
//			}
//		}
//		System.out.println("smallest number in array is "+smallest);

		
		 int[] largeArray = {
		            1, 2, 3, 4, 5,
		            6, 7, 8, 9, 10,
		            11, 12, 13, 14, 15,
		            16, 17, 18, 19, 20,
		            21, 22, 23, 24, 25,27
		        };
		
//		 
//		 int evencount=0;
//		 int oddcount=0;
//		 
//		 for(int i=0;i<largeArray.length;i++) {
//			 if(largeArray[i]%2==0) {
//				 evencount++;
//			 }else {
//				 oddcount++;
//			 }
//		 }
//		 
//		 System.out.println("EVen count is :"+evencount);
//		 System.out.println("Odd count is :"+oddcount);

		
		 int[] arr = {
		            1, 2, 3, 4, 5,
		            6, 7, 8, 9, 10,
		            11, 12, 13, 14, 15,
		            16, 17, 18, 19, 20,
		            21, 22, 23, 24, 25,27
		        };
		
		 Scanner sc=new Scanner(System.in);
	
		 int search=sc.nextInt();
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==search) {
				 System.out.println("Number is found at index :"+i);
				 break;
			 }else
			 {
				 System.out.println("Number is not presewnt in array");
			 }
		 }
		 
		 
		 
	}
}
