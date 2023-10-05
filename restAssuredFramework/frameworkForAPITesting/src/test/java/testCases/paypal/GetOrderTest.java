package testCases.paypal;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.paypal.OrderAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;

public class GetOrderTest extends BaseTest{
	@Test
	public void getOrder()
	{
		String accessToken=OrderAPI.getAccessToken();
		Response response=OrderAPI.getOrders(accessToken);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
