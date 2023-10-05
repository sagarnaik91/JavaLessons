package testCases.paypal;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.paypal.OrderAPI;
import baseClass.BaseTest;
import io.restassured.response.Response;

public class CreateOrderTest extends BaseTest{
	@Test
	public void createOrder() {
		String accessToken = OrderAPI.getAccessToken();
		Response response=OrderAPI.createOrder(accessToken);
		Assert.assertEquals(response.jsonPath().getString("status"), "CREATED");
	}
}
