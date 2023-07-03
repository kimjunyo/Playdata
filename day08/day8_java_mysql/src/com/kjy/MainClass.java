// day8_java_mysql
package com.kjy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		//1. MySQL 접속 드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		//2. MySQL 서버 접속: 서버 주소/id/pw/db명
		//DriverManager.getConnection(null);
		//서버 접속 프로토콜: jdbc:mysql://
		//서버 주소: localhost
		//데이터 통신 게이트(포트번호): 3306
		//사용할 DB명: test
		//서버 주소:"jdbc:mysql://localhost3306/test"
		//서버 관리자 아이다: "root"
		//관리자 비밀번호: "wnsdud811#"
		//접속 결과를 저장하는 변수: Connection 변수명
		Connection conn=null;
		String url="jdbc:mysql://localhost3306/";
		String id="root";
		String pw="1234";
		String dbName="test";
		url+=dbName;
		try {
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("데이터베이스 접속 성공!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//3. MySQL에 요청: SQL : SQLException
		//	1. Statement: 쿼리문 내에 변수가 포함되지 않을 경우,
		//	2. PreparedStatement: 쿼리문 내에 변수가 포함될 경우
		
		//4. 결과 처리: select*from 테이블명 : SQLException
		//	ResultSet 객체로 전달 받음
		//	while(ResultSet.next()){
		//		레코드(한줄) 하나씩
		//	}
		
		//5. 자원 해제 //
		//	1. ResultSet.close();
		//	2. Statement.close();/PreparedStatement.close();
		//	3. Connection.close();
	}//main() END

} // Driver.class=>com.mysql.jdbc.Driver : 접속 드라이버명
