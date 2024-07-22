package interfaceEx7;
//default method in interface
interface Printable {

	void print();

	default void msg() {
		System.out.println("msg method is executed");
	}

}
