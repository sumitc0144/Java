package operators;

public class OperatorDemol3_4 {

	public static void main(String[] args) {
		  int a = 22;
		  int b=15;
		  		// Arthimatic Operator
		  	int res1 = a+b; 
	        int res2 = a-b; 
	        int res3 = a*b; 
	        int res4 = a%b; 
	        int res5 =a/b;
	        
	        System.out.println("Results: " + res1 + ", " + res2 + ", " + res3 + ", " + res4 + ", " + res5);
	  
		    
		        
		        // Unary Operator
		        int res6 = --a; 
		        int res7 = ++a; 
		        int res8 = a--; 
		        int res9 = ++a; 
		        int res10= a--; 
		        System.out.println("Results: " + res6 + ", " + res7 + ", " + res8 + ", " + res9 + ", " + res10);
		        System.out.println("Final value of a: " + a);
		        
		        
		        //Assignment Operator
		        
		    	 b += a; 
		         b -= a; 
		          b*=a;
		        a/= b; 
		        a %=b;
		        
		        
			    
	}

}
