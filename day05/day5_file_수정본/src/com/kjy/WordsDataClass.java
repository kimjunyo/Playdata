package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordsDataClass {
	ArrayList<String> words=new ArrayList<String>();
	public WordsDataClass() {
		// TODO Auto-generated constructor stub
	}
	
	public WordsDataClass(String uri) {
		readWords(uri);
	}
	
	public void readWords(String uri) {
		try {
			FileReader fr=new FileReader(uri);
			BufferedReader br=new BufferedReader(fr);
			String temp="";
			while((temp=br.readLine())!=null) {
				words.add(temp);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
