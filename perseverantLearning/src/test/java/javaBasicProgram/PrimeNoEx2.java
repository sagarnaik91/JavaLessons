package javaBasicProgram;

public class PrimeNoEx2 {

	public static void prime(int n) {
		int m = n / 2;
		int flag = 0;
		if (n == 1 || n == 0) {
			System.out.println(n + " is not a prime");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime");
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime");
			}
		}
	}

	public static void main(String[] args) {
		prime(4);

	}

}
