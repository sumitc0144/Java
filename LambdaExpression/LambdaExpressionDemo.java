package LambdaExpression;



public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			InterfacesForAll.printable obj=()->System.out.println("Hello from Lambda Expression!");
			
			obj.show();
	}

}

//Use the interface type (Interfaces.Printable) instead of the class Interfaces.
//The lambda () -> { ... } provides the body for the single abstract method show().
//Call obj.show() to execute the lambda.