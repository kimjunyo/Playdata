package com.kjy.isp;

/*Isp 적용
 * 부모 클래스는 각 자식 클래스의 공통 부분 구현 받도록 설계: AOP(관점 지향 프로그래밍)
 * 자식 클래스는 자신만의 메서드를 구현할 수 있도록 설계...
 */
public class Teacher extends Person{

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	public void teaching() {
		System.out.println("신입 사원 교육");
	}
}
