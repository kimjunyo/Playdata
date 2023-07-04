package com.kjy.db;

public class MethodClass {
	public MethodClass() {
	}
	
	public void select() {
		MySQLconnector mysql=new MySQLconnector();
		mysql.selectAll();
	}
}
