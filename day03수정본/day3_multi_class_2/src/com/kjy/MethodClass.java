package com.kjy;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Integer> priceDC(ArrayList<BookClass> books) {
		ArrayList<Integer> priceDC=new ArrayList<Integer>();
		for(int idx=0;idx<books.size();idx++) {
			priceDC.add(books.get(idx).price*(100-books.get(idx).dc)/100);
			//priceDC[idx]=books[idx].price*(1-(books[idx].dc*1.0)/100);
			//형 변환 보다 1.0곱하는게 더 빠름
		}
		return priceDC;
	}
	public static ArrayList<String> searchBook(String authorInput, ArrayList<BookClass> books) {
		ArrayList<String> Books=new ArrayList<String>();
		for(int idx=0;idx<books.size();idx++) {
			if(books.get(idx).author.contains(authorInput)) {
				Books.add(books.get(idx).title);
			}
		}
		return Books;
	}
}
