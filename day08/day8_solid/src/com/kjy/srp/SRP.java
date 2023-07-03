package com.kjy.srp;

public class SRP {

	public SRP() {
		// TODO Auto-generated constructor stub
	}
	//클래스 내부에 클래스 선언 가능: 접근 제한자 사용 가능
	public class InnerClass{
		
	}
	public void method() {
		class InnerMethod{ //메서드 내부에 클래스 선언 가능
			
		}
	}
}
//서브 클래스
abstract class Person2{ //접근 제한자 사용 못함!
	public abstract void work(); //메서드는 접근 제한자 허용!
}
//srp 패키지의 SRP 파일 내부~
//class Programmer extends Person2{
//
//	@Override
//	public void work() {
//		System.out.println("코딩~~");
//	}
//	
//}
//class PM extends Person2{
//
//	@Override
//	public void work() {
//		System.out.println("기획~");
//	}
//	
//}