package practice;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String s = "Sagar";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != '0') {
					count++;
					ch[j] = '0';
				}

			}
			if (count > 1 && ch[i] != '0') {
				System.out.println(ch[i] + " is repeated for " + count + " times");
			}

		}

	}

}
