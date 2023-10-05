package testCases.stripe;

import java.util.Hashtable;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.stripe.DeleteCustomerAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;
import listener.ExtentListeners;
import utilities.TestUtil;

public class DeleteCustomer extends BaseTest {
	@Test(dataProviderClass = utilities.TestParameterization.class, dataProvider = "getData")
	public static void deleteCustomer(Hashtable<String, String> table) {
		Response res = DeleteCustomerAPI.sendDeletRequestToDeleteCustomerAPIWithValidId(table);
		res.prettyPrint();
		// ExtentListeners.testReport.get().info(table.toString());
		System.out.println(res.statusCode());
		/*
		 * Assert.assertEquals(res.statusCode(), 200); String actual_id =
		 * res.jsonPath().getString("id"); System.out.println(actual_id);
		 * Assert.assertEquals(actual_id, table.get("id")); JSONObject jsonObject = new
		 * JSONObject(res.asString()); Assert.assertTrue(jsonObject.has("id"));
		 * System.out.println(jsonObject.get("deleted").toString());
		 */
		/*
		 * System.out.println("id is " + TestUtil.getKey(res.asString(), "id"));
		 * System.out.println("object is " + TestUtil.getKey(res.asString(), "object"));
		 * System.out.println("deleted is " + TestUtil.getKey(res.asString(),
		 * "deleted")); Assert.assertEquals(TestUtil.getKey(res.asString(), "id"),
		 * table.get("id")); Assert.assertTrue(TestUtil.hasKey(res.asString(), "id"),
		 * "----Id is not present----");
		 */
		System.out.println("code is " + TestUtil.getKeyJsonPath(res, "error.code"));
	}

}
