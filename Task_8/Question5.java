package sheet1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question5 {

	public static void main(String[] args) {
		try {
			XSSFWorkbook book1 = new XSSFWorkbook("D:\\SQL.file.xlsx");
			XSSFSheet sheet = book1.getSheet("Sheet1");

			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(0).getLastCellNum();

			String[][] data = new String[rowcount][colcount];
			for (int i = 0; i < rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < colcount; j++) {
					XSSFCell cell = row.getCell(j);
					data[i][j] = cell.getStringCellValue();
					System.out.print(data[i][j] + " ");
				}
				System.out.println();

			}
			

			book1.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
