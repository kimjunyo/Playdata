package com.kjy;

import java.util.ArrayList;

public class NewsMethodClass {

	public NewsMethodClass() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<String> searchNewsURL(String press, ArrayList<NewsClass> news) {
		ArrayList<String> url=new ArrayList<String>();
		for(int idx=0;idx<news.size();idx++) {
//			    경향신문 				안에		경향
			if(news.get(idx).press.contains(press)) {
				url.add(news.get(idx).url);
			}
		}
		return url;
	}
	
	public static ArrayList<String> sameRemove(ArrayList<NewsClass> news){
		ArrayList<String> c=new ArrayList<String>();
		String temp="";
		for(int idx=0;idx<news.size();idx++) {
			if(!temp.equals(news.get(idx).category)) {
				temp=news.get(idx).category;
				c.add(temp);
			}
		}
		return c;
	}
}
