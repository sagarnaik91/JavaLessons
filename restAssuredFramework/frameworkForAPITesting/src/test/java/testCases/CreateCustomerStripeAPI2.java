package testCases;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import utilities.TestParameterization;

public class CreateCustomerStripeAPI2 extends baseClass.BaseTest {
	@Test(dataProviderClass = TestParameterization.class, priority = 1, dataProvider = "getData")
	public static void cxCreationValidKey(Hashtable<String, String> table) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("email")).post("customers");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = TestParameterization.class, priority = 2, dataProvider = "getData")
	public static void cxCreationInvalidKey(Hashtable<String, String> table) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc123", "")
				.formParam("name", table.get("name")).formParam("email", table.get("email"))
				.formParam("description", table.get("email")).post("customers");
		res.prettyPrint();
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
