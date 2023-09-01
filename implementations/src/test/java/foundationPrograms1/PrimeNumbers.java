package foundationPrograms1;
//https://www.javatpoint.com/prime-number-program-in-java
public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 1;
		int i;
		int m = num / 2;
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(num + " is a prime");
			}
		}

	}

}
