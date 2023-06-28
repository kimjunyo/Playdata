package com.kjy;

import java.io.FileWriter;
import java.io.IOException;

public class WordsPrintClass {
	public WordsPrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void saveHTML(String uri,String tags) {
		try {
			FileWriter fw=new FileWriter(uri);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
