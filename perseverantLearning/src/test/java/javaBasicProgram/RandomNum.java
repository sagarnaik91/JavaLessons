package javaBasicProgram;

public class RandomNum {

	public static void main(String[] args) {
		int min = 200;
		int max = 400;
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);

	}

}
