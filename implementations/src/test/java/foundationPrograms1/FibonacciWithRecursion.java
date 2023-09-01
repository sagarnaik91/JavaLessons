package foundationPrograms1;
//https://www.javatpoint.com/fibonacci-series-in-java
public class FibonacciWithRecursion {

	static int n1 = 0;
	static int n2 = 1;
	static int n3;

	public static void main(String[] args) {
		System.out.println(n1 + " " + n2);
		fibonacci(10);
	}

	public static void fibonacci(int num) {

		if (num > 0) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			fibonacci(num - 1);
		}

	}

}
