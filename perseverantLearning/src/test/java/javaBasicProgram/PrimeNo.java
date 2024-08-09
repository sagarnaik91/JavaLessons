package javaBasicProgram;

public class PrimeNo {

	public static void main(String[] args) {
		int n = 4;
		int m = n / 2;
		int flag = 0;
		if (n == 0 || n == 1) {
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

}
