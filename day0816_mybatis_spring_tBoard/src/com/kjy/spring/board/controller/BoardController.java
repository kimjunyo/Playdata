package com.kjy.spring.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface BoardController {
	public ModelAndView listBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView boardForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView deleteBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView updateBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView searchBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
