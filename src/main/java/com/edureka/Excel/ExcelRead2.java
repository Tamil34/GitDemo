package com.edureka.Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException
	{
	File file=new File("C:\\Users\\tamilselvi.murugesan\\Downloads\\sample\\Book1.xlsx");
	FileInputStream fls=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fls);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	int rowcount=sheet.getPhysicalNumberOfRows();
	System.out.println("Total No of rows:"+rowcount);
	for(int i=0;i<rowcount;i++ )
	{
		System.out.println("Row"+ i + "data is:");
		int cellcount=sheet.getRow(i).getLastCellNum();
		for(int j=0;j<cellcount;j++)
		{
			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		}
		
	}
	wb.close();
	fls.close();
	}

}
