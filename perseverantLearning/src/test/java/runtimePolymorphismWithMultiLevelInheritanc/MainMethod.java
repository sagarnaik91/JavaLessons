package runtimePolymorphismWithMultiLevelInheritanc;

public class MainMethod {

	public static void main(String[] args) {
		Animal a1, a2, a3;
		a1 = new Dog();
		a1.eat();
		a2 = new BabyDog();
		a2.eat();
		a3 = new Animal();
		a3.eat();

	}

}
