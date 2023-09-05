package arrayPrograms;

public class SortAscDesc {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 1, 8, 7, 4, 3, 10 };
		asc(arr);
		desc(arr);
	}

	public static void asc(int[] arr) {
		System.out.println("Ascending order");
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
	}

	public static void desc(int[] arr) {
		System.out.println("Descending order");
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int y : arr) {
			System.out.print(y + " ");
		}
	}

}
