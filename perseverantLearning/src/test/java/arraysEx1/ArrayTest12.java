package arraysEx1;

public class ArrayTest12 {

	public static void main(String[] args) {
		char[] ch1 = { 'a', 'f', 's', 'g' };
		char[] ch2 = ch1.clone();
		for (char char1 : ch1) {
			System.out.println(char1);
		}

		for (char char2 : ch2) {
			System.out.println(char2);
		}
		
		System.out.println(ch1.equals(ch2));

	}

}
