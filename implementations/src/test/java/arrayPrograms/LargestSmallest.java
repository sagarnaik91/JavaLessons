package arrayPrograms;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 9, 6, 7 };
		largest1approach(arr);
		largest2approach(arr);
		smallest1approach(arr);
		smallest2approach(arr);
	}

	public static void largest1approach(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("largest is " + max);

	}

	public static void largest2approach(int[] arr) {
		Arrays.sort(arr);
		System.out.println("largest is " + arr[arr.length - 1]);
	}

	public static void smallest1approach(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum is " + min);

	}

	public static void smallest2approach(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Minimum is " + arr[0]);
	}

}
