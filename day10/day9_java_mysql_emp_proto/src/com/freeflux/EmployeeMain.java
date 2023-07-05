package com.freeflux;

import java.util.ArrayList;
import java.util.Scanner;

import com.freeflux.db.MySQLconnector;
import com.kjy.dto.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		MySQLconnector mysql=new MySQLconnector();
		mysql.connectMySQL();
		ArrayList<Employee> empList=null;
		Scanner scan=new Scanner(System.in);
		boolean status=true;
		while(status) {
			PrintResult.printMenu();
			int input=scan.nextInt();
			switch(input) {
			case 1:
				empList=mysql.selectAll();
				PrintResult.printSelectALl(empList);
				break;
			case 2:
				System.out.print("사원 번호 입력: ");
				int employeeNum=scan.nextInt();
				mysql.selectOne(employeeNum);
				break;
			case 3:
				mysql.insert();
				break;
			case 4:
				empList=mysql.selectAll();
				mysql.update(empList);
				break;
			case 5:
				mysql.delete();
				break;
			case 6:
				System.out.println("작업이 종료되었습니다.");
				status=false;
			}
		}
		scan.close();
		
	} // main() END

}
