package com.kjy;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc=new DataClass();
		int[] priceDC=MethodClass.priceDC(dc.books);
		PrintClass.prn(dc.books,priceDC);
	}

}
