package CollectionsPrograms2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayListConversion {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		List<Integer> llist = new LinkedList<>();
		llist.addAll(list);
		for(int n:llist)
		{
			System.out.println(n);
		}

	}

}
