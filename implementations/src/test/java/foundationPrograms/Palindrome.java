package foundationPrograms;

public class Palindrome {
	public static void main(String args[]) {
		int n = 12222221;
		int temp;
		int sum = 0;
		temp = n;
		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
