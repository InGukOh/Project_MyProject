package com.MyProject.service;

import java.util.List;

import com.MyProject.model.BoardVO;
import com.MyProject.model.Criterion;

public interface BoardService {
	//글 작성
	public void enroll(BoardVO board);
	//글 목록
	public List<BoardVO> getList();
	
	//페이징 적용된 글 목록
	public List<BoardVO> getListPaging(Criterion cri);
	
	//글 조회 
	public BoardVO getPage(int num);
	//글 수정
    public int modify(BoardVO board);
    //글 삭제 (사용자 글 안보이게)
  	public int setAppear(int num);
}
