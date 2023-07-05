package com.kjy;

import java.util.ArrayList;

import com.kjy.dto.People;

public class PrintPeople {
	public PrintPeople() {
		// TODO Auto-generated constructor stub
	}
	public static void printMenu() {
		System.out.println("작업 메뉴를 고르시오.");
		System.out.println("1. 전체 조회 / 2. 성별 수정 / 3. 멤버 추가 / 4. 평균 방문횟수보다 많이 방문한 사람 명단 출력 / 5. 나이 비공개인 사람들의 방문 횟수 출력 / 6. 작업 종료");
	}
	public static void printPeople(ArrayList<People> peoples) {
		for(People people:peoples) {
			System.out.println(people);
		}
	}
}
