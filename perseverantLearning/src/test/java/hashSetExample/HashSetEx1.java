package hashSetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();
		set.add("Sagar");
		set.add("Naik");
		set.add("Naik");
		set.add("SMR Vinay Gateway");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String var = itr.next();
			if(var.equals("SMR Vinay Gateway"))
			{
				System.out.println(var);
			}
		}
		

	}

}
