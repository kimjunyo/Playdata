package com.freeflux.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.freeflux.Querys;
import com.kjy.dto.Employee;

/** DAO: 데이터에 접근하는 객체 **/
public class MySQLconnector extends Querys{
	
	public Connection conn = null;
	
	public MySQLconnector() { // 기본 생성자
		
	}
	
	/** MySQL Connect Method **/
	public void connectMySQL() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id_mysql,pw_mysql);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("connectMySQL(): "+e.getMessage());
		}
	} //  connectMySQL() END

	
	/** 테이블 데이터 전체 조회 
	 * @return **/
	public ArrayList<Employee> selectAll() {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Employee> empList=null;
		try {
			pstmt=conn.prepareStatement(querySelect);
			rs=pstmt.executeQuery();
			empList=new ArrayList<Employee>();
			while(rs.next()) {
				
				int empNo=rs.getInt(2);
				String empName=rs.getString(3);
				String job=rs.getString(4);
				String mgr=rs.getString(5);
				String hireDate=rs.getString(6);
				int sale=rs.getInt(7);
				int commission=rs.getInt(8);
				int deptNo=rs.getInt(9);
				empList.add(new Employee(empNo,empName,job,mgr,hireDate,sale,commission,deptNo));
			}
		} catch (SQLException e) {
			System.out.println("selectAll() ERR: "+e.getMessage());
		}finally {
			close(pstmt,rs);
		}
		System.out.println("전체사원을 조회하였습니다!");
		return empList;
	} // selectAll() END

	/** 테이블 데이터 하나만 조회 **/
	public void selectOne(int employNum) {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	
		try {
			pstmt=conn.prepareStatement(querySelectOne);
			pstmt.setInt(1, employNum);
			rs=pstmt.executeQuery();
			System.out.println("데이터 하나만 조회 성공!");
		} catch (SQLException e) {
			System.out.println("selectOne() ERR: "+e.getMessage());
		}finally {
			close(pstmt,rs);
		}
		

	} // selectOne() END

	/** 테이블에 데이터 삽입(추가) **/
	public void insert() {
		PreparedStatement pstmt=null;
		int rs=0;
		try {
			pstmt=conn.prepareStatement(queryInsert);
			//(?,?,?,?,?,?,0,?)
			pstmt.setInt(1, 1015);
			pstmt.setString(2,"마동석");
			pstmt.setString(3, "과장");
			pstmt.setString(4, "05");
			pstmt.setString(5, "2023-07-05");
			pstmt.setInt(6, 450);
			pstmt.setInt(7, 20);
			rs=pstmt.executeUpdate();
			if(rs>0) {
				System.out.println(rs+"개의 레코드 삽입 성공!");
			}
		}catch(SQLException e) {
			System.out.println("insert() ERR: "+e.getMessage());
		}finally {
			close(pstmt);
		}
		System.out.println("신규 사원 추가 성공!");
	} // insert() END


	
	/** 테이블 데이터 수정 **/
	public void update(ArrayList<Employee> empList) {
		System.out.println("급여 10% 올리기 성공!");
		PreparedStatement pstmt=null;
		int rs=0;
		try {
			pstmt=conn.prepareStatement(queryUpdate);
			for(int k=0;k<empList.size();k++) {
				pstmt.setInt(1, empList.get(k).getSale()+30);
				pstmt.setInt(2, k+1);
				rs+=pstmt.executeUpdate();
			}
			if(rs>0) {
				System.out.println(rs+"개의 레코드가 수정 성공!");
			}
		} catch (SQLException e) {
			System.out.println("update() ERR: "+e.getMessage());
		}finally {
			close(pstmt);
		}

	} // update() END

	/** 테이블 데이터 삭제 **/
	public void delete() {
		System.out.println("과장 직책 사원 삭제 성공!");
		PreparedStatement pstmt=null;
		int rs=0;
		try {
			pstmt=conn.prepareStatement(queryDelete);
			pstmt.setString(1, "과장");
			rs=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete() ERR: "+e.getMessage());
		}finally {
			close(pstmt);
		}

	} // delete() END

	
	/** 자원 해제 메서드들 : Overloading 기법 **/
	public void close(Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Statement, ResultSet CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement, ResultSet  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

}
