package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NaverMainClass {

	public static void main(String[] args) {
		//(1)
		String uri="C:\\filetest\\naver_news_stand_data_edit.txt";
		NaverDataClass naver=new NaverDataClass(uri);
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader("C:\\filetest\\words.txt");
			br=new BufferedReader(fr);
			String temp=br.readLine();
			ArrayList<String> words=new ArrayList<String>();
			words.add(temp);
			System.out.println(words.get(0));
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//(3)
		String tags=NaverMethodClass.createHTML(naver.news);
		
		//(4)
		String uri2="C:\\filetest\\naver.html";
		
		//(5)
		NaverPrintClass.saveHTML(uri2, tags);
	}

}
