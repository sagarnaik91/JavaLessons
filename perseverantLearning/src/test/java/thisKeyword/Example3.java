package thisKeyword;

public class Example3 {

	Example3() {
		System.out.println("Hello Example3");
	}
	Example3(String y)
	{
		System.out.println(y);
	}

	Example3(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		Example3 ex = new Example3(10);

	}

}
