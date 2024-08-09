package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write2File {

	public static void main(String[] args) {
		try {
			String text = "ashdhhdfh";
			FileWriter fw = new FileWriter("C:\\Users\\003BF8744\\Documents\\DBS\\file.docx");
			BufferedWriter br = new BufferedWriter(fw);
			System.out.println("Writing to word document started");
			br.write(text);
			br.close();
			System.out.println("Writing to document completed");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
