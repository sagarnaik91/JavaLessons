package foundationPrograms;

public class SwapNumber {
	static int temp;

	public static void main(String[] args) {
		withThirdVariable(8, 2);
		withoutThirdVariable(8,2);
	}

	public static void withThirdVariable(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a is " + a + " b is " + b);

	}
	
	public static void withoutThirdVariable(int a, int b)
	{
		// a should be 20 and b should be 10
		a=a+b; //a=30
		b=a-b;// this will give 20
		a=a-b;
		System.out.println("a is "+a+" b is "+b);
		
		
	}

}
