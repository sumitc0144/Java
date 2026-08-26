package exception;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr= {1,2,3,4};
			System.out.println(arr[4]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}

}
}
