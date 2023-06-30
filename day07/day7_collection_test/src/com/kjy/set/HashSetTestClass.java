package com.kjy.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestClass {
	public HashSetTestClass() {	
	// TODO Auto-generated constructor stub
	}
	public static void hashSetTest() {
//		Set<String> set=new HashSet<String>();
		HashSet<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set.size());
		
		/**전체 데이터 추출: Iterator로 변환 <=== Set.iterator()**/
		Iterator<String> list=set.iterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}//hashSetTest() END

}
