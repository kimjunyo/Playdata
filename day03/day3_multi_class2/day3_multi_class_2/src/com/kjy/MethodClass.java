package com.kjy;

public class MethodClass {

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static int[] priceDC(BookClass[] books) {
		int[] priceDC=new int[books.length];
		for(int idx=0;idx<books.length;idx++) {
			priceDC[idx]=books[idx].price*(100-books[idx].dc)/100;
			//priceDC[idx]=books[idx].price*(1-(books[idx].dc*1.0)/100);
			//형 변환 보다 1.0곱하는게 더 빠름
		}
		return priceDC;
	}
}
