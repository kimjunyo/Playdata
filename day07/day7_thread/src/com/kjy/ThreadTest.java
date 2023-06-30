package com.kjy;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("main() 시작");
		RunnableTest r1=new RunnableTest(5);
		new Thread(r1).start();
		System.out.println("main() 종료");
	}
}
/*1. extends Thread Test
//		ThreadName t1=new ThreadName("t1");
//		ThreadName t2=new ThreadName("t2");
//		ThreadName t3=new ThreadName("t3");
		//병렬 처리 개념: 한 방에 여러 가지 일 처리
		FakeThread t1=new FakeThread();
		FakeThread t2=new FakeThread();
		FakeThread t3=new FakeThread();
		//직렬 처리 개념
		t1.start();
		t2.start();
		t3.start();
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
 */
/* 2.implements Runnable Test
 * RunnableClass r1=new RunnableClass();
		RunnableClass r2=new RunnableClass();
		RunnableClass r3=new RunnableClass();
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start(); //join하려면 객체를 넣어 줘야 함
//		r1.start(); //스레드가 갖고있는 start를 써줘야함
//		r2.start();
//		r3.start();
 */
/** 3. 스레드 일정 시간동안 멈추기: Thread.sleep(1/1000초)
 * 		sleep()의 시간은 1000=> 1초
 * 		sleep() 강제적으로 멈추기 때문에 예외처리 필수
 * SleepThread s1=new SleepThread();
		s1.start();
 */
/** 4. implements Runnable를 이용한 Thread.sleep();
 * 
 */
