//unchecked exception
package exceptionHandling;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
