package practice;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1 };
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
