package exceptionHandling;

public class Pgm8 {

	public static void validate(int age) {

		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		} else {
			System.out.println("Eligible to vote");
		}

	}

	public static void main(String[] args) {
		validate(18);
		System.out.println("Rest of the code");

	}

}
