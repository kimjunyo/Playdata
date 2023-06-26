package com.kjy;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}

	public static void prn(BookClass[] books, int[] priceDC) {
		System.out.println("싸다 싸! 컴퓨터 매니아들을 위한 책 팝니다!");
		System.out.println("===========================================");
		for(int idx=0;idx<books.length;idx++) {
			System.out.println("\""+books[idx].title+"\" 실 판매가: "+priceDC[idx]+"원");
		}
	}
	public static void prnBooks(ArrayList<String> Books) {
		System.out.println("======================================");
		for(int idx=0;idx<Books.size();idx++) {
			System.out.println(Books.get(idx));
		}
	}
}
