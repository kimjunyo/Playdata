package com.kjy.spring.board.service;

import java.util.List;

import com.kjy.spring.board.dao.BoardDAO;
import com.kjy.spring.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {
	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	@Override
	public List<?> listBoards() {
		return boardDAO.listBoards();
	}

	@Override
	public void addBoards(BoardVO boardVO) {
		System.out.println(boardDAO.articleNoMax()+1);
		boardVO.setArticleNo(boardDAO.articleNoMax()+1);
		System.out.println(boardVO.getArticleNo());
		boardDAO.addBoards(boardVO);
	}

	@Override
	public void deleteBoards(String articleNo) {
		boardDAO.deleteBoards(articleNo);
	}

	@Override
	public void updateBoards() {
		boardDAO.updateBoards();
	}

	@Override
	public List<?> searchBoards(String title) {
		return boardDAO.searchBoards(title);
	}

}
