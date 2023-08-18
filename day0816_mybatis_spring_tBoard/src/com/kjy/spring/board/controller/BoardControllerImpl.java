package com.kjy.spring.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.kjy.spring.board.service.BoardService;
import com.kjy.spring.board.vo.BoardVO;

public class BoardControllerImpl extends MultiActionController implements BoardController {
	private BoardService boardService;

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	@Override
	public ModelAndView listBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String path=getViewName(request);
		List<?> boardsList=boardService.listBoards();
		ModelAndView mav=new ModelAndView(path);
		mav.addObject("boardsList",boardsList);
		System.out.println(path);
		return mav;
	}

	@Override
	public ModelAndView boardForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String path = getViewName(request);
		ModelAndView mav = new ModelAndView(path);
		return mav;
	}

	@Override
	public ModelAndView addBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BoardVO boardVO=new BoardVO();
		bind(request, boardVO);
		boardService.addBoards(boardVO);
		ModelAndView mav = new ModelAndView("redirect:/board/listBoards.do");
		System.out.println("yaho");
		return mav;
	}

	@Override
	public ModelAndView deleteBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String articleNo=request.getParameter("articleNo");
		boardService.deleteBoards(articleNo);
		ModelAndView mav = new ModelAndView("redirect:/board/listBoards.do");
		return mav;
	}

	@Override
	public ModelAndView updateBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	}

	@Override
	public ModelAndView searchBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String title=request.getParameter("title");
		List<?> boardsList=boardService.searchBoards(title);
		ModelAndView mav=new ModelAndView("/listBoards");
		mav.addObject("boardsList",boardsList);
		return mav;
	}

	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		return fileName;
	}
}
