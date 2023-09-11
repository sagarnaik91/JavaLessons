package utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import baseClass.BaseTest;

public class DataUtil extends BaseTest {

	@DataProvider(name = "user")
	public Object[][] dataSets(Method m) {
		String sheetName = m.getName();
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

}
