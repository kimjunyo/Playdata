package com.kjy.spring.board.service;

import java.util.List;

import com.kjy.spring.board.vo.BoardVO;

public interface BoardService {
	public List<?> listBoards();

	public void addBoards(BoardVO boardVO);

	public void deleteBoards(String articleNo);

	public void updateBoards();

	public List<?> searchBoards(String title);
}
