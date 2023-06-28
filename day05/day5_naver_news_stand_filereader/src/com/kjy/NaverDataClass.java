package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NaverDataClass {
	ArrayList<NaverNewsClass> news=new ArrayList<NaverNewsClass>();
	public NaverDataClass() {
	}
	public NaverDataClass(String uri) {//파일 경로 전달 받는 생성자
		this.readData(uri);
	}
	
	public void readData(String uri) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(uri);
			br=new BufferedReader(fr);
			String temp="";
			while((temp=br.readLine())!=null) {
				String[] split=temp.split("\", \"");
				NaverNewsClass nnc=new NaverNewsClass(split[1],split[2]);
				news.add(nnc);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FilNotFoundException => "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException => "+e.getMessage());
		}
	}//readData() END

}
