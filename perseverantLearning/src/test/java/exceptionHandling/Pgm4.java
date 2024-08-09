//unchecked exception
package exceptionHandling;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		try {
			System.out.println(arr[3]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("Rest of the code");
	}

}
