package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Props {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("inp.properties");
			int character;
			while ((character = fis.read()) != -1) {
				System.out.print((char) character);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
