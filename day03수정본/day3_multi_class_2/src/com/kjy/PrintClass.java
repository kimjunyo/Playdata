package com.kjy;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}

	public static void prn(ArrayList<BookClass> books, ArrayList<Integer> priceDC) {
		System.out.println("�δ� ��! ��ǻ�� �ŴϾƵ��� ���� å �˴ϴ�!");
		System.out.println("================��ǰ ���=================");
		for(int idx=0;idx<books.size();idx++) {
			System.out.println("\""+books.get(idx).title+"\" �� �ǸŰ�: "+priceDC.get(idx)+"��");
		}
	}
	public static void prnBooks(ArrayList<String> Books) {
		System.out.println("============= ���� ================");
		for(int idx=0;idx<Books.size();idx++) {
			System.out.println(Books.get(idx));
		}
	}
}
