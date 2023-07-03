package com.kjy.isp;

public class Programmer extends Person{

	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	public void backDEV() {
		System.out.println("백엔드");
	}
	public void Eating() {//재정의 method는 별로 안좋음
		
	}
	public void Sleeping() { //재정의 method는 별로 안좋음
		
	}
	//재정의 하지말고 추상 메서드로 만들라!
}
