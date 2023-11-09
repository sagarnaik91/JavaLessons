package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestCountries {
	@Test
	public static void getCounty() {
		RestAssured.baseURI = "https://restcountries.com";
		RestAssured.basePath = "v3.1/name";
		Response res = given().get("india");
		res.prettyPrint();

	}

}
