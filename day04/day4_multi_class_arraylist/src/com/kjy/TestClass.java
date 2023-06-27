package com.kjy;

public class TestClass {
	int a=10;					//default이기 때문에 동일한 패키지에서만 접근 가능
	private String name="sss";	//private이기 때문에 외부에서 접근 불가!
	public boolean b=true; 		//public이기 때문에 누구나 접근 가능
	
	public TestClass() {
		
	}
	
	public String getName() {
		return name;
	}
	
	
}
