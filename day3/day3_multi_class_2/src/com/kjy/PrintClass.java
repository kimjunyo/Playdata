package com.kjy;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}

	public static void prn(BookClass[] books, int[] priceDC) {
		System.out.println("�δ� ��! ��ǻ�� �ŴϾƵ��� ���� å �˴ϴ�!");
		System.out.println("===========================================");
		for(int idx=0;idx<books.length;idx++) {
			System.out.println("\""+books[idx].title+"\" �� �ǸŰ�: "+priceDC[idx]+"��");
		}
	}
	public static void prnBooks(ArrayList<String> Books) {
		System.out.println("======================================");
		for(int idx=0;idx<Books.size();idx++) {
			System.out.println(Books.get(idx));
		}
	}
}
