package collectionsPrograms1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(9);
		set.add(10);
		set.add(7);
		set.add(2);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
