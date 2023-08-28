package stringPrograms;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		String s;
		String[] arr = new String[] { "My", "name", "is", "sagar" };
		System.out.println(Arrays.toString(arr));
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]+" ");
		}
		System.out.println(sb.toString());

	}

}
