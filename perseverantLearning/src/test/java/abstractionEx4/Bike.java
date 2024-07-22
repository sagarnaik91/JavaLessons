package abstractionEx4;

abstract public class Bike {

	Bike() {
		System.out.println("Bike is created");
	}

	abstract public void run();

	void testMethod() {
		System.out.println("test method called");
	}

}
