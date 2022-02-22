package com.MyProject.model;

import java.util.Date;

public class BoardVO {

    /* 글 번호 */
    private int num;
    
    /* 글 제목 */
    private String title;
    
    /* 글 내용 */
    private String content;
    
    /* 글 작성자 */
    private String writer;
    
    /* 등록 날짜 */
    private Date regdate;
    
    /* 수정 날짜 */
    private Date updateDate;
    
    /* 글 보이기 (0 = 안보임)*/
    private int appear;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public int getAppear() {
		return appear;
	}

	public void setAppear(int appear) {
		this.appear = appear;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", updateDate=" + updateDate + ", appear=" + appear + "]";
	}
    
    
}
