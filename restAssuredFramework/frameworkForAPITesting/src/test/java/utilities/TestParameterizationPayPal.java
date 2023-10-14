package utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseTest;

public class TestParameterizationPayPal extends BaseTest {
	

	@DataProvider
	public Object[][] getData(Method m) {
		int rows = paypalexcelReader.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are " + rows);
		String testName = m.getName();
		System.out.println("testName is " + testName);
		int testCaseRowNum = 1;
		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
			String TestCaseName = paypalexcelReader.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
			if (TestCaseName.equalsIgnoreCase(testName)) {
				break;
			}

		}
		System.out.println("Test case starts from row num: " + testCaseRowNum);
		int dataStartRowNum = testCaseRowNum + 2;
		int testRows = 0;
		while (!paypalexcelReader.getCellData(Constants.DATA_SHEET, 0, dataStartRowNum + testRows).equals("")) {
			testRows++;
		}
		System.out.println("TotalRows of data are : " + testRows);

		int colStartColNum = testCaseRowNum + 1;
		int testCols = 0;
		while (!paypalexcelReader.getCellData(Constants.DATA_SHEET, testCols, colStartColNum).equals("")) {
			testCols++;
		}
		System.out.println("Total cols are " + testCols);
		// Object[][] data = new Object[testRows][testCols];
		Object[][] data = new Object[testRows][1];
		int i = 0;

		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
			Hashtable<String, String> table = new Hashtable<>();
			for (int cNum = 0; cNum < testCols; cNum++) {
				String testData = paypalexcelReader.getCellData(Constants.DATA_SHEET, cNum, rNum);
				String colName = paypalexcelReader.getCellData(Constants.DATA_SHEET, cNum, colStartColNum);
				table.put(colName, testData);
			}
			data[i][0] = table;
			i++;

		}
		return data;
	}
}
