package com.kjy;

public class RunnableTest implements Runnable{
	int count=0;
	int num=0;
	boolean timeout=false;
	
	public RunnableTest() {
		// TODO Auto-generated constructor stub
	}
	
	public RunnableTest(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		while(!timeout) {
			try {
				Thread.sleep(3000); // 3초 동안 스레드 재우기
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			num++;
			if(count<=num) {
				timeout=true;
			}
			System.out.println(Thread.currentThread().getName()+" : "+num);
			//currentThread 현재구동중인 쓰레드
		}
		
	} // while() END
	
	

}
