//unchecked exception
package exceptionHandling;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "abc";

		try {
			int y = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
