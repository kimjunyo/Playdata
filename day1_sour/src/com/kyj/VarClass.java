/**
 * 
 */
package com.kyj;

/**
 * @author kyj
 * Variable Test
 */
//public: 다른 클래스에 대한 접근 허가 
//class: 클래스 선언을 위한 키워드
//Varclass: 클래스명(첫글자 영문 대문자로 시작)
//클래스 파일명==클래스=생성자명
public class VarClass {
	//	void:매서드 내에서 반환되는 값이 없을 경우, 지정하는 반환 타입
	//main: 이 이름은 절대 변경 불가!
	//String[]: 전달되는 데이터 타입
	//	args: 파라미터명(매개변수명), 외부에서 보내는 값을 전달받아 저장하는 변수
	public static void main(String[] args) {
		//변수 선언: 데이터 타입 변수명;/데이터타입 변수명=초기값;
		//정수(int)를 저장받는 변수 선언
		int a;
		int b=10;
		
		//변수 사용: 선언된 변수를 활용(사용)
		a=10;
		b=100;
		// c=300; 변수 선언이 없기 때문에 오류 발생!!
		int d=a+b;
		int f,g,h; //동일 타입 변수를 한번에 만드는 방법
		f=1000;
		
		//숫자 관련 타입: int(정수), float(실수)
		//논리 관련 타입: boolean(true/false)
		//문자 관련 타입: char(단일문자만' '), String(" ")
		//단일 문자는 원래 유니코드값..
		
		//변수의 특징: 한 번에 하나의 값만 저장 가능!!
		f=1000;
//		g=10,20,30;
//		변수명: 반드시 영문 소문자로 시작
//		예) 급여: pay / 급여평균: payAvg(낙타표기법)
		
//		한번에 여러 개의 값을 저장하는 변수: 배열
//		배열 선언: 데이터타입[] args=new 데이터타입[저장 갯수];
//		배열 선언: 데이터타입 args[]=new 데이터타입[저장 갯수];
//		저장 갯수는 선언 이후에는 변경 불가능!!
		
		//변수선언
		int[] intArr=new int[5]; //new 대입 연산자
		int[] intArr2= {10,20,30,40,50}; //자바에서는 배열에서 블록{}을 씀
		//변수사용
		intArr[0]=100;
		intArr[1]=200;
		intArr[2]=300;
		intArr[3]=400;
		intArr[4]=500; //인덱스 번호 like 방번호
		
		intArr2[0]=10000;
		
		int result=intArr[4]+intArr2[4];
		System.out.println(result);
		result=intArr[0]+intArr[1]+intArr[2]+intArr[3]+intArr[4];
		System.out.println(result);
		result=0;
		for(int i=0;i<intArr.length;i++) {
			result+=intArr[i];
		}
		System.out.println(result);
		
//		intArr[5]=22222; //index out of bound은 배열의 length를 벗어남 이건 뭐 당연하거긴 해
	}

} //VarClass END
