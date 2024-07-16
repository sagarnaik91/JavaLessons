package thisKeyword;

public class Example2 {
	int a;

	void m() {
		System.out.println("m methd running");
	}

	void n() {
		this.m();
		System.out.println("n methd running");
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();
		ex.n();

	}

}
