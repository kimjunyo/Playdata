package com.kjy;

import java.util.ArrayList;

// PrintClass: 출력에 해당하는 메서드들만 보유.
// 추후: HTML과 같은 GUI/UI들로 대체...
// View 역할
public class PrintClass {

	public PrintClass() { //기본 생성자
	}
	
	public static void prn(ArrayList<MemberClass> members,ArrayList<Integer> arr) { //사용자 정의 메서드
		for(int idx=0;idx<arr.size();idx++) {
			System.out.println(members.get(idx).pname+" 교수님 나이: " +arr.get(idx));
		}
		
	}
	public static void prnGrade(float gradeAvg) {
		System.out.println("\n학생들의 평균: "+gradeAvg);
	}

}
