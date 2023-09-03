package foundationPrograms1;

public class ArmstrongCopy {

	public static void main(String[] args) {
		int num = 153;
		int temp = 0;
		double sum = 0;
		int digits = 0;
		temp = num;
		while (temp > 0) {
			int r = temp % 10;
			digits++;
			temp = temp / 10;
		}
		temp = num;
		while (temp > 0) {
			int r = temp % 10;
			sum = sum + Math.pow(r, digits);
			temp = temp / 10;
		}
		if (sum==num) {
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
