package com.kjy.ocp;
//OCP가 지켜지지 않은 경우
public class CarKey {
	CarA myCar;
	public CarKey() {
		// TODO Auto-generated constructor stub
	}
	public CarKey(CarA myCar) {
		this.myCar = myCar;
	}
	public void open() {
		System.out.println("문열림");
	}
	public void turnOn() {
		System.out.println("시동 걸림");
	}
	public void turnOff() {
		System.out.println("시동 시동끔");
	}
	public void lock() {
		System.out.println("문닫힘");
	}
}
class CarA{
	public CarA(){
		
	}
}