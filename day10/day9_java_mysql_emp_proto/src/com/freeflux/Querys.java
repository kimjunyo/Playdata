package com.freeflux;

// Oracle, MySQL(limit), SQLite(limit): ANSI Query
// selectAll(), insert(), update(), delete(), selectAll()
public abstract class Querys {
	protected String driver = "com.mysql.cj.jdbc.Driver";
	protected String url = "jdbc:mysql://localhost:3306/db_emp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	protected String id_mysql = "root";
	protected String pw_mysql = "wnsdud811#"; // 본인 비밀번호
	protected String querySelect="select * from bootcamp2";
	protected String querySelectOne="select * from bootcamp2 where cSeqNo=?";
	protected String queryInsert="insert into bootcamp2 (cName, cRating, cJoinDate, cLastDate, cVisitNO, cPostNo, cCommentNo, cGenger, cAge) values ('허찬', '멤버', '2023.06.28.', '2023.07.05.', 36, 0, 0, '기타', '비공개')";
	protected String queryUpdate ="update bootcamp2 set cGender=? where cGender='기타'";
	protected String queryDelete ="delete from bootcamp2 where job=?";
}
/*
 * public interface Querys { String driver = "com.mysql.cj.jdbc.Driver"; String
 * url =
 * "jdbc:mysql://localhost:3306/db_emp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
 * String id_mysql = "root"; String pw_mysql = "wnsdud811#"; // 본인 비밀번호 String
 * querySelect="select * from employee"; String
 * querySelectOne="select * from employee where empNo=?"; String
 * queryInsert="insert into employee (empNo, empName, job, mgr, hireDate, sale, commission, deptNo) values (?,?,?,?,?,?,0,?)"
 * ; String queryUpdate ="update employee set sale=? where seq_no=?"; String
 * queryDelete ="delete from employee where job=?";
 * 
 * public void selectAll(); }
 */