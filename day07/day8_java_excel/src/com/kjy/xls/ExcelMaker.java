package com.kjy.xls;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelMaker {

	public ExcelMaker() {
		// TODO Auto-generated constructor stub
	}
	
	public static void excelMaker() {
		String uri="C:\\filetest\\data.xls";
		
		//1. File 객체의 생성자를 이용하여 파일 경로를 전달
		File f=new File(uri); //File.class: java.io
		
		//2. 쓰기 용도의 엑셀 문서(Workbook) 객체 생성: jxl.jar
		WritableWorkbook wb=null;
		
		//엑셀 문서, 시트, 셀 순서로 만들기
		try {
			wb=Workbook.createWorkbook(f);
			WritableSheet s=wb.createSheet("첫번째", 0); //시트이름, 시트에 대한 index
			
			// 1. 텍스트: Label.class => new Label(열,행,글씨); 
			// 2. s.addCell(Label)
			
			for(int n=0;n<10;n++) {
				Label l=new Label(0,n,"데이터"+n); //"데이터0" jxl
				s.addCell(l);
			}//for() END
			wb.write();
			wb.close();
			System.out.println("액셀 파일 생성 완료");
		} catch (IOException e) {
			System.out.println(e.getMessage());// 외부 파일
		} // File 객체를 전달.
		catch (RowsExceededException e) {
			System.out.println(e.getMessage());// 행에
		} catch (WriteException e) {
			System.out.println(e.getMessage());// 쓰기
		}
	}

}
