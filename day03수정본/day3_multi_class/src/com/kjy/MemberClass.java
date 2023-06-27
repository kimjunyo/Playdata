package com.kjy;

//한 회원의 정보를 하나로 묶어주는 역할
// Model 역할
// 공통적으로 겹치는 것만..
public class MemberClass {
//	int a=100;
	
//	static int b=20;
	//모든 변수는 초기값 생성 필수, 자동 초기화가 위험함
	String pno=null;//교수사번
	
	private String firstNo=null;//주민번호 앞자리 //생년월일, 나이
	private String lastNo=null;//주민번호 뒷자리 //남성, 여성
	String pname=null;//교수이름
	int cCode=0;//클래스(반) 코드명
	String pJob=null;//교수직책
	int hirDate=0;//입사연도 //재직년수
	//코드 썼다하면 ctrl s
	
	public MemberClass() { //기본 생성자
		
	}
	//                      pno     firstNo lastNo     pname    cCode       pJob          hirDate
	public MemberClass(String pno, String jumin, String pname, int cCode, String pJob, String hirDate) { //7개 데이터를 받는 생성자
		this.pno = pno;
		String[] temp=jumin.split("-");
		this.firstNo = temp[0];
		this.lastNo = temp[1];
		this.pname = pname;
		this.cCode = cCode;
		this.pJob = pJob;
		this.hirDate = Integer.parseInt(hirDate);
	}
	public String getFirstNo() {
		return firstNo;
	}
	public String getLastNo() {
		return lastNo;
	}

//	public void test(int p) {
//		System.out.println("test() 메서드 호출: "+p);
//	}
}
