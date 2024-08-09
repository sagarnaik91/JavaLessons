//checked exception
package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			PrintWriter pw = new PrintWriter("as.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");

	}

}
