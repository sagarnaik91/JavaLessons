package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write2txtFile {

	public static void main(String[] args) {
		try {
			String text = "abcdefghijklmnopqrstuvwxyz";
			char[] ch = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
			FileWriter fw = new FileWriter("C:\\Users\\003BF8744\\Documents\\DBS\\text.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ch,1,3);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
