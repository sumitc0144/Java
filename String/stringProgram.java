package String;

public class stringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lecture 13
		
//		string are created using two ways
//		using literal="",'';
//		 values are stores in String Constant Pool(SCP) present in
//		 Heap memory;
//		 if a value is alredy present in SCP it will take refernce.
//		 
//		 Heap -> SCP{if str="hello";
//		 	and str1="hello";
//		 	then it will not allocate new memmory because value is same therfore
//		 	str1=str;
//		 }
//		 
		 
//		using	new ;
//		 String str=new String("hello");
//		 its type is object which is stored in HEap 
		
		
		//String Function
		
//		 String str = "Hello Java";
//
//	        // 1. isEmpty()
//	        System.out.println("Is string empty? " + str.isEmpty());
//
//	        // 2. length()
//	        System.out.println("Length of string: " + str.length());
//
//	        // 3. charAt()
//	        System.out.println("Character at index 1: " + str.charAt(1));
//
//	        // 4. toUpperCase()
//	        System.out.println("Uppercase: " + str.toUpperCase());
//
//	        // 5. toLowerCase()
//	        System.out.println("Lowercase: " + str.toLowerCase());
//
//	        // 6. replace()
//	        System.out.println("Before replace: " +str);
//	        String replaced = str.replace("Java", "World");
//	        System.out.println("After replace: " + replaced);
//
//	        // 7. concat()
//	        String concatenated = str.concat(" Programming");
//	        System.out.println("After concat: " + concatenated);
	    
//	        String text = "I love Java programming.";
//
//	        // 1. contains()
//	        System.out.println("Contains 'Java'? " + text.contains("Java"));
//	       
//	        // 2. startsWith()
//	        System.out.println("Starts with 'Java'? " + text.startsWith("Java"));
//	      
//	        
//	        // 3. endsWith()
//	        System.out.println("Ends with 'programming.'? " + text.endsWith("programming."));
//	       
//	        
//	        // 4. indexOf()
//	        System.out.println("First index of 'Java': " + text.indexOf("Java"));
//	      
//	        // 5. lastIndexOf()
//	        System.out.println("Last index of 'Java': " + text.lastIndexOf("Java"));
//	       
//		 == (it compares content as well as memory location)
		//and .equals()=(it compare the content only)
		
//		String s1 = "Java";
//        String s2 = "Java";
//        String s3 = new String("Java");
//
//        // == compares references
//        System.out.println("s1 == s2: " + (s1 == s2));   // true (string pool because ""Java is already presnt 
//        //in String Constant Pool therefore it uses refrence of s1) 
//        System.out.println("s1 == s3: " + (s1 == s3));   // false (different objects)
//
//        // equals() compares content
//        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
//        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
	
		
		//lecture 14
		
//		String str = "HelloWorld";
//
//        // 1. toCharArray() → convert string into char array
//        char[] chars = str.toCharArray();
//        System.out.println("Characters in the string:");
//        for (char c : chars) {
//            System.out.print(c + " ");
//        }
//        System.out.println(); // newline
//
//        // 2. substring() → extract part of the string
//        String sub = str.substring(0, 5); // from index 0 to 4
//        System.out.println("Substring (0,5): " + sub);
//
//        // 3. equalsIgnoreCase() → compare strings ignoring case
//        String str2 = "helloworld";
//        if (str.equalsIgnoreCase(str2)) {
//            System.out.println(str + " is equal to " + str2 + " (ignoring case)");
//        } else {
//            System.out.println(str + " is NOT equal to " + str2 + " (ignoring case)");
//        }
//	
		//split
//		 String fruits = "apple banana orange";
//	        
//	        // Split by comma
//	        String[] items = fruits.split(" ");
//	        
//	        for (String item : items) {
//	            System.out.println(item);
//	        }
//		
		
		// compareTo function is used to campare 2 strings by there ASCII value
		//like
//		Hii=H->72
//		Hyy=H->72
//		thereforemove to next because first is same
//		Hii=H->72,i->105
//		Hyy=H->72,y->121
//		
		
		
		 String s1 = "Hii";
	        String s2 = "Hyy";
	       

	        System.out.println(s1.compareTo(s2)); //
	        System.out.println(s2.compareTo(s1));
	        
	        
	        // reversed
	        
	        String str = "Hiy";
	        String reversed = "";

	        // Loop from last character to first
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        System.out.println("Original: " + str);
	        System.out.println("Reversed: " + reversed);
		
		
	}

}
