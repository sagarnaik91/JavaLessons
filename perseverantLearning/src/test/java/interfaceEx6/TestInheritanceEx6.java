package interfaceEx6;

public class TestInheritanceEx6 implements Showable {

	public void print() {
		System.out.println("print method implementation");
	}

	public void show() {
		System.out.println("show method implementation");
	}

	public static void main(String[] args) {
		TestInheritanceEx6 ex6 = new TestInheritanceEx6();
		ex6.print();
		ex6.show();
	}

}
