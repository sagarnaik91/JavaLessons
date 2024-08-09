package javaBasicProgram;

public class Factorial {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else
			return n * fact(n - 1);

	}

	public static void main(String[] args) {
		int a = fact(4);
		System.out.println(a);

	}

}
