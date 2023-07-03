package com.kjy.srp;

public class Person {
	public String job;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String job) {
		this.job = job;
	}
	//이렇게 하면 srp에 위배
	public void work() {
		if(this.job.equals("Programmer")) {
			System.out.println("코딩하는 사람");
		}else if(this.job.equals("PM")) {
			System.out.println("기획하는 사람");
		}
	}
}
