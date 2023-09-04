package arrayPrograms;

public class RotateLeft {
	static int first;
	static int j;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 3;
		for (int y : arr) {
			System.out.println(y);
		}
		System.out.println("");
		for (int i = 0; i < 1; i++) {
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		for (int x : arr) {
			System.out.println(x);
		}

	}

}
