package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SendGetReq {
	@Test
	public void getReq() {
		Response res = given().get("https://petstore.swagger.io/v2/user/123");
		res.prettyPrint();
		System.out.println(res.statusCode());
		System.out.println(res.jsonPath().getMap("$").size());
	}

}
