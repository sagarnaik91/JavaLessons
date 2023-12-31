package utilityPractice;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Orders;
import pojo.Purchase_units;

public class PayPal {
	public static String client_Id = "AcC6jQ1POX_mMAQQfmxwPG_rWnew3WDohOjBzqeXS8Su0k_hgDHbEBwZyRep-Mgc2ex3XMH9g-ISZ9tU";
	public static String client_Secret = "EBBgyE7Y_21mL2Lf6CKmaMnAkLvfN5OQETE6m5SZAEElQ2tT6jMVb9Xb_mhjMzUJTxfFCxc_rX8w0xE0";
	public static String accesstoken;
	public static String id;

	@Test
	public static void getAccessToken() {
		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";

		Response res = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(client_Id, client_Secret).post("/v1/oauth2/token");
		res.prettyPrint();
		accesstoken = res.jsonPath().get("access_token").toString();
		System.out.println(accesstoken);

	}

	@Test(priority = 2, dependsOnMethods = "getAccessToken")
	public static void createOrder() {
		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
		ArrayList<Purchase_units> list = new ArrayList<>();
		list.add(new Purchase_units("USD", "101", "d9f80740-38f0-11e8-b467-0ed5f89f718b"));
		Orders body = new Orders("CAPTURE", list);
		/*
		 * String body = "{\r\n" + "  \"intent\": \"CAPTURE\",\r\n" +
		 * "  \"purchase_units\": [\r\n" + "    {\r\n" +
		 * "      \"reference_id\": \"d9f80740-38f0-11e8-b467-0ed5f89f718b\",\r\n" +
		 * "      \"amount\": {\r\n" + "        \"currency_code\": \"USD\",\r\n" +
		 * "        \"value\": \"100.00\"\r\n" + "      }\r\n" + "    }\r\n" + "  ]\r\n"
		 * + "}";
		 */
		Response res = given().contentType(ContentType.JSON).auth().oauth2(accesstoken).body(body).log().all()
				.post("/v2/checkout/orders");
		res.prettyPrint();
		Assert.assertEquals(res.jsonPath().getString("status"), "CREATED");
		id = res.jsonPath().getString("id");
	}

	@Test(priority = 3, dependsOnMethods = { "getAccessToken", "createOrder" })
	public static void getOrders() {
		RestAssured.baseURI = "https://api.sandbox.paypal.com";
		Response res = given().auth().oauth2(accesstoken).log().all().get("/v2/checkout/orders/" + id);
		res.prettyPrint();
		Assert.assertEquals(res.jsonPath().getString("id"), id);
	}

}
