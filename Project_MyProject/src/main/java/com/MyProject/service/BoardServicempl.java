package com.MyProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyProject.mapper.BoardMapper;
import com.MyProject.model.BoardVO;
import com.MyProject.model.Criterion;

@Service
public class BoardServicempl  implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	//글 작성
	@Override
	public void enroll(BoardVO board) {
		mapper.enroll(board);
	}
	
	// 글 목록
	@Override
    public List<BoardVO> getList() {
        
        return mapper.getList();
    }
	
	// 글 조회 
    @Override
    public BoardVO getPage(int num) {
         
        return mapper.getPage(num);
    }
    
    // 글 수정
    @Override
    public int modify(BoardVO board) {
        
        return mapper.modify(board);
    }
    
    //글 삭제 (사용자 글 안보이게)
    @Override
    public int setAppear(int num) {
        
        return mapper.setAppear(num);
    }
    
    //페이징 적용된 글 목록
    @Override
    public List<BoardVO> getListPaging(Criterion cri) {
        
        return mapper.getListPaging(cri);
    }  
}
