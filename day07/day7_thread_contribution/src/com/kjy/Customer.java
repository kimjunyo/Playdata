package com.kjy;

public class Customer extends Thread{
	Account account=new Account();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Account account,String name) {
		this.account = account;
		setName(name);//Thread에 name을 전달해서 Thread 이름 짓기
	}
	public void run() {
		for(int i=0;i<=200;i++) {
			System.out.println(getName()+" : "+i+"번째 성금자");
			this.account.deposit();
			if(account.getTotal()>=500000) {
				break;
			}
		}
	}

}
