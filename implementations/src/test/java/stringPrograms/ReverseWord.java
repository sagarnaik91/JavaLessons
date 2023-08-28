package stringPrograms;

public class ReverseWord {

	public static void main(String[] args) {

		String word = "word";
		char[] ch = word.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
			
		}
		System.out.println(sb);

	}

}
