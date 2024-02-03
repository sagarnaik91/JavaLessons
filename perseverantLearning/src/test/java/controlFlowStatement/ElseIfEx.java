package controlFlowStatement;

public class ElseIfEx {

	public static void main(String[] args) {
		String s = "abc";
		int m = 5;
		if (s.equals("s")) {
			m = 1;

		} else if (s.equals("a")) {
			m = 2;
		} else if (s.equals("g")) {
			m = 3;
		} else {
			m = 4;
		}
		System.out.println(m);
	}

}
