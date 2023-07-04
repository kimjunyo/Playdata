package com.kjy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnector {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql="root";
	private String pw_mysql="wnsdud811#";
	
	private Connection conn=null; // 를MySQL 접속 결과(상태)를 저장
	public MySQLconnector() {
		
	}

	public void connectMySQL() {

		//1. driver로드: Class.forName("드라이버명");
		//2. MySQL과 접속: DriverManager.getConnection("접속주소","아이디","비밀번호");
		//=> 외부와 통신하기 때문에 예외처리가 필요.
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id_mysql,pw_mysql);
			System.out.println("MySQL 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void selectAll() { //테이블 데이터 전체 조회
		Statement stmt = null;
		ResultSet rs=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select*from member");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
			}
		} catch (SQLException e) {
			System.out.println("select*from member"+e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e1) {
				System.out.println("Close ERR "+e1.getMessage());
			}
		}
			
	}//selectAll() END
	public void selectOne() {; //테이블 데이터 하나만 조회: select*from member where id=11
		int idx=11;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="select*from member where id=?";
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, idx); //"select*from member where id=11"
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		}catch(SQLException e) {
			
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//selectOne() END
	public void insert() { //테이블에 데이터 삽입
		PreparedStatement stmt=null;
		int rs=0;
		String query="insert into member values(?,?)";
		try {
			stmt=conn.prepareStatement(query);
			stmt.setInt(1, 3);
			stmt.setString(2, "데헷");
			rs=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//insert() END
	public void update() { //테이블 데이터 수정
		PreparedStatement pstmt=null;
		int rs=0;
		String query="update member set name=? where id=?";
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, "123");
			pstmt.setInt(2, 1);
			rs=pstmt.executeUpdate();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//update() END
	public void delete() { //테이블 데이터 삭제
		PreparedStatement pstmt=null;
		int rs=0;
		String query="delete from member where id=?";
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, 3);
			rs=pstmt.executeUpdate();
			System.out.println(rs);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//delete() END
	
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
