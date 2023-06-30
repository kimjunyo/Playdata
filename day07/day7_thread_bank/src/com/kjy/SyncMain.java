package com.kjy;

public class SyncMain {

	static Bank bank;
	public static void main(String[] args) {
		bank=new Bank(); //은행 업무 시작
		Me me=new Me(); //입금 고객
		Wife wife=new Wife(); //출금 고객
		System.out.println("현 잔액: "+bank.getMoney());
		
		me.start();
		wife.start();
	}

}
