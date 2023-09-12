package api;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import baseClass.BaseTest;
import io.restassured.response.Response;

public class CreateCustomerAPI extends BaseTest {

	public static Response sendPostRequestToCreateCustomerWithValidAuthKey(Hashtable<String, String> table) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("email")).post("customers");
		return res;
	}

	public static Response sendPostRequestToCreateCustomerWithInValidAuthKey(Hashtable<String, String> table) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc123", "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("email")).post("customers");
		return res;
	}

}
