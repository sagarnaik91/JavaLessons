package foundationPrograms1;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		checkPrime(20);

	}

	public static void checkPrime(int n) {
		int flag = 0;
		int i = 0;
		for (i = 0; i <= n; i++) {
			flag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					System.out.println(i + " is not a prime");
					flag = 1;
					break;
				}
				else if (flag == 0) {
					System.out.println(i + " is a prime");
					break;

				}

			}

		}

	}

}
