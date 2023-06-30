package com.kjy.map;

public class Student {
	private int sno;
	private String sname;
	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

}
