<%@ page import = "com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import = "com.springbook.biz.board.BoardVO"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%
	// 1. ����� �Է� ���� ����
	String seq = request.getParameter("seq");

	// 2. DB ���� ó��
	BoardDAO boardDAO = new BoardDAO();
	BoardVO vo = new BoardVO();
	
	vo.setSeq(Integer.parseInt(seq));
	boardDAO.deleteBoard(vo);
	
	// 3. ȭ�� �׺���̼�
	response.sendRedirect("getBoardList.jsp");
%>