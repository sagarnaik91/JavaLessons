package controlFlowStatement;

public class BreakEx2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i+2; j++) {
				if (i == 2 & j == 2) {
					break;
				}
				System.out.println(i + "&" + j);
			}

		}

	}

}
