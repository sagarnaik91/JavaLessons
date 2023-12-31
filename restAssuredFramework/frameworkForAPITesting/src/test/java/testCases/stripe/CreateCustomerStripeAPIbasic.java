package testCases.stripe;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import listener.ExtentListeners;
import utilities.DataUtil;

//This class takes the data from the utilities.DataUtil
public class CreateCustomerStripeAPIbasic extends baseClass.BaseTest {
	@Test(dataProviderClass = DataUtil.class, priority = 1, dataProvider = "DataUtil")
	public static void cxCreationValidKey(String name, String email, String description) {
		//ExtentListeners.testReport.get().info(email);
		System.out.println("name is "+name);
		System.out.println("email is "+email);
		System.out.println("description is "+description);
		Response res = given().auth().basic(config.getProperty("validSecretKey"), "").formParam("name", name)
				.formParam("email", email).formParam("description", description).log().all().post("customers");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	@Test(dataProviderClass = DataUtil.class, priority = 2, dataProvider = "DataUtil")
	public static void cxCreationInvalidKey(String name, String email, String description) {
		Response res = given().auth().basic(config.getProperty("invalidSecretKey"), "").formParam("name", name)
				.formParam("email", email).formParam("description", description).post("customers");
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 401);

	}

}
