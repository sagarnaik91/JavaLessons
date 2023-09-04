package arrayPrograms;

public class RightRotate {

	public static void main(String[] args) {
		int n = 3;
		int j = 0;
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < n; i++) {
			int last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
