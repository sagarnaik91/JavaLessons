package testCases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.CreateCustomerAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;
import utilities.TestParameterization;

public class CreateCustomerStripeAPI extends BaseTest {
	@Test(dataProviderClass = TestParameterization.class, priority = 1, dataProvider = "getData")
	public static void cxCreationValidKey(Hashtable<String, String> table) {
		Response res = CreateCustomerAPI.sendPostRequestToCreateCustomerWithValidAuthKey(table);
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = TestParameterization.class, priority = 2, dataProvider = "getData")
	public static void cxCreationInvalidKey(Hashtable<String, String> table) {
		Response res = CreateCustomerAPI.sendPostRequestToCreateCustomerWithInValidAuthKey(table);
		res.prettyPrint();
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
