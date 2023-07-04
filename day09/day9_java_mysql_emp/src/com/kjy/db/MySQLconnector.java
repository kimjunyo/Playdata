package com.kjy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnector {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/db_employee?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql="root";
	private String pw_mysql="wnsdud811#";
	
	Connection cnn=null;
	public MySQLconnector() {
	}
	public void connectMySQL() {
		try {
			Class.forName(driver);
			cnn=DriverManager.getConnection(url,id_mysql,pw_mysql);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}
	}
	public void selectAll() {
		Statement st=null;
		ResultSet rs=null;
		String query="select*from employee";
		try {
			st=cnn.createStatement();
			rs=st.executeQuery(query);
			System.out.println("                               < 사원 목록 >");
			System.out.println("============================================================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)
				+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)
				+"\t"+rs.getInt(7)+"\t"+rs.getInt(8)+"\t"+rs.getInt(9));
			}
		} catch (SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				System.out.println("SQLException: "+e.getMessage());
			}
			
		}
	}
	//번호가 안변함
	public void insert(String name, String mgr) {
		PreparedStatement pstmt=null;
		Statement stmt=null;
		ResultSet rs2=null;
		int rs=0;
		String query="insert into employee (empNo, empName, job, mgr, hireDate, "
				+ "sale, commission, deptNo) values(?,?,'사원','06',?,250,0,20)";
		String query2="select*from employee";
		try {
			int count=0;
			stmt=cnn.createStatement();
			rs2=stmt.executeQuery(query2);
			while(rs2.next()) {
				count=rs2.getInt(2);
			}
			count++;
			pstmt=cnn.prepareStatement(query);
			pstmt.setInt(1, count);
			pstmt.setString(2, name);
			pstmt.setString(3, mgr);
			rs=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}finally {
			try {
				pstmt.close();
				rs2.close();
				stmt.close();
				System.out.println("사원이 추가되었습니다!");
			} catch (SQLException e) {
				System.out.println("SQLException: "+e.getMessage());
			}
		}
	}
	
	public void update() {
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		int rs2=0;
		int count=1;
		String query="update employee set sale=? where seq_no=?";
		String query2="select*from employee";
		try {
			stmt=cnn.createStatement();
			rs=stmt.executeQuery(query2);
			pstmt=cnn.prepareStatement(query);
			while(rs.next()) {
				pstmt.setInt(1, (int) (rs.getInt(7)*1.1));
				pstmt.setInt(2, count);
				rs2=pstmt.executeUpdate();
				count++;
			}
		} catch (SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}finally {
			try {
				pstmt.close();
				rs.close();
				stmt.close();
				System.out.println("전사원의 급여를 10% 올렸습니다.");
			} catch (SQLException e) {
				System.out.println("SQLException: "+e.getMessage());
			}
		}
	}
	public void delete() {
		Statement stmt=null;
		int rs=0;
		String query="delete from employee where job='과장'";
		try {
			stmt=cnn.createStatement();
			rs=stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}finally {
			try {
				stmt.close();
				System.out.println("과장 직책에 해당하는 사원이 삭제되었습니다.");
			} catch (SQLException e) {
				System.out.println("SQLException: "+e.getMessage());
			}
		}
	}
}
