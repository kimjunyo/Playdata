package com.kjy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordsMethodClass {
	public WordsMethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static int[] searchWords(String uri,ArrayList<String> words) {
		int[] counts=new int[words.size()];
		FileReader fr2;
		try {
			fr2 = new FileReader(uri);
			BufferedReader br2=new BufferedReader(fr2);
			String temp="";
			while((temp=br2.readLine())!=null) {
				String[] split=temp.split(" ");
				for(int i=0;i<split.length;i++) {
					for(int idx=0;idx<words.size();idx++) {
						if(split[i].contains(words.get(idx))) {
							counts[idx]++;
						}
					}
				}
			}
			br2.close();
			fr2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return counts;
	}
	public static String createHTML(int[] counts, ArrayList<String> words) {
		String tags="<html><head><title>검색 결과</title></head><body>";
		for(int idx=0;idx<counts.length;idx++) {
			tags+=words.get(idx)+": "+counts[idx]+"<br/ >";
		}
		tags+="</body></html>";
		return tags;
	}
}
