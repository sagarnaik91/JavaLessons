package testCases;

import java.util.Hashtable;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.DeleteCustomerAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;

public class DeleteCustomer extends BaseTest {
	@Test(dataProviderClass = utilities.TestParameterization.class, dataProvider = "getData")
	public static void deleteCustomer(Hashtable<String, String> table) {
		Response res = DeleteCustomerAPI.sendDeletRequestToDeleteCustomerAPIWithValidId(table);
		res.prettyPrint();
		System.out.println(res.statusCode());
		Assert.assertEquals(res.statusCode(), 200);
		String actual_id = res.jsonPath().getString("id");
		System.out.println(actual_id);
		Assert.assertEquals(actual_id, table.get("id"));
		JSONObject jsonObject = new JSONObject(res.asString());
		Assert.assertTrue(jsonObject.has("id"));
		System.out.println(jsonObject.get("deleted").toString());
	}

}
