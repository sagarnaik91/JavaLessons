package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//https://restcountries.com/v3.1/all
public class RestCountriesGETApi {
	@Test
	public static void getRequest() {
		RestAssured.baseURI = "https://restcountries.com";
		Response res = given().auth().basic("", "").get("/v3.1/name/Romania");
		int statusCode = res.getStatusCode();
		long time = res.getTime();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Response time is " + time);
		System.out.println(res.getHeaders());
		res.prettyPrint().toString();
		String country = res.jsonPath().getString("flags.png").toString();
		Assert.assertEquals(country, "[https://flagcdn.com/w320/ro.png]");
	}

}
