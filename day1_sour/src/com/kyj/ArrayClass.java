package com.kyj;

public class ArrayClass {

	public static void main(String[] args) {
//							   0,  1,  2,  3,  4
		int[] intArr= {10,20,30,40,50};
		System.out.println("intArr의 데이터 갯수: "+intArr.length); //ctrl+space 개사기
		//intArr의 데이터들을 합하고 싶을 경우,
		//1. 각 index를 이용하여 각각의 값을 꺼내어(추출하여) 합하면 된다.

		int sum=intArr[0]+intArr[1]+intArr[2]+intArr[3]+intArr[4];
		System.out.println(sum);
		
		//반복문: for(반복문 내에서 사용할 변수 선언; 반복문을 멈추기 위한 조건;증감){
		//					조건이 참(true)이었을 경우 해야할 일들...;
		//			}
		int sum2=0; //합 누적 변수
		for(int n=0;n<5;n++) { //n++은 n=n+1과 동일
			System.out.println("n의 현재값: "+n);
			sum2+=intArr[n];
		}
		//1. 변수 사용 2. 조건 확인 3. 조건 참이었을 떄 해야할 일 4. 증감 5. 조건 확인 6. 조건 참이었을 때 해야할 일 7...
//		for문 관계 그려보기

		System.out.println("최종 합: "+sum2);
		if(10<20^20>10) {
			System.out.println("야호");
		}else {
			System.out.println("xiu");
		}
	}

}
