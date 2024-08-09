package javaBasicProgram;

public class PrimeNoEx3 {

	public static void main(String[] args) {
		for (int n = 2; n < 10; n++) {
			System.out.println("n is--" + n);
			int m = n / 2;
			System.out.println("m is --" + m);
			for (int j = 2; j <= m; j++) {
				System.out.println("j is --" + j);
				if (n % j != 0) {
					System.out.println(n + " is a prime number");

				}
				break;

			}
		}

	}

}
