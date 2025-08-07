package com.edureka.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSample2 {

	public static void main(String[] args) throws IOException {
		File file=new File ("C:\\Users\\tamilselvi.murugesan\\Downloads\\sample\\Book1.xlsx");
        FileInputStream fls=new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(fls);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        int rowcount=sheet.getPhysicalNumberOfRows();
        System.out.println("Total No Of Rows:"+rowcount);
        for(int i=0;i<rowcount;i++)
        {
        	System.out.println("Row"+i+"data is:");
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


