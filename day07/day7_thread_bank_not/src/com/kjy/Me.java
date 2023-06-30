package com.kjy;

public class Me extends Thread{
	public Me() {
		
	}
	@Override
	public void run() {
		NotSyncMain.bank.saveMoney(5000);
		System.out.println("입금 후 잔액: "+NotSyncMain.bank.getMoney());
	}
}
