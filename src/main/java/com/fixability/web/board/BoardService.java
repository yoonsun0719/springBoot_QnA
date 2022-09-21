package com.fixability.web.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardMapper {
	
	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> boardList() {
		List<BoardVO> boardList =boardMapper.boardList();
		return boardList;
	}

}
