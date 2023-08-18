package com.kjy.spring.board.dao;

import java.util.List;

import com.kjy.spring.board.vo.BoardVO;

public interface BoardDAO {
	public List<?> listBoards();

	public void addBoards(BoardVO boardVO);

	public void deleteBoards(String articleNo);

	public void updateBoards();

	public List<?> searchBoards(String title);
	
	public int articleNoMax();
}