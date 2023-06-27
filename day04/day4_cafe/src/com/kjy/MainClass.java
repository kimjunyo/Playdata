package com.kjy;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		DataClass dc=new DataClass();
		ArrayList<CafeClass> items=MethodClass.cafesort(dc.cafe);
		ArrayList<String> cafeMenu=MethodClass.cafeMenu(items);
		int[] seller=MethodClass.Seller(cafeMenu, items);
		PrintClass.prnBest(seller, cafeMenu);
		
		
	}
}
