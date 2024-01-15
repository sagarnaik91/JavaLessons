package arrayListExample;

import java.util.ArrayList;
import java.util.List;
/**Type casting in listing***/
public class ArrayList1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(8);
		System.out.println(list);
		int bd = (Integer) list.get(0);
		System.out.println("bd is ----"+bd);

	}

}
