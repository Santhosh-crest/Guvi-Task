package sheet1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question1 {

	public static void main(String[] args) {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");

		Object[][] data = { { "John Doe", 30, "john@test.com" }, { "Jane Doe", 28, "jane@test.com" },
				{ "Bob Smith", 35, "jacky@example.com" }, { "Swapnil", 37, "swapnil@example.com" } };

		int rowcount = 0;
		for (Object[] row1 : data) {
			XSSFRow row = sheet.createRow(rowcount++);
			int colcount = 0;
			for (Object col : row1) {
				XSSFCell cell = row.createCell(colcount++);
				if (col instanceof String) {
					cell.setCellValue((String) col);
				} else if (col instanceof Integer) {
					cell.setCellValue((Integer) col);
				}
			}
		}

		try (FileOutputStream output = new FileOutputStream("D:\\SQL.file.xlsx")) {
			book.write(output);
			book.close();
			System.out.println("Sucessful");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
