package com.kjy;

public class ThreadName extends Thread{

	public ThreadName() {
		// TODO Auto-generated constructor stub
	}
	public ThreadName(String name) {
		super(name);
	}
	@Override
	public void run() {
		// 스레드가 해야할 일들..
		int i=0;
		while(i<2000) {
			System.out.println(getName()+"-->"+i);
			i++;
		}
	}// run() END

}
