package superRealTimeEx;

public class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;

	}
	
	void display()
	{
		System.out.println(id+name+salary);
	}

}
