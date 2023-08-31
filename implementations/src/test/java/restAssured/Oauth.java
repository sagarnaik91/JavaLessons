package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth {

	// getAuthCode

	public static String clientId = "some_client_id";
	public static String redirectUri = "redirectUri ";
	public static String scope = "scope";
	public static String username = "uname";
	public static String password = "pwd";

	public static String getCode() {
		RestAssured.baseURI = "";
		Response response = given().auth().basic(username, password).formParam("responseType", "code")
				.queryParam("client_id", "clientId").queryParam("scope", "scope").post("");
		String code = response.jsonPath().getString("code");
		return code;

	}

	public static String getAccessToken() {
		Response response1 = given().auth().basic("", "").queryParam("code", getCode())
				.queryParam("redirect_url", "redirect_url").queryParam("grant_type", "grant_type").post("");
		String b = response1.jsonPath().getString("access_token");
		return b;
	}

	@Test
	public static void getUser() {
		Response response3 = given().auth().basic("Authorization", "Bearer " + getAccessToken()).get("");
		response3.prettyPrint();
		response3.jsonPath().getString("");
	}

}
