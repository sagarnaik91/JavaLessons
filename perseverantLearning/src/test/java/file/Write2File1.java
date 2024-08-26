package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write2File1 {

	public static void main(String[] args) {
		char[] ch = new char[] {'a','v','s','q'};
		try {
			FileWriter fw = new FileWriter("C:\\Users\\003BF8744\\Documents\\DBS\\text1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ch);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
