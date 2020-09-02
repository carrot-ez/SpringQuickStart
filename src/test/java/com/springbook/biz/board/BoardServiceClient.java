package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardService;

public class BoardServiceClient {
	public static void main(String args[]) {
		// 1. spring container 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. BoardServcieImpl을 lookup
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		// 3. 글 리스트 보기
		BoardVO vo = new BoardVO();
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println(board.toString());
		}
		
		// 4. close spring container
		container.close();
	}
}
