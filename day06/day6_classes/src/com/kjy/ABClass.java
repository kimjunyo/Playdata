package com.kjy;

public abstract class ABClass {
	int a=0;
	final boolean B=true; //상수명은 모두 대문자를 사용!
	
	
	public ABClass() {
		System.out.println("ABClass() 호출");
	}
	
	public void avg() {
		
	}
	
	public abstract void prn();

}
