package com.kjy;

public interface A {
//	public A() { //interface는 생성자를 가질 수 없다!	
//	}
	int a=10; //변수가 아니라 상수! //final이 붙은 상수로 선언됨! 따라서 더이상 값변경 불가!
//	public void sum() { //interface 내에서는 메서드 선언 불가	
//	}
	public void sum(); //interface 내에서는 메서드명만 선언 가능!
	//이 interface를 구현받는 클래스는 반드시 해당 메서드를 재정의 해야한다!
	
}
