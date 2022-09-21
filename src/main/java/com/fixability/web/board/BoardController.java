 package com.fixability.web.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "board")
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping(value ="bMain")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping(value = "boardList")
	public ModelAndView boardList() {
		
		ModelAndView mv = new ModelAndView();
		List<BoardVO> boardList = boardService.boardList();

		mv.addObject("boardList", boardList);
		mv.setViewName("board/boardList");

		return mv;
	}
}
