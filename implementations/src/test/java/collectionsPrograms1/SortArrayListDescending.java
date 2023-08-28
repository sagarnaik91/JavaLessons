package collectionsPrograms1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListDescending {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("B");
		list.add("P");
		list.add("C");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}
