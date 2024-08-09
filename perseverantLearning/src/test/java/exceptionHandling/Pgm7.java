package exceptionHandling;

public class Pgm7 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;// TODO Auto-generated method stub
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block always executed");

		}
		System.out.println("Rest of the code");

	}

}
