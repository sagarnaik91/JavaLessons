package collectionsPrograms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToList2 {

	public static void main(String[] args) {
		String[] ch = { "asd", "gfr" };
		List<String> list = new ArrayList<>(Arrays.asList(ch));
		for (String s : list) {
			System.out.println(s);
		}

		Character[] ch1 = { 'a', 'd' };
		List<Character> list1 = new ArrayList<>(Arrays.asList(ch1));
		for (String s : list) {
			System.out.println(s);
		}
	}
}
