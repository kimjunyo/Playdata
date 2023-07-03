package com.kjy.ocp;

interface CarKey2 {
//OCP가 지켜진 경우
	public void open();
	public void lock();
	public void turnOn();
	public void turnOff();

}
class SmartKey implements CarKey2{
	public SmartKey() {
		
	}
	@Override
	public void open() {
		System.out.println("SmartKey로 열기");
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}
