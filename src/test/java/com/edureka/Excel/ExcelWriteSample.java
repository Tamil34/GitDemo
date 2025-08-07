package com.edureka.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteSample {

	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Users\\tamilselvi.murugesan\\Downloads\\sample\\Book2.xlsx";
		FileInputStream fls=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of Rows:"+rowcount);
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.createCell(2);
			cell.setCellValue("WriteintoExcel");
		}
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		fos.close();
			
}

}
