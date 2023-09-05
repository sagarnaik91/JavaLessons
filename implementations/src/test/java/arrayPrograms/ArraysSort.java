package arrayPrograms;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 8, 2, 4, 5 };
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

}
