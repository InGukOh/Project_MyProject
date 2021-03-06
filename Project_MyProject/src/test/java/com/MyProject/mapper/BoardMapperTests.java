package com.MyProject.mapper;

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
public class BoardMapperTests {

	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);

	@Autowired
	private BoardMapper mapper;
	/*
	 * // 글 입력 테스트
	 * 
	 * @Test public void testEnroll() {
	 * 
	 * BoardVO vo = new BoardVO();
	 * 
	 * vo.setTitle("mapper test"); vo.setContent("mapper test");
	 * vo.setWriter("mapper test");
	 * 
	 * mapper.enroll(vo);
	 * 
	 * }
	 * 
	 * 
	 * // 글 리스트 테스트
	 * 
	 * @Test public void testGetList() {
	 * 
	 * 
	 * List list = mapper.getList(); // 일반적 for문 for(int i = 0; i < list.size();i++)
	 * { log.info("" + list.get(i)); }
	 * 
	 * // foreach문(향상된 for문) for(Object a : list) { log.info("" + a); }
	 * 
	 * // foreach문 & 람다식 list.forEach(board -> log.info("" + board));
	 * 
	 * }
	 */
	// 조회
	/*
	 * @Test public void testGetPage() {
	 * 
	 * 실제 존재하는 페이지 int num = 8;
	 * 
	 * log.info("" + mapper.getPage(num));
	 * 
	 * }
	 */
	/* 글 수정 테스트*/
	/*
	 * @Test public void testModify() {
	 * 
	 * BoardVO board = new BoardVO(); board.setNum(99); board.setTitle("수정 제목");
	 * board.setContent("수정 내용");
	 * 
	 * int result = mapper.modify(board); log.info("result : " +result);
	 * 
	 * }
	 */
	/* 글 삭제 테스트 */
	/*
	 * @Test public void testDelete() {
	 * 
	 * int result = mapper.setAppear(3); log.info("result : " + result);
	 * 
	 * }
	 */
	
	/* 목록 페이징 적용 테스트 */
	
	 @Test
     public void testGetListPaging() {
         
         Criterion cri = new Criterion();
         
         cri.setPageNum(2);
                          
         List list = mapper.getListPaging(cri);
         
         list.forEach(board -> log.info("" + board));
     }

}
