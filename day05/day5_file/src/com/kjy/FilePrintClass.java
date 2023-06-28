package com.kjy;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrintClass {

	public FilePrintClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void saveHTML(String url,String tags) {
		FileWriter fw;
		try {
			fw=new FileWriter(url);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
