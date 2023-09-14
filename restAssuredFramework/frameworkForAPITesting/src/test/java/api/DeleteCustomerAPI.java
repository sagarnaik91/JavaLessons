package api;

import static io.restassured.RestAssured.DEFAULT_BODY_ROOT_PATH;
import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import baseClass.BaseTest;
import io.restassured.response.Response;

public class DeleteCustomerAPI extends BaseTest {

	public static Response sendDeletRequestToDeleteCustomerAPIWithValidId(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("validSecretKey"), "")
				.delete(config.getProperty("endpoint") + "/" + table.get("id"));
		return res;
	}

}
