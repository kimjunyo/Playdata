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
	public synchronized void saveMoney(int money) { //synchronized는 순서를 매겨줌 //waiting만 걸어줌
		try {
			Thread.sleep(300); //입금 처리 시간
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(this.money+money); //현 잔액 + 입금액
	}	// saveMoney() END
	//1. 메서드 선언부에 synchronized
	//2. 메서드 내부에도 가능
	// 출금처리하는 메서드
	public void minusMoney(int money) {
		synchronized(this){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			this.setMoney(this.money-money);
		}
	
	}
}
