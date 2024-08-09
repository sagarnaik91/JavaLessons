package exceptionHandling;

public class Pgm9 {

	public static void main(String[] args) {

		try {
			throw new UserDefinedException("Exception is caught");
		} catch (UserDefinedException ude) {
			System.out.println("Exception is handled");
			System.out.println(ude.getMessage());
		}

	}

}
