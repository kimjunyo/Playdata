package com.kjy;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}

	public static void prnBest(int[] seller,ArrayList<String> items) {
		int max=0;
		String bestseller="";
		for(int idx=0;idx<seller.length;idx++) {
			if(max<seller[idx]) {
				max=seller[idx];
				bestseller=items.get(idx);
			}
			System.out.println(items.get(idx)+"상품은 "+seller[idx]+"개 팔렸습니다.");
		}
		System.out.println("================================");
		System.out.println("가장 많이 판매된 상품은: "+bestseller);
		
	}
}
