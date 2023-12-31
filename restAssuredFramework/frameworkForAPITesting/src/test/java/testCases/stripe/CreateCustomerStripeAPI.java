package testCases.stripe;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.stripe.CreateCustomerAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;
import listener.ExtentListeners;
import utilities.TestParameterization;

public class CreateCustomerStripeAPI extends BaseTest {
	@Test(dataProviderClass = TestParameterization.class, priority = 1, dataProvider = "getData")
	public static void cxCreationValidKey(Hashtable<String, String> table) {
		Response res = CreateCustomerAPI.sendPostRequestToCreateCustomerWithValidAuthKey(table);
		// ExtentListeners.testReport.get().info(table.toString());
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = TestParameterization.class, priority = 2, dataProvider = "getData")
	public static void cxCreationInvalidKey(Hashtable<String, String> table) {
		Response res = CreateCustomerAPI.sendPostRequestToCreateCustomerWithInValidAuthKey(table);
		// ExtentListeners.testReport.get().info(table.toString());
		res.prettyPrint();
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
