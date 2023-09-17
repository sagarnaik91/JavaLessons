package utilityPractice;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practicePojo.Checkout;
import practicePojo.Purchase_units1;

public class PayPal1 {

	public static String client_id = "AcC6jQ1POX_mMAQQfmxwPG_rWnew3WDohOjBzqeXS8Su0k_hgDHbEBwZyRep-Mgc2ex3XMH9g-ISZ9tU";
	public static String client_secret = "EBBgyE7Y_21mL2Lf6CKmaMnAkLvfN5OQETE6m5SZAEElQ2tT6jMVb9Xb_mhjMzUJTxfFCxc_rX8w0xE0";
	public static String access_token;

	@Test(priority = 1)
	public static void getAccessToken() {
		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
		Response res = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(client_id, client_secret).post("v1/oauth2/token");
		res.prettyPrint();
		access_token = res.jsonPath().getString("access_token");

	}

	@Test(priority = 2, dependsOnMethods = "getAccessToken")
	public static void createOrder() {
		RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
		ArrayList<Purchase_units1> list = new ArrayList<>();
		list.add(new Purchase_units1("a1f80740-38f0-11e8-b467-0ed5f89f718b", "USD", "101"));
		list.add(new Purchase_units1("a2f80740-38f0-11e8-b467-0ed5f89f718b", "USD", "102"));
		Checkout body = new Checkout("CAPTURE", list);
		Response res = given().contentType(ContentType.JSON).auth().oauth2(access_token).body(body).log().all()
				.post("v2/checkout/orders");
		res.prettyPrint();
	}
}
