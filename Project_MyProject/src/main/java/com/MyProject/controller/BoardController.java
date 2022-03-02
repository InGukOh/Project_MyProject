package com.MyProject.controller;

import java.awt.print.Pageable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.MyProject.model.BoardVO;
import com.MyProject.model.Criterion;
import com.MyProject.model.PageMakerDTO;
import com.MyProject.service.BoardService;
@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
	/* 글 목록 페이지 접속 */
    @GetMapping("/list")
    // => @RequestMapping(value="list", method=RequestMethod.GET)
    public void boardListGET(Model model , Criterion cri) {
        
        log.info("글 목록 페이지 진입");

        model.addAttribute("list", bservice.getListPaging(cri));
        
        int total = bservice.getTotal(cri);
        
        PageMakerDTO pageMaker = new PageMakerDTO(cri, total);
        
        model.addAttribute("pageMaker", pageMaker);
        
    }
	 
	@GetMapping("/enroll")
	// => @RequestMapping(value="enroll", method=RequestMethod.GET)
	public void boardEnrollGET() {
		
		log.info("글 등록 페이지 진입");
		
	}
	 
	   /* 글 등록 */
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
	        
		log.info("BoardVO : " + board);
		
		bservice.enroll(board);
	    
		rttr.addFlashAttribute("result", "enrol success");
		
		return "redirect:/board/list";
	}
	
	/* 글 조회 */
    @GetMapping("/get")
    public void boardGetPageGET(int num, Model model, Criterion cri) {
        
        model.addAttribute("pageInfo", bservice.getPage(num));
        
        model.addAttribute("cri", cri);
        
        log.info("글 조회 : "+num+" 페이지 진입");
    }
    
    /* 글 수정 페이지 이동 */
    @GetMapping("/modify")
    public void boardModifyGET(int num, Model model,Criterion cri) {
        
        model.addAttribute("pageInfo", bservice.getPage(num));
        
        model.addAttribute("cri",cri);
        
    }
    /* 페이지 내용 수정 */
    @PostMapping("/modify")
    public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
        
        bservice.modify(board);
        
        rttr.addFlashAttribute("result", "modify success");
        
        return "redirect:/board/list";
        
    }
    /* 페이지 삭제 */
    @PostMapping("/setAppear")
    public String boardDeletePOST(int num, RedirectAttributes rttr) {
        
        bservice.setAppear(num);
        
        rttr.addFlashAttribute("result", "delete success");
        
        return "redirect:/board/list";
    }
	
}
