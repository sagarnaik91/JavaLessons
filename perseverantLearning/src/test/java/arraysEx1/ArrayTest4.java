package arraysEx1;

public class ArrayTest4 {

	void min(int arr[]) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Smallest in array is " + min);

	}

	void max(int arr[]) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Largest number is " + max);

	}

}
