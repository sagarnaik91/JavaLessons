package stringPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MostRepeatedWordInAFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\003BF8744\\Desktop\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		List<String> list = new ArrayList<>();
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] str = line.split("\\W+");
			for (String word : str) {
				list.add(word);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			int max = 0;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
					
				}
			}
			if (max < count) {
				max = count;
				System.out.println(list.get(i));
			}
		}

	}

}
