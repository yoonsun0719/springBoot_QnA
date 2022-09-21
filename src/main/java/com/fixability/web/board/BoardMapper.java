package com.fixability.web.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

	List<BoardVO> boardList();

}
