package com.kjy;

public class StudentClass {
	String sNo=null;
	private String firstNo=null;
	private String lastNo=null;
	String sName=null;
	int year=0;
	String local=null;
	int grade=0;
	
	public StudentClass() { //�⺻ ������
		
	}
	//6�� ������ �޴� ������
	public StudentClass(String sNo, String jumin, String sName, int year, String local, int grade) {
		this.sNo = sNo;
		String[] split=jumin.split("-");
		this.firstNo = split[0];
		this.lastNo = split[1];
		this.sName = sName;
		this.year = year;
		this.local = local;
		this.grade = grade;
	}
	
	

}
