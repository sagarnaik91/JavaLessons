package staticExample;

public class CounterWithStatic {
	static int counter = 0;

	CounterWithStatic() {
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {
		CounterWithStatic c1 = new CounterWithStatic();
		CounterWithStatic c2 = new CounterWithStatic();
		CounterWithStatic c3 = new CounterWithStatic();

	}

}
