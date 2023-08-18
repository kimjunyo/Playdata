package com.kjy.spring.board.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class BoardVO {

	private int level=0;
	private int articleNo=0;
	private int parentNo=0;
	private String title="";
	private String content="";
	private Date writeDate=null;
	private String id="";

}
