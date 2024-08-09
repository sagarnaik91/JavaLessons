//finally block example
package exceptionHandling;

public class Pgm6 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		}

		catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("finally block always executed");

		}
		System.out.println("Rest of the code");

	}

}
