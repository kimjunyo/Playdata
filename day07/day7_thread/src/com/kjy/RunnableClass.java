package com.kjy;

public class RunnableClass implements Runnable{

	public RunnableClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() { //interface는 재정의 해줘야 함
		System.out.println("재정의된 run() 내부"); //RunnableClass가 다시 만드는 run
		
	}
//	public void start() {
//		run();
//	} //start를 따로 만들면 thread에 대한 개념이 사라짐

}
