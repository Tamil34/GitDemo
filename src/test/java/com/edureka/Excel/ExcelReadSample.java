package com.edureka.Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelReadSample {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\tamilselvi.murugesan\\Downloads\\sample\\Book1.xlsx";
		FileInputStream fls=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String cellvalue=cell.getStringCellValue();
		System.out.println("Cell Value:"+cellvalue);
		wb.close();
		fls.close();
	}

}
