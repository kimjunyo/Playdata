package com.kjy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kjy.Query;
import com.kjy.dto.People;

public class MySQLconnector implements Query{
	Connection conn=null;
	public MySQLconnector() {
		// TODO Auto-generated constructor stub
	}
	public void connect() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id_mysql,pw_mysql);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("connect() ERR: "+e.getMessage());
		}
	}
	public ArrayList<People> selectAll() {
		ArrayList<People> peoples=new ArrayList<People>();
		Statement stmt=null;
		ResultSet rs=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(querySelect);
			while(rs.next()) {
				int cSeqNo=rs.getInt(1);
				String cName=rs.getString(2);
				String cRating=rs.getString(3); //멤버 등급
				String cJoinDate=rs.getString(4); //가입일
				String cLastDate=rs.getString(5); //최종방문일
				int cVisitNo=rs.getInt(6); //방문횟수
				int cPostNo=rs.getInt(7); //게시글수
				int cCommentNo=rs.getInt(8); 	//댓글수
				String cGenger=rs.getString(9); //성별
				String cAge=rs.getString(10);	//연령대
				peoples.add(new People(cSeqNo,cName,cRating,cJoinDate,cLastDate,cVisitNo,cPostNo,cCommentNo,cGenger,cAge));
			}
			
		} catch (SQLException e) {
			System.out.println("selectAll() ERR: "+e.getMessage());
		}finally {
			close(stmt,rs);
		}
		return peoples;
	}
	public void ageNull(ArrayList<People> peoples) {
		for(People people:peoples) {
			if(people.getcAge().equals("비공개")) {
				System.out.println(people.getcName()+"의 방문횟수: "+people.getcVisitNo());
			}
		}
	}
	
	public void update(ArrayList<People> peoples) {
		PreparedStatement pstmt=null;
		int rs=0;
		try {
			pstmt=conn.prepareStatement(queryUpdate);
			for(int idx=0;idx<peoples.size();idx++) {
				if(peoples.get(idx).getcGenger().equals("기타") & peoples.get(idx).getcName().equals("김효경")) {
					pstmt.setString(1,"여");
					pstmt.setInt(2,idx+1);
					rs=pstmt.executeUpdate();
				}else if(peoples.get(idx).getcGenger().equals("기타")) {
					pstmt.setString(1,"남");
					pstmt.setInt(2,idx+1);
					rs=pstmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			System.out.println("update() ERR: "+e.getMessage());
		}finally {
			close(pstmt);
			System.out.println("성별 수정 완료하였습니다!");
		}
	}
	
	public double visitAvg(ArrayList<People> peoples) {
		Statement stmt=null;
		ResultSet rs=null;
		String query="select * from bootcamp2";
		int sum=0;
		double visitAvg=0;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				sum+=rs.getInt("cVisitNo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(stmt,rs);
			visitAvg=sum/peoples.size()*1.0;
		}
		System.out.println("평균 방문횟수: "+visitAvg);
		return visitAvg;
	}
	public void visit(double visitAvg) {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="select * from bootcamp2";
		try {
			pstmt=conn.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				if(visitAvg<rs.getInt("cVisitNo")) {
					System.out.println(rs.getString("cName")+" 방문횟수: "+ rs.getInt("cVisitNo"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt,rs);
		}
	}
	public void close(PreparedStatement pstmt,ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("close() ERR: "+e.getMessage());
		}
	}
	
	public void close(Statement stmt,ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("close() ERR: "+e.getMessage());
		}
	}
	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("close() ERR: "+e.getMessage());
		}
	}
}
