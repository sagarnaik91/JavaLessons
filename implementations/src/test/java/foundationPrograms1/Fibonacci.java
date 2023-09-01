package foundationPrograms1;
//n1+n2
//0+1+1+2+3+5+8..
//https://www.javatpoint.com/fibonacci-series-in-java
public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int num = 10;
		System.out.println(n1 + " " + n2);
		for (int i = 0; i < num; i++) {
			n3 = n1 + n2;//n3=0+1 i,e n3=1
			System.out.println(n3);
			n1 = n2;
			n2=n3;

		}

	}

}
//0 1 1 2