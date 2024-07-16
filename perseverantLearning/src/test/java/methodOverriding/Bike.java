package methodOverriding;

public class Bike extends Vehicle {

	public void run() {
		System.out.println("Bike is convinient to drive in traffic");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
	}

}
