package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	// Impl CRUD
	// post board
	void insertBoard(BoardVO vo);

	// update board
	void updateBoard(BoardVO vo);

	// delete board
	void deleteBoard(BoardVO vo);

	// get Board
	BoardVO getBoard(BoardVO vo);

	// get list of Board
	List<BoardVO> getBoardList(BoardVO vo);

}