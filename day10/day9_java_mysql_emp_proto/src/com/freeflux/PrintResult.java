package com.freeflux;

import java.util.ArrayList;

import com.kjy.dto.Employee;

public class PrintResult {

	public PrintResult() {
		// TODO Auto-generated constructor stub
	}
	public static void printMenu() {
		System.out.println();
		System.out.println("원하는 작업 번호를 입력해 주세요..");
		System.out.println("1. 전체사원조회 / 2. 개인사원조회/ 3. 사원추가 / 4. 전사원 급여10%올림 / 5. 과장 직책 사원 삭제 / 6. 작업종료:  ");
	}
	
	public static void printSelectALl(ArrayList<Employee> empList) {
		for(Employee employee:empList) {
			System.out.println(employee);
		}
	}
}
