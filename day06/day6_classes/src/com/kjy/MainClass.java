package com.kjy;

import com.kjy.test.ChildClass2;

public class MainClass {

	public static void main(String[] args) {
//		ParentClass p=new ParentClass();
//		System.out.println(p.toString());
		
//		ChildClass c=new ChildClass();
//		
//		ChildClass2 cc=new ChildClass2();
//		//cc.a default값은 같은 패키지 내에 있어야만 가능
//		cc.name="";
		A c=new InterfaceTest();
		A c2=new InterfaceTest2();
		//interface는 기능만 구현
		//interface 다형성/ 유지보수
		
//		ABClass c3=new ABClass(); //추상 클래스의 생성자는 상속에서만 사용!!
		ABClass ab= new ABchild();
		//라이브러리 개발할 때 많이 씀
	}

}
