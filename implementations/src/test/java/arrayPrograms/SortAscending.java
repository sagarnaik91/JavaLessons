package arrayPrograms;
//https://www.javatpoint.com/java-program-to-sort-the-elements-of-an-array-in-ascending-order
public class SortAscending {

	public static void main(String[] args) {
		int[] arr=new int[] {3,2,4,1,5,9,8};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}

	}

}
