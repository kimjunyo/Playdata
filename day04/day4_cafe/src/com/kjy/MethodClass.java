package com.kjy;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<CafeClass> cafesort(ArrayList<CafeClass> cafe){
		ArrayList<CafeClass> Cafe=new ArrayList<CafeClass>();
		for(int idx=0;idx<cafe.size();idx++) {
			if(cafe.get(idx).getOrder_date().split(" ")[0].equals("2017-09-13")) {
				Cafe.add(cafe.get(idx));
			}
		}
		return Cafe;
	}
	
	public static ArrayList<String> cafeMenu(ArrayList<CafeClass> cafe) {
		ArrayList<String> cafeMenu=new ArrayList<String>();
		cafeMenu.add(cafe.get(0).getItem());
		boolean same=false;
		for(int m=0;m<cafe.size();m++) {
			for(int n=0;n<cafeMenu.size();n++) {
				if(cafeMenu.get(n).equals(cafe.get(m).getItem())) {
					same=true;
					break;
				}
			}
			if(!same) {
				cafeMenu.add(cafe.get(m).getItem());
			}
			same=false;
		}
		return cafeMenu;
	}
	
	public static int[] Seller(ArrayList<String> cafeMenu,ArrayList<CafeClass> cafe) {
		int[] seller=new int[cafeMenu.size()];
		for(int idx=0;idx<cafe.size();idx++) {
			for(int k=0;k<cafeMenu.size();k++) {
				if(cafeMenu.get(k).equals(cafe.get(idx).getItem())) {
					seller[k]++;
				}
			}
		}
		return seller;
	}
}
