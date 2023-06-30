package com.kjy;

public class FakeThread {

	public FakeThread() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		// 스레드가 해야할 일들..
		int i=0;
		while(i<2000) {
			System.out.println("-->"+i);
			i++;
		}
	}// run() END
	
	public void start() {
		run();
	}
}
