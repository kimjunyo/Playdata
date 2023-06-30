package com.kjy;
/**ARS 모금
 * ARS는 3개 전화
 * 한번 전화걸 때마다 자동으로 1,000씩 모금
 * 
 * **/
public class TVContribution {
	static Account account; //모금통 큰거 하나
	public static void main(String[] args) {
		account=new Account();
		Customer c1=new Customer(account,"02-777-1001");
		Customer c2=new Customer(account,"02-777-1002");
		Customer c3=new Customer(account,"02-777-1003");
		
		try { //start가 먼저 오고 나중에 join 
			c1.start();
			c2.start();
			c3.start();
			
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("총 모금액: "+account.getTotal());
	}

}
