package api.paypal;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import baseClass.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Orders;
import pojo.Purchase_units;

public class OrderAPI extends BaseTest {
	public static String client_Id = config.getProperty("paypalClientID");
	public static String client_Secret = config.getProperty("paypalSecret");
	public static String id;

	public static String getAccessToken() {
		String access_token = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(client_Id, client_Secret).post("/v1/oauth2/token").jsonPath().get("access_token").toString();
		return access_token;
	}

	public static Response createOrder(String accessToken) {
		ArrayList<Purchase_units> list = new ArrayList<>();
		list.add(new Purchase_units("USD", "101", "d9f80740-38f0-11e8-b467-0ed5f89f718b"));
		Orders body = new Orders("CAPTURE", list);
		Response response = given().contentType(ContentType.JSON).auth().oauth2(accessToken).body(body).log().all()
				.post("/v2/checkout/orders");
		id = response.jsonPath().getString("id");
		return response;
	}

	public static Response getOrders(String accessToken) {
		Response response = given().auth().oauth2(accessToken).log().all().get("/v2/checkout/orders/" + id);
		return response;
	}
}
