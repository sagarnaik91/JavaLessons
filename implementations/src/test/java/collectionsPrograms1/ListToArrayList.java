package collectionsPrograms1;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("avc");
		list.add("anc");
		list.add("der");
		String[] strArray = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			strArray[i] = list.get(i);
		}
		System.out.println("Size of List " + list.size());
		System.out.println("Size of arrayList " + strArray.length);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
