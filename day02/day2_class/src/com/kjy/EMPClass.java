package com.kjy;

public class EMPClass { //class 선언
	String name;       	//이름
	String joinDate;   	//가입일
	String lastVisitDate; // 최종방문일
	int numVisit;//	방문횟수
	String gender;//         성별
	String age;//         	연령대
 
	public EMPClass() {//기본 생성자
		
	}
	//생성자는 public 띄고 클래스명
	public EMPClass(String str) { //기본 생성자에 대한 Overloading 생성자 선언
		this.setSplit(str); //생성자에서 method를 전달해 줘야 됨		
	}//생성자 END
	
	//매서드는 public 반환타입 매서드명 이런식으로 해야함
	//문자열을 각각 분리하여 전역(필드)변수에 설정(대입)하는 매서드
	public void setSplit(String str) {
		String[] split=str.split(",");
		this.name=split[0]; //this가 class에 가서 바로 찾음:실행 속도가 빠름:scope법칙 안따름
		this.joinDate=split[1];
		this.lastVisitDate=split[2];
		this.numVisit=Integer.parseInt(split[3]);
		this.gender=split[4];
		this.age=split[5];
	}
	public static float[] getPortion(int male, int female, int entire){
		float malePortion=(float)male/entire;
		float femalePortion=(float)female/entire;
		float[] mfPortion= {malePortion,femalePortion};
		return mfPortion;
	}
	

}//클래스 END
