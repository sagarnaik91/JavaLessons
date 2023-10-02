package stringPrograms;

public class TwoStringsAreSame {

	public static void main(String[] args) {
		String firstString = "My name is Sagar";
		String secondString = "my name is sagar";
		System.out.println(firstString.equalsIgnoreCase(secondString));
		System.out.println(firstString.compareToIgnoreCase(secondString));
//	System.out.println(firstString.compareToIgnoreCase(secondString));
	}

}
