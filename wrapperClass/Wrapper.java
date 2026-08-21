package wrapperClass;

import java.util.*;
//a wrapper class is an object class that encapsulates a primitive data type
//(like int, char, boolean) into an object form. 
//This allows primitives to be used in places where only objects are allowed,
//such as collections (ArrayList, HashMap) or generics. 
//
//byte		Byte
//short		Short
//int		Integer
//long		Long
//float		Float
//double	Double
//boolean	Boolean
//char		Character

//Wrapper classes provide methods like
//compareTo(), equals(), toString(), and
//type conversion methods (intValue(), doubleValue()).


//Wrapper classes bridge the gap between primitive types and Java’s object-oriented features.

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		Integer obj = num;  // Autoboxing
		System.out.println(obj);  // Output: 10
		
		Integer obj1 = 20;
		int num1 = obj1;  // Unboxing
		System.out.println(num1);  // Output: 20
		
//		Using Wrapper In Collection
		
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(5);   // Autoboxing: int → Integer
	        list.add(10);
	        System.out.println(list);  // Output: [5, 10]

	}

}
