package testCases.paypal;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.paypal.OrderAPI;
import baseClass.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class GetOrderTest extends BaseTest {
	@Test
	public void getOrder() throws IOException {
		String accessToken = OrderAPI.getAccessToken();
		Response response = OrderAPI.getOrders(accessToken);
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
		File file = new File(".\\src\\test\\java\\excel\\getOrderSchema.json");
		String getOrderSchema = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(getOrderSchema));
	}

}
