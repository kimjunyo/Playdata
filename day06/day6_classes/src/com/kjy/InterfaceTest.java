package com.kjy;

public class InterfaceTest implements A, B, C {
	int ccc=0;
	public InterfaceTest() {
//		a=1110; // interface에 선언된 변수는 final 이 붙은 상수이다!
		int c=a;	//상수이기 때문에 추출은 가능!
	}
	
	//interface에 선언된 메서드를 재정의 했다라는 어노테이션
	@Override
	public void sum() {
		System.out.println("A");
		
	}
	
	//Spring Framework 에서는 위와 같은 어노테이션을 이용하여 여러가지 기능을 구현할 수 있다.
	
}
