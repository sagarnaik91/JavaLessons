package thisKeyword;

public class Example1 {
	int a;
	int b;

	int multiply(int l, int b) {
		this.a = l;
		this.b = b;
		int y = a * b;
		return y;
	}

	public static void main(String[] args) {
		Example1 ex=new Example1();
		System.out.println(ex.multiply(4, 6));

	}

}
