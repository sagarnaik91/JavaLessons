package runtimePolymorphism;

public class BankExmain2_4 {

	public static void main(String[] args) {
		BankExample2_1 b;
		
		b = new BankExAxis2_2();
		System.out.println(b.getRateOfInterest());
		
		b =new BankExUbi2_3();
		System.out.println(b.getRateOfInterest());

	}

}
