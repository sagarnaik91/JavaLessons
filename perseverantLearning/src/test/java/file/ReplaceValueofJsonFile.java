package file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;

import org.json.JSONObject;

public class ReplaceValueofJsonFile {

	public static void main(String[] args) {
		try {
			String content = new String(
					Files.readAllBytes(Paths.get("C:\\Users\\003BF8744\\Documents\\DBS\\org.json")));
			JSONObject obj = new JSONObject(content);
			obj.put("email", Instant.now().getEpochSecond() + "@dbs.com");
			Files.write(Paths.get("C:\\Users\\003BF8744\\Documents\\DBS\\org.json"), obj.toString().getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
