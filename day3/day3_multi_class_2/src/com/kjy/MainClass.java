package com.kjy;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc=new DataClass();
		int[] priceDC=MethodClass.priceDC(dc.books);
		PrintClass.prn(dc.books,priceDC);
		String authorInput="∞Ì∞Ê»Ò";
		ArrayList<String> Books=MethodClass.searchBook(authorInput, dc.books);
		PrintClass.prnBooks(Books);
	}

}
