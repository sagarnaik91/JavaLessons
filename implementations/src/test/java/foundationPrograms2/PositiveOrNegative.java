package foundationPrograms2;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

	}

}
