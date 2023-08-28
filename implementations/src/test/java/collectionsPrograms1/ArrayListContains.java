package collectionsPrograms1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContains {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(7);
		list.add(10);
		list.add(17);
		if(list.contains(19))
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}

	}

}
