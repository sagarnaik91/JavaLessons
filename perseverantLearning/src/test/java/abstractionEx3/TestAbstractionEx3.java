package abstractionEx3;

public class TestAbstractionEx3 {

	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank ubi = new UBI();
		System.out.println("SBI ROI is :" + sbi.getROI());
		System.out.println("UBI ROI is :" + ubi.getROI());

	}

}
