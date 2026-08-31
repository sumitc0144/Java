package exception;

public class tryfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            System.out.println("Inside try block");
	            int result = 10 / 0; // This will throw ArithmeticException
	        } finally {
	            System.out.println("Finally block always executes");
	        }
	}

}
