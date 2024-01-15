package arrayListExample;

public class Autoboxing {

	public static void main(String[] args) {
		int var = 10;
		Integer obj = new Integer(var); // wrapping-->Autoboxing
		System.out.println(obj);

		int bd = obj; // unwrapping -->unboxing
		System.out.println("bd is ---" + bd);

	}

}
