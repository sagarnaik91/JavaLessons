package testCases;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import listener.ExtentListeners;
import utilities.TestParameterization;

public class CreateCustomerStripeAPI2 extends baseClass.BaseTest {
	@Test(dataProviderClass = TestParameterization.class, priority = 1, dataProvider = "getData")
	public static void cxCreationValidKey(Hashtable<String, String> table) {
		//ExtentListeners.testReport.get().info(table.toString());
		Response res = given().auth().basic(config.getProperty("validSecretKey"), "").formParam("name", table.get("name"))
				.formParam("email", table.get("email")).formParam("description", table.get("description")).post("customers");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = TestParameterization.class, priority = 2, dataProvider = "getData")
	public static void cxCreationInvalidKey(Hashtable<String, String> table) {
		Response res = given().auth().basic(config.getProperty("invalidSecretKey"), "")
				.formParam("name", table.get("name")).formParam("email", table.get("email"))
				.formParam("description", table.get("description")).post("customers");
		res.prettyPrint();
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
