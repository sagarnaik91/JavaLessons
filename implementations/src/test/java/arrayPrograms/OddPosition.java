package arrayPrograms;

public class OddPosition {

	public static void main(String[] args) {
		int[] arr=new int[] {0,1,2,3,4,5,6};
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
