package practice;

public class ArrayToString {

	public static void main(String[] args) {
		String[] str = { "My", "name", "is", "Sagar" };
		String s = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i] + " ");
		}
		System.out.println(sb);

	}

}
