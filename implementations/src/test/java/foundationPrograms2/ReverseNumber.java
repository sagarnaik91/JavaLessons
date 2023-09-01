package foundationPrograms2;
//https://www.javatpoint.com/how-to-reverse-a-number-in-java
public class ReverseNumber {

	public static void main(String[] args) {
		int n = 143;
		int temp;
		int r = 0;
		temp = n;
		int revNum = 0;
		while (temp > 0) {
			r = temp % 10;
			revNum = (revNum * 10) + r; 
			temp = temp / 10;
		}
		System.out.println(revNum);

	}

}
