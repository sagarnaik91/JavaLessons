package methodOverriding;

public class Car extends Vehicle {

	public void run() {
		System.out.println("Car is running safely");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.run();
	}
}
