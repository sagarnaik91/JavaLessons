package thisKeyword;

public class Example4 {
	
	void m()
	{
		System.out.println(this);
	}
	void n()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		Example4 obj = new Example4();
		System.out.println(obj);
		obj.m();
		obj.n();		


	}

}
