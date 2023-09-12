package utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseTest;

public class TestParameterization extends BaseTest {
	@Test(dataProvider = "getData")
	/*public static void testData(Hashtable<String, String> data) {
		System.out.println(data.get("runmode") + "---" + data.get("firstname") + "---" + data.get("lastname") + "---"
				+ data.get("postcode") + "---");
	}*/
	/*
	 * @Test(dataProvider = "getData") public static void testData(String runmode,
	 * String firstname, String lastname, String postcode) {
	 * System.out.println(runmode + "---" + firstname + "---" + lastname + "---" +
	 * postcode + "---"); }
	 */

	@DataProvider
	public Object[][] getData(Method m) {

		// ExcelReader excel = new ExcelReader(
		// "C:\\Users\\003BF8744\\testDevelopement\\java\\testData\\fetchTestData\\src\\test\\java\\testData\\BankManagerSuite.xlsx");
		int rows = excelReader.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are " + rows);
		String testName = m.getName();
		System.out.println("testName is" + testName);
		int testCaseRowNum = 1;
		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
			String TestCaseName = excelReader.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
			if (TestCaseName.equalsIgnoreCase(testName)) {
				break;
			}

		}
		System.out.println("Test case starts from row num: " + testCaseRowNum);
		int dataStartRowNum = testCaseRowNum + 2;
		int testRows = 0;
		while (!excelReader.getCellData(Constants.DATA_SHEET, 0, dataStartRowNum + testRows).equals("")) {
			testRows++;
		}
		System.out.println("TotalRows of data are : " + testRows);

		int colStartColNum = testCaseRowNum + 1;
		int testCols = 0;
		while (!excelReader.getCellData(Constants.DATA_SHEET, testCols, colStartColNum).equals("")) {
			testCols++;
		}
		System.out.println("Total cols are " + testCols);
		// Object[][] data = new Object[testRows][testCols];
		Object[][] data = new Object[testRows][1];
		int i = 0;

		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
			Hashtable<String, String> table = new Hashtable<>();
			for (int cNum = 0; cNum < testCols; cNum++) {
				/*
				 * System.out.println(excel.getCellData(Constants.DATA_SHEET, cNum, rNum));
				 * data[rNum - dataStartRowNum][cNum] = excel.getCellData(Constants.DATA_SHEET,
				 * cNum, rNum);
				 */
				String testData = excelReader.getCellData(Constants.DATA_SHEET, cNum, rNum);
				String colName = excelReader.getCellData(Constants.DATA_SHEET, cNum, colStartColNum);
				table.put(colName, testData);
			}
			data[i][0] = table;
			i++;

		}
		return data;
	}
}
