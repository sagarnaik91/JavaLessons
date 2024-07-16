package runtimePolymorphismWithMultiLevelInheritanc;

class ExBabyDog1 extends ExDog {
	public static void main(String args[]) {
		ExAnimal a = new ExBabyDog1();
		a.eat();
	}
}