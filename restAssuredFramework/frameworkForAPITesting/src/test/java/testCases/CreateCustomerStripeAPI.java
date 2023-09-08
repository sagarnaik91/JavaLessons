package testCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateCustomerStripeAPI extends baseClass.BaseTest {
	@DataProvider(name = "user")
	public Object[][] dataSets() {
		String sheetName = "createCustomerWithValidKey";
		int rows = excelReader.getRowCount(sheetName);
		int cols = excelReader.getColumnCount(sheetName);
		System.out.println("rows " + rows + " col: " + cols);
		Object[][] dataset = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				dataset[rowNum - 2][colNum] = excelReader.getCellData(sheetName, colNum, rowNum);
			}
		}
//      Object[][] dataset = new Object[1][3];
//		System.out.println("name is " + excelReader.getCellData(sheetName, 0, 2));
//		System.out.println("email is " + excelReader.getCellData(sheetName, 1, 2));
//		System.out.println("description is " + excelReader.getCellData(sheetName, 2, 2));
//      dataset[0][0] = excelReader.getCellData(sheetName, 0, 2);
//		dataset[0][1] = excelReader.getCellData(sheetName, 1, 2);
//		dataset[0][2] = excelReader.getCellData(sheetName, 2, 2);
		return dataset;
	}

	@Test(priority = 1, dataProvider = "user")
	public static void createCustomerWithValidKey(String name, String email, String description) {
		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").formParam("name", name)
				.formParam("email", email).formParam("description", description).post("customers");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 200);

	}

	// @Test(priority = 2, dataProvider = "user")
//	public static void createCustomerWithInvalidKey(String name, String email, String description) {
//		Response res = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc123", "").formParam("name", name)
//				.formParam("email", email).formParam("description", description).post("customers");
//		System.out.println(res.getStatusCode());
//		Assert.assertEquals(res.getStatusCode(), 401);
//
//	}

}
