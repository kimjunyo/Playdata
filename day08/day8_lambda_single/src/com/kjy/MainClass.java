package com.kjy;

public class MainClass {

	public static void main(String[] args) {
		//람다 표현식
		//익명(이름 없는) 객체를 이용한 자바 코드
		//1. 생성된 객체를 리턴 받는 형태.
//		SingleToneClass s=SingleToneClass.getInstance(); //생성 불가능!! (생성자가 private)
		
		//2. 생성된 객체를 리턴 받지 않는 형식.
		SingleToneClass.getInstance();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("!!!!");
			}
			
		}).start();
		//익명 객체는 사용 후, 일정시간이 지나면 JVM이 알아서 소멸 시킨다.
		//따라서 메모리를 효율적으로 사용할 수 있다.
		//JVM은 가비지 컬렉션이라는 곳에 사용되지 않는 변수들을 자동으로 넣어서 소멸시킨다.
		
		new Thread(()->{
			System.out.println("!!!");
		}).start();
		
		Func add=(int a,int b)->a+b;
		
	}
}
interface Func{
	public int cal(int n1,int n2);
}