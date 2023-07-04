package com.kjy;

import java.util.Scanner;

import com.kjy.db.MethodClass;
import com.kjy.db.MySQLconnector2;

public class EmployeeMain {

	public static void main(String[] args) {
		int num=0;
		String name=null;
		String mgr=null;
		Scanner scan=new Scanner(System.in);
		MySQLconnector2 mysql=new MySQLconnector2();
		mysql.connectMySQL();
		while(num!=5) {
			System.out.println("원하는 작업 번호를 입력해 주세요..");
			System.out.println("1. 전체사원조회/2. 신규사원추가/3. 전사원 급여10%올림/4. 과장 직책 사원 삭제/5. 작업 종료");
			System.out.print("=> ");
			num=scan.nextInt();
			if(num==1) {
				mysql.selectAll();
			}else if(num==2) {
				System.out.print("이름: ");
				name=scan.next();
				System.out.print("입사일(ex>2023-07-04): ");
				mgr=scan.next();
				mysql.insert(name, mgr);
			}else if(num==3) {
				mysql.update();
			}else if(num==4) {
				mysql.delete();
			}
		}
		System.out.println("작업이 종료되었습니다..");
		scan.close();
	}

}
