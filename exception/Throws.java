package exception;

public class Throws {

	
//	Used in a method signature to declare that the method might throw certain exceptions.
//	It doesn’t throw anything itself — it just warns the caller: 
//		“If you call me, be ready to handle this exception.”
//    
		// Method declares it may throw ArithmeticException
    void div(int a, int b) throws ArithmeticException {
        int result = a / b; // division by zero will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Throws obj = new Throws();
        try {
            obj.div(10, 0); // ❌ division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
