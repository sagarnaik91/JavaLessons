package arrayPrograms;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 7, 2, 4, 3 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int a : arr2) {
			System.out.println(a);
		}

	}

}
