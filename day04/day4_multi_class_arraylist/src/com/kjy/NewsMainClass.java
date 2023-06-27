package com.kjy;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsMainClass {
	
	public static void main(String[] args) {
//		ArrayList<NewsClass> a=new ArrayList<NewsClass>();
//		
//		NewsClass n=new NewsClass("경향신문", "nsd16500796.gif", "media.naver.com/press/032",  "종합지");
////		0		 1		  2		   3		4	
//		a.add(n);a.add(n);a.add(n);a.add(n);a.add(n);
//		System.out.println(a.size());
//		System.out.println(a.remove(0).category); //1번째 index에 있는 객체가 0번째 index로 데이터 이동
//		
//		NewsClass b=a.remove(0); //***상당히 중요한 코드래요
//		System.out.println(b.category);
//		System.out.println(a.size());
//		
//		a.set(1, n); //변경: 어느 위치(index)에 있는 데이터를 새로운 데이터로 변경
//		a.clear();
//		System.out.println(a.size());
//		a.add(n);
//		System.out.println(a.get(0).category);
		NewsDataClass ndc=new NewsDataClass();
//		System.out.println(ndc.news.size());
//		System.out.println(ndc.news.get(94).category);
//		System.out.println(ndc.news.size());
		
		//콘솔로부터 입력받기
		Scanner scan=new Scanner(System.in); //Scanner는 콘솔창을 훑음
		System.out.print("검색할 신문사 입력: ");
		String press=scan.next();
//		press.contains("신문"); //문자열에 괄호 안 문자열이 있으면 true
		//입력하기 전까지는 대기 상태
		ArrayList<String> url=NewsMethodClass.searchNewsURL(press, ndc.news);
		NewsPrintClass.prnURL(press,url);
		ArrayList<String> Press=NewsMethodClass.sameRemove(ndc.news);
		NewsPrintClass.prnPress(Press);
//		TestClass tc=new TestClass();	// 생성자를 private으로 바꾸면 객체 생성 불가능
//		System.out.println(tc.a);		// default 다른 패키지면 오류
//		System.out.println(tc.b);		// public
//		System.out.println(tc.getName()); 	// private은 getter method로 불러올 수 있음
		scan.close(); //막아놔야 계속 찾지 않음!!
	}

}