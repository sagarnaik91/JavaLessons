package interview;

import java.util.ArrayList;
import java.util.List;

//rearrange the array { 1, 0, 0, 1, 0, 1, 1, 0 } to { 0, 0, 0, 0, 1, 1, 1, 1 }
public class Class1 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0 };

		List<Integer> zerolist = new ArrayList<>();
		List<Integer> onelist = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zerolist.add(arr[i]);
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 1) {
				onelist.add(arr[j]);
			}
		}
		zerolist.addAll(onelist);
		System.out.println(zerolist);

		Integer[] arr1 = new Integer[arr.length];
		zerolist.toArray(arr1);
		for(int a:zerolist)
		{
			System.out.println(a);
		}
	}
}
