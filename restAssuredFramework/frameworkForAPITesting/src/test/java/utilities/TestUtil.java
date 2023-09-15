package utilities;

import org.json.JSONObject;

import io.restassured.response.Response;
import listener.ExtentListeners;

public class TestUtil {

	public static boolean hasKey(String json, String key) {
		JSONObject jsonObject = new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating the presence of the key " + key);
		return jsonObject.has(key);
	}

	public static String getKey(String json, String key) {
		JSONObject jsonObject = new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating the value of the key " + key);
		String keyValue = jsonObject.get(key).toString();
		return keyValue;
	}

	public static String getKeyJsonPath(Response res, String key) {
		return res.jsonPath().getString(key);
	}
}
