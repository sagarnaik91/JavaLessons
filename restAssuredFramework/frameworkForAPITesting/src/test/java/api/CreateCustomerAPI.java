package api;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import baseClass.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateCustomerAPI extends BaseTest {

	public static Response sendPostRequestToCreateCustomerWithValidAuthKey(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("validSecretKey"), "")
				.formParam("name", table.get("name")).formParam("email", table.get("email"))
				.formParam("description", table.get("description")).log().all().post(config.getProperty("endpoint"));
		return res;
	}

	public static Response sendPostRequestToCreateCustomerWithInValidAuthKey(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("invalidSecretKey"), "")
				.formParam("name", table.get("name")).formParam("email", table.get("email"))
				.formParam("description", table.get("email")).log().all().post(config.getProperty("endpoint"));
		return res;
	}

}
