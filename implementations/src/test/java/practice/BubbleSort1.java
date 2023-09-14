package practice;

public class BubbleSort1 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1 };
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
