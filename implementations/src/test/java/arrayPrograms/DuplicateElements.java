package arrayPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 2, 7, 8, 8, 3};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}

	}

}
