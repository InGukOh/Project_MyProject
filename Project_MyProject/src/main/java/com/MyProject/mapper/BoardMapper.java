package com.MyProject.mapper;

import java.util.List;

import com.MyProject.model.BoardVO;

public interface BoardMapper {
	//글 작성
	 public void enroll(BoardVO board);
	//글 목록
	 public List<BoardVO> getList();
	//글 조회 
	 public BoardVO getPage(int num);
	 
}
