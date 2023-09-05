package arrayPrograms;

import java.util.Arrays;

public class ThirdHighestInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 6, 1, 9, 7, 8 };
		int len = arr.length;
		int n = 2;
		nthHighest(arr, len, n);
		nthHighestAltApproach(arr,n);
	}

	public static void nthHighest(int[] arr, int length, int nth) {
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
		System.out.println(arr[length - nth]);
	}

	public static void nthHighestAltApproach(int[] arr, int nth) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - nth]);
	}

}
