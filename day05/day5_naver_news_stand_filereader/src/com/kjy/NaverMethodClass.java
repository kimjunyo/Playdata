package com.kjy;

import java.util.ArrayList;

public class NaverMethodClass {

	public NaverMethodClass() {
		
	}
	public static String createHTML(ArrayList<NaverNewsClass> news) {
		String table="";
		for(int m=0;m<news.size();m+=9) {
			table+=" <tr>\r\n";
			for(int idx=m;idx<m+9 && idx<news.size();idx++) {
				table=table+ " <td>\r\n"
						+ " <a href=\"https://"+news.get(idx).url+"\">"
						+ "<img src=\"./newsImages/"+news.get(idx).image+"\" /></a>\r\n"
						+ " </td>\r\n";
			}
			table+=" </tr>\r\n";
		}
		//for(NaverNewsClass nnc:news){nnc.image 등등;}
		String tags="<html><head><title>네이버 뉴스</title></head><body>\r\n"
				+ "<table border=\"1\">\r\n"
				+table
				+ "</table>\r\n"
				+ "</body></html>";
		
		return tags;
	}

}
