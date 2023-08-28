package CollectionsPrograms2;

import java.util.HashSet;
import java.util.Set;

public class HashsetToArray {

	public static void main(String[] args) {
		Set<Character> set = new HashSet<>();
		set.add('e');
		set.add('o');
		set.add('i');
		Character[] s = new Character[set.size()];
		set.toArray(s);
		for (char s1 : s) {
			System.out.println(s1);
		}
		
		

	}

}
