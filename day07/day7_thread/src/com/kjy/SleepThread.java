package com.kjy;

public class SleepThread extends Thread{

	public SleepThread() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println("sleep Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("sleep End");
	}

}
