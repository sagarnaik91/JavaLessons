package superInMethod;

public class Dog extends Animal {

	void eat() {
		System.out.println("eat method of sub class");
	}

	void bark() {
		System.out.println("bark method of subclass");
	}
	
	void work()
	{
		super.eat();
	}

}
