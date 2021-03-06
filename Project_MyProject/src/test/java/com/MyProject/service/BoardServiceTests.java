package com.MyProject.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.MyProject.model.BoardVO;
import com.MyProject.model.Criterion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
    
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
    @Autowired
    private BoardService service;
    
    /*
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("service test");
        vo.setContent("service test");
        vo.setWriter("service test");
        
        service.enroll(vo);
        
    }
    
    
    // 글 목록 테스트
    @Test
    public void testGetList() {
        
        service.getList().forEach(board -> log.info("" + board));        
        
    }
    
    // 글 조회
    @Test
    public void testGETPage() {
        
        int num = 8;
        
        log.info("" + service.getPage(num));
        
    }
    */
    
    // 글 수정
	/*
	 * @Test public void testModify() {
	 * 
	 * BoardVO board = new BoardVO(); board.setNum(8); board.setTitle("수정 제목");
	 * board.setContent("수정 내용");
	 * 
	 * int result = service.modify(board); log.info("result : " +result);
	 * 
	 * }
	 */
    
	/*
	 * // 글 삭제
	 * 
	 * @Test public void testDelete() {
	 * 
	 * int result = service.setAppear(3); log.info("result : " + result);
	 * 
	 * }
	 */
    
    /* 목록 페이징 적용 테스트 */
    @Test
    public void testGetListPaging() {
        
        Criterion cri = new Criterion();
        
        List list = service.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
        
    }
}
