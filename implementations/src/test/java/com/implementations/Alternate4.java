package com.implementations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alternate4 {

	public static void main(String[] args) {
		String sa = "AcBabC";
		char[] ch = sa.toCharArray();
		System.out.println("Before sorting: " + Arrays.asList(ch));
		//Arrays.sort(ch, new AlphabeticComparator());
		
		System.out.println("After sorting: " + Arrays.asList(sa));
	}
}




