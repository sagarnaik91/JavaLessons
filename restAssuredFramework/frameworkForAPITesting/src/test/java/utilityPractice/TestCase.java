package utilityPractice;

import java.util.Hashtable;

import org.testng.annotations.Test;

import baseClass.BaseTest;
import io.restassured.response.Response;

public class TestCase extends BaseTest {
	@Test(dataProviderClass = DatUtilPracticeDraft2.class, dataProvider = "user")
	public static void cxCreationValidKey(Hashtable<String, String> table) {
//		System.out.println("name : " + table.get("name") + "---" + "email : " + table.get("email") + "---"
//				+ "description : " + table.get("description") + "---");
		Response res = API.createWithValidKey(table);
		res.prettyPrint();

	}

	@Test(dataProviderClass = DatUtilPracticeDraft2.class, dataProvider = "user")
	public static void cxCreationInvalidKey(Hashtable<String, String> table) {
//		System.out.println("name : " + table.get("name") + "---" + "email : " + table.get("email") + "---"
//				+ "description : " + table.get("description") + "---");
		Response res = API.createWithInvalidKey(table);
		res.prettyPrint();


	}

}
