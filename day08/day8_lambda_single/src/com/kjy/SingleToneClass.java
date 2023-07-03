package com.kjy;

//싱글톤: 자바 디자인 패턴 중 대표적인 패턴
public class SingleToneClass {
	public static SingleToneClass single=null;
	private SingleToneClass() {
	}
//	public static SingleToneClass getInstance() {
//		SingleToneClass single=new SingleToneClass();
//		return single;
//	}
	public static void getInstance() {
		single=new SingleToneClass();
	} //생성자가 private이면 get함수를 static으로 해서 호출

}
