package stringPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWordsInAFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\003BF8744\\Desktop\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		int count = 0;
		while ((line = br.readLine()) != null) {
			String[] str = line.split("");
			count = count + str.length;
		}
		System.out.println(count);

	}

}
