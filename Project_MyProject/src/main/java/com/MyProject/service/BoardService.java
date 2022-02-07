package com.MyProject.service;

import java.util.List;

import com.MyProject.model.BoardVO;

public interface BoardService {

	public void enroll(BoardVO board);

	public List<BoardVO> getList();
	
}
