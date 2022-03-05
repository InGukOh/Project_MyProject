package com.MyProject.model;

import java.util.Arrays;

public class Criterion {
	
	/* 현재 페이지 */
    private int pageNum;
    
    /* 한 페이지 당 보여질 게시물 갯수 */
    private int ListCount;
    
    /* 검색어 입력*/
    private String KeyWord;
    
    /* 스킵 할 게시물 수( (pageNum-1) * ListCount ) */
    private int skip;
    
    /* 검색 타입 */
    private String type;
    
    /* 검색 타입 배열 */
    private String[] typeArr;
    
    /* 기본 생성자 -> 기봅 세팅 : pageNum = 1, ListCount = 10 */
    public Criterion() {
        this(1,10);
        this.skip = 0;
    }
    
    /* 생성자 => 원하는 pageNum, 원하는 ListCount */
    public Criterion(int pageNum, int ListCount) {
        this.pageNum = pageNum;
        this.ListCount = ListCount;
        this.skip = (pageNum-1)*ListCount;
    }

	public int getPageNum() {
		return pageNum;
	}
	

	 /* 
	  * setListCount(), setPageNum() 메소드를 호출한다는 것은 
	  * ListCount, pageNum 값을 변경한다는 것을 의미 
	  * 따라서 skip의 값또한 변경되어야 하기 때문에 
	  * 해당 메소드 구현부에 skip값이 변경되도록 코드를 추가
	 */

	public void setPageNum(int pageNum) {
		
		this.skip = (pageNum-1)*this.ListCount;
		
		this.pageNum = pageNum;
	}

	public int getListCount() {
		return ListCount;
	}

	public void setListCount(int listCount) {
		
		this.skip = (pageNum-1)*this.ListCount;
		
		ListCount = listCount;
	}

	public String getKeyWord() {
		return KeyWord;
	}

	public void setKeyWord(String keyWord) {
		this.KeyWord = keyWord;
	}

	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		this.typeArr = type.split("");
	}

	public String[] getTypeArr() {
		return typeArr;
	}

	public void setTypeArr(String[] typeArr) {
		this.typeArr = typeArr;
	}

	@Override
	public String toString() {
		return "Criterion [pageNum=" + pageNum + ", ListCount=" + ListCount + ", KeyWord=" + KeyWord + ", skip=" + skip
				+ ", type=" + type + ", typeArr=" + Arrays.toString(typeArr) + "]";
	}

	

	
	
	

	
    

}
