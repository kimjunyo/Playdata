package com.kyj;

public class ForIfTestClass {

	public static void main(String[] args) {
		int[] age={27,34,28,26,41,28,42,29,29,32};
		
//		1. 나이의 합(ageSum) 구하기
		int ageSum=0;
		int count=age.length;
		for(int i=0;i<count;i++) { //for 조건문에 age.length를 넣을 경우 조건문 돌 때마다 함수를 돌아야함->시간지연..
			ageSum+=age[i];
		}
		System.out.println("나이의 합: "+ageSum);
		
//		2. 평균 나이(ageAvg) 구하기
		float ageAvg=ageSum/count;
		System.out.println("나이의 평균: "+ageAvg);
		
//		3. 평균 나이보다 많은 인원 수(num) 세기
		int num=0;
		for(int i=0;i<count;i++) {
			if(age[i]>ageAvg) {
				num+=1;
			}
		}
		System.out.println("평균 나이보다 많은 인원 수: "+num);
		//문자열을 저장하고 싶을 경우 데이터 타입은 :String
		//문자열은 반드시 ""으로 감싸야 한다.
		String t1="a";
		String t2="abc";
		String t3="ㄱ";
		String t4="가";
		String t5="값";
//		"영문, 특수기호, 숫자"=>한글자당 1byte
//		"한글"=>한글자당 2byte ㄱ,가,값 모두 (참고:Oracle 3byte)
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"}; //이 data는 위험, 하나만 빠져도 힘듬
		int[] pay={460,200,250,300,300,200,350,200,400,440};
		
		//급여가 300인 사람의 이니셜을 출력하기
		//1.if()
		for(int i=0;i<count;i++){
			if(pay[i]==300) {
				System.out.println("300인 사원 이니셜: "+name[i]);
			}
		}
		//2. 문자열 연산** 문자열 + 숫자=문자열
		String str="";
		str=str+"KKH"; // "KKH"
		str=str+"LLT"; //"KKH LLT"
		str=str+"CCC";  //"KKH LLT CCC"
		System.out.println(str);
		//이 방식을 이용하면
		str="";
		for(int i=0;i<count;i++){
			if(pay[i]==300) {
				str+=name[i]+" ";
			}
		}
		System.out.println("300인 사원 이니셜: "+str);
	}
	
	//ArrayList

}
