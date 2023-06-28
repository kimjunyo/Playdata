package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileMethodClass {

	public FileMethodClass() {
		
	}

//	public static void filewrite(String uri) {
//		FileWriter fw=null;
////		fw=new FileWriter(uri); //throws 처리 하게 되면 다른 클래스에서 쓸 때 거기서도 throws 해야함
//		try {
//			fw=new FileWriter(uri);
//			fw.write("너무 졸려\n너무 졸려\n너무 졸려\n");
//			fw.close();
//		} catch (IOException e) {
//			System.out.println(" FileWriter ==> "+e.getMessage());
//		} //try catch하면 메서드 외부에서는 선언할 필요 없음
//	} //filewrite() END
//	 
//	public static void fileread(String uri) {
//		FileReader fr=null;
//		BufferedReader br=null;
//		try {
//			fr=new FileReader(uri);
//			br=new BufferedReader(fr);
//			String temp="";
//			while((temp=br.readLine())!=null) {
//				System.out.println(temp);
//			}
//			br.close();
//			fr.close();
//		} catch (FileNotFoundException e) { //Exception으로 기억해도 ㄱㅊ
//			System.out.println(" FileReader ==> "+e.getMessage());
//		} catch (IOException e) {
//			System.out.println(" FileReader ==> "+e.getMessage());
//		}
//	}
	public static int[] fileread(String uri,ArrayList<String> words) {
		int[] counts=new int[words.size()];
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(uri);
			br=new BufferedReader(fr);
			String temp="";
			while((temp=br.readLine())!=null) {
				String[] splitLine=temp.split(" ");
				for(int idx=0;idx<splitLine.length;idx++) {
					for(int n=0;n<words.size();n++) {
						if(splitLine[idx].contains(words.get(n))) {
							counts[n]++;
						}
					}
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) { //Exception으로 기억해도 ㄱㅊ
			System.out.println(" FileReader ==> "+e.getMessage());
		} catch (IOException e) {
			System.out.println(" FileReader ==> "+e.getMessage());
		}
		return counts;
	}
	public static String createHTML(ArrayList<String> words,int[] counts) {
		String tags="";
		tags+="<html><head><title>검색 결과</title></head>";
		tags+="<body>";
		for(int i=0;i<counts.length;i++) {
			tags+=words.get(i)+": "+counts[i];
			tags+="<br />";
		}
		tags+="</body>";
		tags+="</html>";
		
		return tags;
	}
}
