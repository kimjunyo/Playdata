package com.kjy.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kjy.spring.board.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<?> listBoards() {
		return sqlSession.selectList("mapper.board.boardsAllList");
	}

	@Override
	public void addBoards(BoardVO boardVO) {
		System.out.println(boardVO.toString());
		sqlSession.insert("mapper.board.insertBoard",boardVO);
	}

	@Override
	public void deleteBoards(String articleNo) {
		sqlSession.delete("mapper.board.deleteBoard",articleNo);
	}

	@Override
	public void updateBoards() {
	}

	@Override
	public List<?> searchBoards(String title) {
		return sqlSession.selectList("mapper.board.boardsSearch",title);
	}

	@Override
	public int articleNoMax() {
		return (int) sqlSession.selectOne("mapper.board.articleNoMax");
	}

}
