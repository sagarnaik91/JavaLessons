package utilityPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class DatUtilPracticeDraft1 {
	@Test(dataProvider = "user")
	public static void create(String name, String email, String description) {

		System.out.println(
				"name : " + name + "---" + "email : " + email + "---" + "description : " + description + "---");

	}

	@DataProvider(name = "user")
	public static Object getData() {
		ExcelReader excelReader = new ExcelReader(".\\src\\test\\java\\excel\\testdata.xlsx");
		int rows = excelReader.getRowCount(ConstantP.SHEET_NAME);
		int cols = excelReader.getColumnCount(ConstantP.SHEET_NAME);
		System.out.println(rows + "---" + cols);
		Object[][] data = new Object[rows - 1][cols];
		for (int rowCount = 2; rowCount <= rows; rowCount++) {
			for (int colCount = 0; colCount < cols; colCount++) {
				data[rowCount - 2][colCount] = excelReader.getCellData(ConstantP.SHEET_NAME, colCount, rowCount);
				/*
				 * Object[][] data = new Object[2][3];
				 * data[0][0]
				 * data[0][1]
				 * data[0][2]
				 * data[1][0]
				 * data[1][1]
				 * data[1][2]
				 */
			}
		}
		return data;

	}

}
