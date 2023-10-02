package utilityPractice;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practicePojo1.Order;
import practicePojo1.Purchase_units;
import utilities.TestUtil;

public class PayPal2 {
	public static String client_id = "AcC6jQ1POX_mMAQQfmxwPG_rWnew3WDohOjBzqeXS8Su0k_hgDHbEBwZyRep-Mgc2ex3XMH9g-ISZ9tU";
	public static String client_secret = "EBBgyE7Y_21mL2Lf6CKmaMnAkLvfN5OQETE6m5SZAEElQ2tT6jMVb9Xb_mhjMzUJTxfFCxc_rX8w0xE0";
	public static String access_token;
	public static String id;

	@Test(priority = 1)
	public static void getAccessToken() {
		Response res = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(client_id, client_secret).post("https://api-m.sandbox.paypal.com/v1/oauth2/token");
		res.prettyPrint();
		access_token = res.jsonPath().getString("access_token");
		System.out.println(access_token);
	}

	@Test(priority = 2)
	public static void createOrder() {
		ArrayList<Purchase_units> list = new ArrayList<>();
		list.add(new Purchase_units("d9f80740-38f0-11e8-b467-0ed5f89f718b", "USD", "100"));
		Order body = new Order("CAPTURE", list);
		Response res = given().contentType(ContentType.JSON).auth().oauth2(access_token).body(body).log().all()
				.post("https://api-m.sandbox.paypal.com/v2/checkout/orders");
		res.prettyPrint();
		id = TestUtil.getKeyJsonPath(res, "id");
		System.out.println(id);

	}

	@Test(priority = 3)
	public static void getOrder() {
		RestAssured.baseURI = "https://api.sandbox.paypal.com";
		RestAssured.basePath = "v2/checkout/orders";
		Response res = given().auth().oauth2(access_token).log().all().get(id);
		res.prettyPrint();
	}

}
