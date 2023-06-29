package com.kjy;

public class ParentClass {
	int a=10;
	protected String name="kkh";
	private boolean b=false;
	public char c='A';
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	public ParentClass(int num) {
		this.a=num;
		System.out.println("ParentClass()생성자 종료");
	}
	
	//Object.class의 toString()를 재정의: Override
	public String toString() {
		String result=a+"--"+name;
		return result;
	}
}
