package com.sj.s1.board;

import java.util.List;

import com.sj.s1.util.Pager;

public interface BoardService {
	
	public List<BoardDTO> list(Pager pager)throws Exception;
	
	public BoardDTO detail(BoardDTO boardDTO)throws Exception;
	
	public int add(BoardDTO boardDTO)throws Exception;

	public int update(BoardDTO boardDTO)throws Exception;
	
	public int delete(BoardDTO boardDTO)throws Exception;
}
