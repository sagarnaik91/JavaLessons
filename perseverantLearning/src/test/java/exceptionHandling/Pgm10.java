package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Pgm10 {

	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader("");
		BufferedReader br = new BufferedReader(file);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");

	}

}
