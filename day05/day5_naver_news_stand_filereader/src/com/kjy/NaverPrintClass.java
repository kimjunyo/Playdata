package com.kjy;

import java.io.FileWriter;
import java.io.IOException;

public class NaverPrintClass {

	public NaverPrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void saveHTML(String uri,String tags){
		try {
			FileWriter fw=new FileWriter(uri);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			System.out.println("IOException => "+e.getMessage());
		}
	};
}
