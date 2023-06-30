package com.kjy.list;

import java.util.ArrayList;

public class ArrayListTestClass {

	public ArrayListTestClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void arraylistTest() {
		ArrayList<String> list=new ArrayList<>(); //뒤에 타입이 같으면 생성자는 타입 생략 가능
		list.add("a");
		list.add("b"); //항상 맨 마지막에 추가
		
		list.add(0, "c"); //index=0에 값 추가하고, 나머지 데이터는 뒤로~~
		
		list.set(0, "f"); //index=0에 값을 f로 변경
		
		list.remove(0); //index=0에 값을 제거하고, 나머지 데이터는 앞으로~,
		
		String result=list.remove(0); //반환
		
		int idx=list.indexOf("b"); //=>0
		/**
		 * 0:"a" / 1:"b"/ 2:"b"/ 3:"b"
		 * int idx=list.indexof("b"); ==>1
		 * 처음부터 찾아가고
		 * int idx=list.lastindexof("b"); ==>3
		 * 마지막부터 앞으로 찾아옴
		 */
		
		/**전체 데이터를 조회하는 방법 1 : for(변수초기값; 조건; 증감)**/
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		/**전체 데이터를 조회하는 방법 2 : for(내부 데이터 타입 : ArrayList)**/
		for(String s:list) {
			System.out.println(s);
		}
	}

}
