package com.kjy;

public interface Query {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/db_bootcamp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	String id_mysql = "root";
	String pw_mysql = "wnsdud811#"; // 본인 비밀번호
	String querySelect="select * from bootcamp2";
	String queryAgeNull="select * from bootcamp2 where cAge='비공개'";
	String queryInsert="insert into bootcamp2 (empNo, empName, job, mgr, hireDate, sale, commission, deptNo) values (?,?,?,?,?,?,0,?)";
	String queryAgeNulll ="update bootcamp2 set  where cAge='비공개";
	String queryUpdate ="update bootcamp2 set cGenger=? where cSeqNo=?";

}
