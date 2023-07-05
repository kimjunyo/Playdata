package com.kjy;

import java.util.ArrayList;
import java.util.Scanner;

import com.kjy.db.MySQLconnector;
import com.kjy.dto.People;

public class PeopleMain {

	public static void main(String[] args) {
		MySQLconnector mysql=new MySQLconnector();
		mysql.connect();
		ArrayList<People> peoples=null;
		Scanner scan=new Scanner(System.in);
		boolean status=true;
		while(status) {
			PrintPeople.printMenu();
			int input=scan.nextInt();
			switch(input){
				case 1:
					peoples=mysql.selectAll();
					PrintPeople.printPeople(peoples);
					break;
				case 2:
					peoples=mysql.selectAll();
					mysql.update(peoples);
					break;
				case 3:
					break;
				case 4:
					peoples=mysql.selectAll();
					double avg=mysql.visitAvg(peoples);
					mysql.visit(avg);
					break;
				case 5:
					peoples=mysql.selectAll();
					mysql.ageNull(peoples);
					break;
				case 6:
					System.out.println("작업 종료");
					status=false;
					scan.close();
			}
		}
		

	}

}
