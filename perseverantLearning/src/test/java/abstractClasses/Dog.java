package abstractClasses;

public class Dog extends Animal{
	
	void run()
	{
		System.out.println("running safely");
	}
	
	public static void main(String[] args)
	{
		Animal a = new Dog();
		a.run();
	}

}
