package foundationPrograms2;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 8, 9, 1 };
		checkLargestusingifelse(14, 4, 10);
		checkLargestUsingArray(arr);

	}

	public static void checkLargestusingifelse(int a, int b, int c) {

		if (a >= b && a >= c) {
			System.out.println(a + " is biggest");
		}

		else if (b >= a && b >= c) {
			System.out.println(b + " is biggest");
		} else {
			System.out.println(c + " is the largest");
		}

	}

	public static void checkLargestUsingArray(int[] arr) {

		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}

}
