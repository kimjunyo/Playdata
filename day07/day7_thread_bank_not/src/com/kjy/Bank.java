package com.kjy;

public class Bank {
	private int money=10000; //잔액
	
	public Bank() {
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입금처리하는 메서드
	public void saveMoney(int money) {
		try {
			Thread.sleep(3000); //입금 처리 시간
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(this.money+money); //현 잔액 + 입금액
	}	// saveMoney() END
	
	// 출금처리하는 메서드
	public void minusMoney(int money) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		this.setMoney(this.money-money);
	}
}
