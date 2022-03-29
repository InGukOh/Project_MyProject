<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>enroll</title>
<script>document.execCommand('defaultParagraphSeparator', false, 'p');</script>
</head>
<style>
div#contents {

width: 800px;
min-height: 400px;
}
</style>
<body>

<div id="wrap">

	<h1>게시판 등록</h1>
	
	<form action="/board/enroll" method="post">
	
	    <div class="input_wrap">
	        <label>Title</label>
	        <input name="title" id="title">
	    </div>
	    
	    <div class="input_wrap">
	    	<div class="editor-menu"> 
	    		<button id="btn-bold" type="button"> <b>B</b> </button>
	    		<button id="btn-italic" type="button"> <i>I</i> </button>
	    		<button id="btn-underline" type="button"> <u>U</u> </button>
	    		<button id="btn-strike" type="button"> <s>S</s> </button> 
	    		<button id="btn-ordered-list" type="button"> OL </button> 
	    		<button id="btn-unordered-list" type="button"> UL </button> 
	   			<button id="btn-image" type="button"> 이미지 추가 </button> </div>

	    	<div contenteditable="true" id=contents>편집기능</div>
	        <label>Content</label>
	        <textarea rows="3" name="content"></textarea>
	    </div>
	    
	    <div class="input_wrap">
	        <label>Writer</label>
	        <input name="writer">
	    </div>
	    
	    <button id="submit">등록</button>
	    
	</form>
	<button class="btn-pageback" onclick="history.back()">글쓰기 취소</button>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/10.5.0/highlight.min.js"></script>
<script>

const editor = document.getElementById('editor'); 
const btnBold = document.getElementById('btn-bold'); 
const btnItalic = document.getElementById('btn-italic'); 
const btnUnderline = document.getElementById('btn-underline'); 
const btnStrike = document.getElementById('btn-strike'); 
const btnOrderedList = document.getElementById('btn-ordered-list'); 
const btnUnorderedList = document.getElementById('btn-unordered-list'); 



btnBold.addEventListener('click', function () {
	setStyle('bold'); 
	}); 
btnItalic.addEventListener('click', function () { 
	setStyle('italic'); 
	}); 
btnUnderline.addEventListener('click', function () {
	setStyle('underline'); 
	}); 
btnStrike.addEventListener('click', function () { 
	setStyle('strikeThrough') 
	}); 
btnOrderedList.addEventListener('click', function () { 
	setStyle('insertOrderedList'); 
	}); 
btnUnorderedList.addEventListener('click', function () { 
	setStyle('insertUnorderedList'); 
	}); 
function setStyle(style) { 
	document.execCommand(style); focusEditor(); 
	} 
function focusEditor() { 
	editor.focus({preventScroll: true}); 
	} 

</script>

</body>
</html>