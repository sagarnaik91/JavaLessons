package practice;

public class RotateLeft {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int temp = 0;
		int j = 0;
		for (int i = 0; i < 1; i++) {
			int first = arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];

			}
			arr[j] = first;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
