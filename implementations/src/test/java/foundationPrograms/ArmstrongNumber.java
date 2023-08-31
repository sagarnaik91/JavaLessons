package foundationPrograms;

//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
public class ArmstrongNumber {

	public static void main(String[] args) {
		checkArmStrong(153);
	}

	public static void checkArmStrong(int n) {
		int temp = 0;
		double sum = 0;
		int digits = 0;
		temp = n;
		while (temp > 0) {
			// identify the total number of digits in a number

			temp = temp / 10;
			digits++;

		}
		System.out.println("Digits are " + digits);
		temp = n;
		while (temp > 0) {
			int last = temp % 10;
			sum = sum + Math.pow(last, digits);
			temp = temp / 10;

		}
		System.out.println("Sum is "+sum);
		if (n == sum) {
			System.out.println("It is armstrong");
		} else {
			System.out.println("It is not armstrong");
		}

	}

}
