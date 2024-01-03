package loginTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class loginExcelUtility {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowCount;
	static int colCount;
	static String cellData;
	static double cellDataNum;

	public loginExcelUtility(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e1) {

			System.out.println(e1.getMessage());
		}
	}

	public static int getRowCount() {
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			// System.out.println(rowCount);

		} catch (Exception e1) {

			System.out.println(e1.getMessage());
		}
		return rowCount;
	}

	public static int getColCount() {
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			// System.out.println(colCount);

		} catch (Exception e1) {

			System.out.println(e1.getMessage());
		}
		return colCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

		} catch (Exception e1) {

			System.out.println(e1.getMessage());
		}
		return cellData;
	}

	public static double getCellDataNumber(int rowNum, int colNum) {
		try {

			cellDataNum = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

		} catch (Exception e1) {

			System.out.println(e1.getMessage());
		}
		return cellDataNum;
	}
}
