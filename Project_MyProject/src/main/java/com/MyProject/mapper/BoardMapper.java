package com.MyProject.mapper;

import java.util.List;

import com.MyProject.model.BoardVO;

public interface BoardMapper {
	
	 public void enroll(BoardVO board);
	
	 public List<BoardVO> getList();
	 
}
