package com.implementations;

public class PrintAlphabets {

	public static void main(String args[]) {
		char ch = 97;
		do {
			System.out.print(ch + " ");
			ch++;
		} while (ch <= 122);
		System.out.println("");
		ch = 65;
		do {
			System.out.print(ch + " ");
			ch++;
		} while (ch <= 90);
	}

}
