package testCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import utilities.DataUtil;

//This class takes the data from the utilities.DataUtil
public class CreateCustomerStripeAPIbasic extends baseClass.BaseTest {
	@Test(dataProviderClass = DataUtil.class, priority = 1, dataProvider = "DataUtil")
	public static void cxCreationValidKey(String name, String email, String description) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").formParam("name", name)
				.formParam("email", email).formParam("description", description).post("customers");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = DataUtil.class, priority = 2, dataProvider = "DataUtil")
	public static void cxCreationInvalidKey(String name, String email, String description) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc123", "").formParam("name", name)
				.formParam("email", email).formParam("description", description).post("customers");
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
