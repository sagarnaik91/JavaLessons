package restAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PayPal {

	static String clientId = "AcC6jQ1POX_mMAQQfmxwPG_rWnew3WDohOjBzqeXS8Su0k_hgDHbEBwZyRep-Mgc2ex3XMH9g-ISZ9tU";
	static String clientSecret = "EBBgyE7Y_21mL2Lf6CKmaMnAkLvfN5OQETE6m5SZAEElQ2tT6jMVb9Xb_mhjMzUJTxfFCxc_rX8w0xE0";
	public static String accessToken;
	public static String id;

	@Test(priority = 1)
	public static void getAccessToken() {

		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
		RestAssured.basePath = "v1/oauth2";
		Response res = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(clientId, clientSecret).log().all().post("token");
		res.prettyPrint();
		System.out.println("Response time is :" + res.time());
		res.then().header("Server", "nginx");
		res.then().assertThat().statusCode(200);
		accessToken = res.jsonPath().getString("access_token");
		System.out.println(accessToken);
	}

	@Test(priority = 2)
	public static void createOrder() {
		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
		RestAssured.basePath = "v2/checkout";
		ArrayList<Purchase_Units> list = new ArrayList();
		list.add(new Purchase_Units("d9f80740-38f0-11e8-b467-0ed5f89f718b", "USD", "100"));
		CheckOut body = new CheckOut("CAPTURE", list);
		Response res = given().contentType(ContentType.JSON).auth().oauth2(accessToken).body(body).log().all()
				.post("orders");
		res.prettyPrint();
		res.then().statusCode(201);
		res.time();
		String rel = res.jsonPath().get("links[1].rel").toString();
		System.out.println("rel is " + rel);
		id = res.jsonPath().getString("id");
	}

	@Test(priority = 3)
	public static void getOrder() {
		RestAssured.baseURI = "https://api.sandbox.paypal.com";
		RestAssured.basePath = "v2/checkout/orders";
		Response res = given().auth().oauth2(accessToken).log().all().get(id);
		res.prettyPrint();
	}

}
