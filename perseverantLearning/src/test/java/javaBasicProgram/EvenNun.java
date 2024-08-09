package javaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class EvenNun {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}
		System.out.println("Even number are" + (list));

	}

}
