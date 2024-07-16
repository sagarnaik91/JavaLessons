package superInInstanceVariable;

public class Dog extends Animal{
	String colour = "Brown";

	void nature() {
		System.out.println("Current class colour is " + colour);
		System.out.println("Parent class colour is " + super.colour);
	}

}
