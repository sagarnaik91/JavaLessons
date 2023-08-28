package collectionsPrograms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToList {

	public static void main(String[] args) {
		char[] ch = new char[] { 'd', 'e', 'q', 'f' };
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
		}
		System.out.println("Size of array " + ch.length);
		System.out.println("Size of list " + list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
