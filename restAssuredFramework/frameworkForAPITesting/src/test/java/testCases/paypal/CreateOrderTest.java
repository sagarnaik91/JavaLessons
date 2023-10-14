package testCases.paypal;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.paypal.OrderAPI;
import baseClass.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import utilities.TestParameterizationPayPal;

public class CreateOrderTest extends BaseTest {
	@Test(dataProviderClass = TestParameterizationPayPal.class, dataProvider = "getData")
	public void createOrder(Hashtable<String, String> table) throws IOException {
		String accessToken = OrderAPI.getAccessToken();
		Response response = OrderAPI.createOrder(accessToken, table);
		response.prettyPrint();
		Assert.assertEquals(response.jsonPath().getString("status"), "CREATED");
		File file = new File(".\\src\\test\\java\\excel\\createOrderSchema.json");
		String createOrderSchema = org.apache.commons.io.FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(createOrderSchema));

	}
}
