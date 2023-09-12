package practice;

public class ConvertArrayToString {

	public static void main(String[] args) {
		String[] str = { "My", "name", "is", "Sagar" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]+" ");
		}
		System.out.println(sb);

	}

}
