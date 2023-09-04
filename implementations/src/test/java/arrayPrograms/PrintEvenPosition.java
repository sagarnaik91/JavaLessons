package arrayPrograms;

public class PrintEvenPosition {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 7, 6, 9, 10 };
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

}
