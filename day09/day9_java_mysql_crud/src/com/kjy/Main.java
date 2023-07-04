package com.kjy;

import com.kjy.db.MySQLconnector;

public class Main {

	public static void main(String[] args) {
		MySQLconnector mysql=new MySQLconnector();
		mysql.connectMySQL();
		mysql.update();
		System.out.println("====================================");
		mysql.selectAll();
		
	}
}

