package com.kjy.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {

	public ExcelReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static void excelRead() {
		String uri="C:\\filetest\\data.xls";
		
		File f=new File(uri);
		
		Workbook wb=null;
		try {
			wb=Workbook.getWorkbook(f);
			Sheet s=wb.getSheet(0);
			int n=0;
			while(true) {
				try{
					Cell c=s.getCell(0,n); //jxl
					System.out.println(c.getContents()); //강제 종료
					n++;
				}catch(Exception e) {
					break;
					}
			}
		} catch (BiffException e) { //xls, xlsx 확장자 오류
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		
	}
}
