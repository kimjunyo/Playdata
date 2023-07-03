package com.kj.lsp;

import com.kjy.srp.PM;
import com.kjy.srp.Person;
import com.kjy.srp.Programmer;

//LSP 적용 (Person/Programmer/PM)
public class Main {

	public static void main(String[] args) {
		Person p1=new Programmer();	// extends Person
		Person p2=new PM();			// extends Person
		//upcasting: 형변환 부모타입으로 형 변환(해당 메서드 사용 가능)->치환 법칙
		p1.work(); //부모클래스 타입으로 저장 받아도 자식클래스 work() 메서드 사용 가능
		p2.work();
		
		Object p3=new PM();
//		p3.work(); //사용불가!
		
//		1. 부모 클래스 타입으로 형 변환
		Person p4=(Person)p3;
		p4.work();
//		2. 본인 클래스 타입으로 형 변환
		PM p5=(PM)p3;
		p5.work();
	}
	//설계시 주의사항
	//자식클래스의 멤버(필드) 변수는 선언하지 않는다!!
	//부모클래스의 자식 클래스의 멤버(필드) 변수를 알 수 없기 때문!
}
