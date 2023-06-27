package com.kjy;

import java.util.ArrayList;

// MethodClass: 프로젝트에 필요한 공통적 메소드들만 보유하는 클래스
public class MethodClass {

	public MethodClass() { //기본 생성자
	}
	public static void splitText() { //모든 클래스에서 사용 가능
		System.out.println("splitText() 호출됨 ");
	}
	
	//MainClass의 main() 내에서 호출
	//main()에서는 실제 데이터들을 보유한 members 배열을 전달!
	public static ArrayList<Integer> age(ArrayList<MemberClass> members) {
		ArrayList<Integer> ages=new ArrayList<Integer>();
		for(int idx=0;idx<members.size();idx++) {
			String temp=members.get(idx).getFirstNo().substring(0,2);
			String temp2=members.get(idx).getLastNo().substring(0,1);
			int temp3=Integer.parseInt(temp);

			if(temp2.equals("3") | temp2.equals("4")) {
				ages.add(2023-(2000+temp3));
			}
			else {
				ages.add(2023-(1900+temp3));
			}
		
		}
		return ages;	//구해진 나이들을 main()으로 반환
						//main()에서는 int[] 타입을 가진 변수에 저장...예)int[] pAges=mc.age(dc.members);
	
	}
	public static float gradeAvg(ArrayList<StudentClass> students) {
		int gradeSum=0;
		for(int idx=0;idx<students.size();idx++) {
			gradeSum+=students.get(idx).grade;
		}
		return (float)gradeSum/students.size();
	}
}
