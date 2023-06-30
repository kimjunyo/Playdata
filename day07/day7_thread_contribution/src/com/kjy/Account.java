package com.kjy;
/** 각 ARS 번호를 통해 1,000 씩 누적하는 일처리 **/
public class Account {
	private int total=0;
	
	public Account(){
		
	}
	
	public void deposit() {
		this.total=this.total+1000;
	}

	public int getTotal() {
		return total;
	}
	
}
