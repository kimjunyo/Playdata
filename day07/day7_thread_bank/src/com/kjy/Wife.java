package com.kjy;

public class Wife extends Thread{
	public Wife() {
	// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		SyncMain.bank.minusMoney(3000);
		System.out.println("출금 후 잔액: "+SyncMain.bank.getMoney());
	}
}
