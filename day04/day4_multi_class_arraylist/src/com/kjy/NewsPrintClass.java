package com.kjy;

import java.util.ArrayList;

public class NewsPrintClass {

	public NewsPrintClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void prnURL(String press,ArrayList<String> url) {
		for(int idx=0;idx<url.size();idx++) {
			System.out.println(press+"의 링크주소: https://"+url.get(idx));
		}
	}
	public static void prnPress(ArrayList<String> Press) {
		System.out.print("출판사: ");
		for(int idx=0;idx<Press.size();idx++) {
			if(idx==Press.size()-1) {
				System.out.print(Press.get(idx));
			}else {
				System.out.print(Press.get(idx)+", ");
			}
		}
	}
}
