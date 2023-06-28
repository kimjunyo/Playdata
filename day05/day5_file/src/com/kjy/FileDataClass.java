package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileDataClass {
	ArrayList<String> words=new ArrayList<String>();
	public FileDataClass() {
	}
	public FileDataClass(String url) {
		this.readData(url);
	}
	public void readData(String url) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader(url);
			br=new BufferedReader(fr);
			String temp="";
			while((temp=br.readLine())!=null) {
				words.add(temp);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
