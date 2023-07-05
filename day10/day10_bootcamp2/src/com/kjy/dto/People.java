package com.kjy.dto;

public class People {
	private int cSeqNo=0;
	private String cName=null; //이름
	private String cRating=null; //멤버 등급
	private String cJoinDate=null; //가입일
	private String cLastDate=null; //최종방문일
	private int cVisitNo=0; //방문횟수
	private int cPostNo=0; //게시글수
	private int cCommentNo=0; 	//댓글수
	private String cGenger=null; //성별
	private String cAge=null;	//연령대
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(int cSeqNo, String cName, String cRating, String cJoinDate, String cLastDate, int cVisitNo,
			int cPostNo, int cCommentNo, String cGenger, String cAge) {
		this.cSeqNo=cSeqNo;
		this.cName = cName;
		this.cRating = cRating;
		this.cJoinDate = cJoinDate;
		this.cLastDate = cLastDate;
		this.cVisitNo = cVisitNo;
		this.cPostNo = cPostNo;
		this.cCommentNo = cCommentNo;
		this.cGenger = cGenger;
		this.cAge = cAge;
	}

	public int getcSeqNo() {
		return cSeqNo;
	}

	public void setcSeqNo(int cSeqNo) {
		this.cSeqNo = cSeqNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcRating() {
		return cRating;
	}

	public void setcRating(String cRating) {
		this.cRating = cRating;
	}

	public String getcJoinDate() {
		return cJoinDate;
	}

	public void setcJoinDate(String cJoinDate) {
		this.cJoinDate = cJoinDate;
	}

	public String getcLastDate() {
		return cLastDate;
	}

	public void setcLastDate(String cLastDate) {
		this.cLastDate = cLastDate;
	}

	public int getcVisitNo() {
		return cVisitNo;
	}

	public void setcVisitNo(int cVisitNo) {
		this.cVisitNo = cVisitNo;
	}

	public int getcPostNo() {
		return cPostNo;
	}

	public void setcPostNo(int cPostNo) {
		this.cPostNo = cPostNo;
	}

	public int getcCommentNo() {
		return cCommentNo;
	}

	public void setcCommentNo(int cCommentNo) {
		this.cCommentNo = cCommentNo;
	}

	public String getcGenger() {
		return cGenger;
	}

	public void setcGenger(String cGenger) {
		this.cGenger = cGenger;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	@Override
	public String toString() {
		return "People [cSeqNo=" + cSeqNo + ", cName=" + cName + ", cRating=" + cRating + ", cJoinDate=" + cJoinDate
				+ ", cLastDate=" + cLastDate + ", cVisitNo=" + cVisitNo + ", cPostNo=" + cPostNo + ", cCommentNo="
				+ cCommentNo + ", cGenger=" + cGenger + ", cAge=" + cAge + "]";
	}

}
