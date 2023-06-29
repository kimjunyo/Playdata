package com.kjy;

public class ChildClass extends ParentClass {

	public ChildClass() {
		//System.out.println("test"); 다른 코드아래 사용 불가!
		super(1000); //super는 부모의 생성자 //자식의 생성자가 부모의 생성자에 접근 가능
		System.out.println("ChildClass() 생성자 종료");
		
	}

}
