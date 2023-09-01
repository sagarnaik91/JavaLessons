package foundationPrograms2;

//https://www.javatpoint.com/automorphic-number-program-in-java
public class Automorphic {

	public static boolean isAutomorphic(int num) {
		int temp;
		int square = num * num;
		temp = num;
		System.out.println(num);
		System.out.println(temp);
		int r;
		while (temp > 0) {
			if (temp % 10 != square % 10) {
				return false;
			}
			temp = temp / 10;
			square = square / 10;
		}
		System.out.println("something");
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isAutomorphic(76));
	}

}
