package com.MyProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyProject.mapper.BoardMapper;
import com.MyProject.model.BoardVO;

@Service
public class BoardServicempl  implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVO board) {
		mapper.enroll(board);
	}
}
