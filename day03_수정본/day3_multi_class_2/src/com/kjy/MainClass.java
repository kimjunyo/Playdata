package com.kjy;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc=new DataClass();
		ArrayList<Integer> priceDC=MethodClass.priceDC(dc.books);
		PrintClass.prn(dc.books,priceDC);
		
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("저자 입력: ");
		String authorInput=scan.next();
		ArrayList<String> Books=MethodClass.searchBook(authorInput, dc.books);
		PrintClass.prnBooks(Books);
	}

}
