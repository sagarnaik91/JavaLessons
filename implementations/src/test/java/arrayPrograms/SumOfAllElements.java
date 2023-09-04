package arrayPrograms;

public class SumOfAllElements {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[] { 3, 1, 5, 4, 9, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum is " + sum);

	}

}
