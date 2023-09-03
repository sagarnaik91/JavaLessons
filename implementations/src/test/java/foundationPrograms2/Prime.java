package foundationPrograms2;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		// checkPrime(4);
		// altcheckPrime(4);
		rangeofPrime(20);

	}

	public static void altcheckPrime(int a) {
		int m = a / 2;
		int i = 2;
		while (i <= m) {
			if (a % i == 0) {
				System.out.println("Number is not a prime");
				i++;
			} else {
				System.out.println("Number is prime");
			}
		}

	}

	public static void checkPrime(int a) {
		int temp;
		temp = a;
		int m = a / 2;
		int flag = 0;
		int i;
		for (i = 2; i <= m; i++) {
			if (temp % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println(i + " is prime");
		} else {
			System.out.println(i + " is not a prime");
		}
	}

	public static void rangeofPrime(int a) {
		List<Integer> prime=new ArrayList<Integer>();
		List<Integer> Notprime=new ArrayList<Integer>();
		int j = 2;
		int flag = 0;
		for (int i = 2; i <= a; i++) {
			flag = 0;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					j++;

				}

			}
			if (flag == 0) {
				prime.add(i);
			} else {
				Notprime.add(i);
			}

		}
		
		System.out.println("Below are prime numbers");
		System.out.println(prime);
		System.out.println("Below are not prime numbers");
		System.out.println(Notprime);
	}

}
