package com.kjy;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsMainClass {
	
	public static void main(String[] args) {
//		ArrayList<NewsClass> a=new ArrayList<NewsClass>();
//		
//		NewsClass n=new NewsClass("����Ź�", "nsd16500796.gif", "media.naver.com/press/032",  "������");
////		0		 1		  2		   3		4	
//		a.add(n);a.add(n);a.add(n);a.add(n);a.add(n);
//		System.out.println(a.size());
//		System.out.println(a.remove(0).category); //1��° index�� �ִ� ��ü�� 0��° index�� ������ �̵�
//		
//		NewsClass b=a.remove(0); //***����� �߿��� �ڵ巡��
//		System.out.println(b.category);
//		System.out.println(a.size());
//		
//		a.set(1, n); //����: ��� ��ġ(index)�� �ִ� �����͸� ���ο� �����ͷ� ����
//		a.clear();
//		System.out.println(a.size());
//		a.add(n);
//		System.out.println(a.get(0).category);
		NewsDataClass ndc=new NewsDataClass();
//		System.out.println(ndc.news.size());
//		System.out.println(ndc.news.get(94).category);
//		System.out.println(ndc.news.size());
		
		//�ַܼκ��� �Է¹ޱ�
		Scanner scan=new Scanner(System.in); //Scanner�� �ܼ�â�� ����
		System.out.print("�˻��� �Ź��� �Է�: ");
		String press=scan.next();
//		press.contains("�Ź�"); //���ڿ��� ��ȣ �� ���ڿ��� ������ true
		//�Է��ϱ� �������� ��� ����
		ArrayList<String> url=NewsMethodClass.searchNewsURL(press, ndc.news);
		NewsPrintClass.prnURL(press,url);
		ArrayList<String> Press=NewsMethodClass.sameRemove(ndc.news);
		NewsPrintClass.prnPress(Press);
//		TestClass tc=new TestClass();	// �����ڸ� private���� �ٲٸ� ��ü ���� �Ұ���
//		System.out.println(tc.a);		// default �ٸ� ��Ű���� ����
//		System.out.println(tc.b);		// public
//		System.out.println(tc.getName()); 	// private�� getter method�� �ҷ��� �� ����
		scan.close(); //���Ƴ��� ��� ã�� ����!!
	}

}