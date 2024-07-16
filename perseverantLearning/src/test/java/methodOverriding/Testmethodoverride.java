package methodOverriding;

public class Testmethodoverride {

	public static void main(String[] args) {
		SBI s = new SBI();
		Axis a = new Axis();
		UBI u = new UBI();
		System.out.println("sbi roi is :" + s.getInterest());
		System.out.println("axis roi is :" + a.getInterest());
		System.out.println("ubi roi is :" + u.getInterest());

	}

}
