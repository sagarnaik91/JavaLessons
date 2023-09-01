package foundationPrograms1;

public class ObjectEquals {

	public static void main(String[] args) {

		Double x = new Double(123.45);
		Long l = new Long(34223);
		System.out.println(x.equals(l));
		System.out.println(x.equals(123.45));
		System.out.println(x);
		System.out.println(l);

	}

}
