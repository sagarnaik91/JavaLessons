package foundationPrograms2;
//https://www.javatpoint.com/java-program-to-display-alternate-prime-numbers
public class AlternatePrime {

	public static void main(String[] args) {
		alternatePrime(20);
	}

	public static int checkPrime(int a) {
		int flag = 0;
		int temp = a;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return 1;// prime
		else
			return 0;
	}

	public static void alternatePrime(int num) {

		int temp = 2;
		for (int i = 2; i <= num - 1; i++) {
			if (checkPrime(i) == 1) {
				if (temp % 2 == 0) {
					System.out.print(i + " ");
				}
				temp++;

			}
		}

	}

}
