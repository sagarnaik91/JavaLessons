package arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(9);
		list.add(10);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
