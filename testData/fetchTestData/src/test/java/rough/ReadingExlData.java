package rough;

import org.apache.poi.util.SystemOutLogger;

import utilities.ExcelReader;

public class ReadingExlData {

	public static void main(String[] args) {

		ExcelReader excel = new ExcelReader(
				".\\src\\test\\java\\testData\\BankManagerSuite.xlsx");
		int rows = excel.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are " + rows);
		String testName = "AddCustomerTest";
		int testCaseRowNum = 1;
		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
			String TestCaseName = excel.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
			if (TestCaseName.equalsIgnoreCase(testName)) {
				break;
			}

		}
		System.out.println("Test case starts from row num: " + testCaseRowNum);
		int dataStartRowNum = testCaseRowNum + 2;
		int testRows = 0;
		while (!excel.getCellData(Constants.DATA_SHEET, 0, dataStartRowNum + testRows).equals("")) {
			testRows++;
		}
		System.out.println("TotalRows of data are : " + testRows);

		int colStartColNum = testCaseRowNum + 1;
		int testCols = 0;
		while (!excel.getCellData(Constants.DATA_SHEET, testCols, colStartColNum).equals("")) {
			testCols++;
		}
		System.out.println("Total cols are " + testCols);
		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
			for (int cNum = 0; cNum < testCols; cNum++) {
				System.out.println(excel.getCellData(Constants.DATA_SHEET, cNum, rNum));

			}
		}

	}

}
