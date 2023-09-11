package practice;

public class Palindrome {

	public static void main(String[] args) {
		int n = 151;
		int temp = n;
		int sum = 0;
		int r = 0;
		while (temp > 0) {
			r = temp % 10;
			System.out.println("remainder is "+r);
			sum = (sum * 10) + r;
			System.out.println("sum is "+sum);
			temp = temp / 10;
			System.out.println("temp is "+temp);
		}
		if (sum == n) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
	}

}
