package com.XYZcompany.ecommerce.Excelreader;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;




public class ExcelReader {
	
	XSSFWorkbook wb=null;
	FileInputStream fis=null;
	
	
		 
		 

public String[][] readMysheet(String path,String sheetname) throws IOException{
	  
	
	//initialize workbook
	fis=new FileInputStream(new File(path));
	wb=new XSSFWorkbook(fis);
	  
	//find out rowcount and column count  
	int rowcount=wb.getSheet(sheetname).getPhysicalNumberOfRows();  	       
	int columncount=wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();	  
    	   
	//define a 2D array
	String[][] data = new String[rowcount][columncount];
	   			
    	 
	//read all cell values
		for(int i=0;i<rowcount;i++){    			
			for(int j=0;j<columncount;j++){		
   		
   		
   			   
   				
   			      XSSFCell cell=wb.getSheet(sheetname).getRow(i).getCell(j);
   			      DataFormatter  formater=new DataFormatter();
   			      data[i][j]=formater.formatCellValue(cell);
   			
   			}    		
   		}
   		
		
   		return data;
		
	
	
	}
	
	


}
