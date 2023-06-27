package com.kjy;

import java.util.ArrayList;

// MainClass: 프로젝트 전체를 컨트롤 하는 역할
// Controller 역할
public class MainClass {
	static String s="aaaas";
	static int a=10;
	static final int b=100;
	//final: 초기 설정 값을 변경하지 못하도록 막아주는 키워드
	
	public static void main(String[] args) {
//		MemberClass m1= new MemberClass();
//		
//		Object m2=new MemberClass();
//		
//		MemberClass m3=(MemberClass) m2;
//		System.out.println(s); //static이 붙지 않으면 안되는 이유: static쪽에서 써야 되니까
//		
		a=3300;
//		m1.a=1000;
//		m1.b=20000;
//		System.out.println(m1.a+"  "+m3.a);
//		System.out.println(m1.b+"  "+m3.b);
//		m1.test(m1.a);
//		m3.test(m3.a);
//		MemberClass.b=1234556;
//		System.out.println(m1.b+"  "+m3.b);
//		MethodClass.splitText();
		
		//("92001", "590327-1839240", "이태규", 920, "교수", "1997")
		
		
//		System.out.println("재직 기간: "+(2023-m.hirDate)+"년");
//		DataClass dc= new DataClass();
//		for(int idx=0;idx<dc.members.length;idx++) {
//			System.out.print(dc.members[idx].pname+"\t");
//			System.out.println(2023-dc.members[idx].hirDate);
//		}
		DataClass dc=new DataClass();
		//실제 데이터들은 dc객체 안의 members라는 배열이 보유!!
		ArrayList<Integer> pAges=MethodClass.age(dc.members); //static이 붙으면 이와 같이 바로 class에서 호출 가능
												 //만약 static이 안 붙으면 따로 객체 만들어야 함
												 //ex) MethodClass mc=new MethodClass(); mc.age(dc.members);
		PrintClass.prn(dc.members,pAges); //이 친구도 마찬가지
		float gradesAvg=MethodClass.gradeAvg(dc.students);
		PrintClass.prnGrade(gradesAvg);
	}//main END
}
