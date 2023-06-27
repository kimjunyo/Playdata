package com.kjy;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}

	public static void prn(ArrayList<BookClass> books, ArrayList<Integer> priceDC) {
		System.out.println("싸다 싸! 컴퓨터 매니아들을 위한 책 팝니다!");
		System.out.println("================상품 목록=================");
		for(int idx=0;idx<books.size();idx++) {
			System.out.println("\""+books.get(idx).title+"\" 실 판매가: "+priceDC.get(idx)+"원");
		}
	}
	public static void prnBooks(ArrayList<String> Books) {
		System.out.println("============= 도서 ================");
		for(int idx=0;idx<Books.size();idx++) {
			System.out.println(Books.get(idx));
		}
	}
}
