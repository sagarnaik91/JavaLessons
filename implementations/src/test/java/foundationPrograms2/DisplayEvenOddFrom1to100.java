package foundationPrograms2;

import java.util.HashSet;
import java.util.Set;

public class DisplayEvenOddFrom1to100 {

	public static void main(String[] args) {
		display(100);
	}

	public static void display(int n) {
		int i = 1;
		Set<Integer> even = new HashSet<>();
		Set<Integer> odd = new HashSet<>();
		while (i <= n) {
			if (i % 2 == 0) {
				even.add(i);
				i++;
			} else {
				odd.add(i);
				i++;
			}
		}
		System.out.println("Even");
		System.out.println(even);
		System.out.println("Odd");
		System.out.println(odd);

	}

}
