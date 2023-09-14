package utilityPractice;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import baseClass.BaseTest;

public class DatUtilPracticeDraft2 extends BaseTest {
	@DataProvider(name = "user")
	public static Object getData(Method m) {
		String sheetName = "testdata";
		String testCaseName = m.getName();
		int rows = excelReader.getRowCount(sheetName);
		int cols = excelReader.getColumnCount(sheetName);
		System.out.println(rows + "---" + cols);
		int testCaseRowNum = 1;
		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
			String testName = excelReader.getCellData(sheetName, 0, testCaseRowNum);
			if (testName.equals(testCaseName)) {
				break;
			}

		}
		System.out.println("Testcase row number is " + testCaseRowNum);

		int testDataStartRow = testCaseRowNum + 2;
		int testDataTotalRow = 0;
		int testDataCol = testCaseRowNum + 1;
		int testDataTotalCol = 0;
		while (excelReader.getCellData(sheetName, 0, testDataStartRow + testDataTotalRow) != "") {
			testDataTotalRow++;
		}
		System.out.println("Total test data are " + testDataTotalRow);

		while (excelReader.getCellData(sheetName, testDataTotalCol, testDataCol) != "") {
			testDataTotalCol++;
		}
		System.out.println("Total cols are " + testDataTotalCol);

		//Object[][] data = new Object[testDataTotalRow][testDataTotalCol];
		Object[][] data = new Object[testDataTotalRow][1];
		int i=0;
		for (int rowNum = testDataStartRow; rowNum < testDataStartRow + testDataTotalRow; rowNum++) {
			Hashtable<String, String> table = new Hashtable<>();
			for (int colNum = 0; colNum < testDataTotalCol; colNum++) {
				// data[rowNum - testDataStartRow][colNum] = excelReader.getCellData(sheetName,
				// colNum, rowNum);
				String value = excelReader.getCellData(sheetName, colNum, rowNum);
				String key = excelReader.getCellData(sheetName, colNum, testDataCol);
				table.put(key, value);

			}
			data[i][0]=table;
			i++;
		}

		return data;
	}

}
