package com.implementations;

public class Reversing {

	public static void main(String[] args) {
		String rev="";
		String s = "AaaBbbCcc";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
