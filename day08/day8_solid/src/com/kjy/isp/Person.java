package com.kjy.isp;
/* ISP 적용
 * 상위 클래스에서 공통 부분을 구현하고
 * 하위 클래스가 따로 구현할 수 밖에 없는 메서드만 구현하도록 설계...
 * 
 */
public abstract class Person {

	public Person() { //기본 생성자를 보유하고 있지만 new를 이용하여 단독 객체 생성 불가능!
		// => 클래스 자체가 추상 클래스이기 때문
		// 추상 클래스의 생성자는 상속 부분에서만 사용된다!!
	}
	public abstract void work();
	//public void Eating();
	//public void Sleeping();
	public void Eating() {
		System.out.println("먹다~~");
	}
	public void Sleeping() {
		System.out.println("~~자다");
	}
	
}
