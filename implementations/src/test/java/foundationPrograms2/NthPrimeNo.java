package foundationPrograms2;

import java.util.Scanner;

public class NthPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int num = 1;
		int count = 0;
		int i;
		while (count < n) {
			num = num + 1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count++;
			}
		}
		System.out.println(num);
	}

}
