package inheritanceEx3;

public class People extends Person{
	
	void details()
	{
		if(id==8)
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}

}
