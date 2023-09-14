package utilityPractice;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import baseClass.BaseTest;
import io.restassured.response.Response;

public class API extends BaseTest {

	public static Response createWithValidKey(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("validSecretKey"), "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("email")).post("customers");
		return res;
	}
	public static Response createWithInvalidKey(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("invalidSecretKey"), "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("email")).post("customers");
		return res;
	}

}
