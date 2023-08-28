package collectionsPrograms1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArayListTraverse {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(5);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
