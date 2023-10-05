package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import utilities.ExcelReader;

public class BaseTest {
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static ExcelReader excelReader = new ExcelReader(".\\src\\test\\java\\excel\\testdata.xlsx");

	@BeforeSuite
	public static void setup() throws IOException {
		fis = new FileInputStream(
				"C:\\Users\\003BF8744\\testDevelopement\\java\\restAssuredFramework\\frameworkForAPITesting\\config.properties");
		config.load(fis);
		RestAssured.baseURI = config.getProperty("baseUri");
		//RestAssured.basePath = config.getProperty("basePath");

	}

}
