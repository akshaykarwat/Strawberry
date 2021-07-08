package finalpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceeader {

	public static String kj(int row, int col) throws Throwable {
		String path = System.getProperty("user.dir") + "\\test data\\Book1.xlsx";
		File fis = new File(path);
		FileInputStream fi = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh1 = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();

		String k = df.formatCellValue(sh1.getRow(row).getCell(col));
		System.out.println(k);
		return k;
	}

	public static void mp(int row, int col) throws Throwable {
		String path = System.getProperty("user.dir") + "\\test data\\Book1.xlsx";
		File fis = new File(path);
		FileInputStream fi = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh1 = wb.getSheetAt(0);

		File fix = new File(path);
		FileOutputStream fos = new FileOutputStream(fix);

		sh1.getRow(row).getCell(col).setCellValue("akshay");

		wb.write(fos);

	}
	

	public static void main(String[] args) throws Throwable {
		exceeader.mp(0, 1);
		exceeader.kj(0, 1);
	}

}
