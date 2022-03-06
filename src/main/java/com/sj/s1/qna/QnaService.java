package com.sj.s1.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<QnaDTO> list() throws Exception{
		return qnaDAO.list();
	}
	
	public int add(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.add(qnaDTO);
	}
	
	public QnaDTO detail(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.detail(qnaDTO);
	}
	
	public int update(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.update(qnaDTO);
	}
	
	public int delete(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.delete(qnaDTO);
	}
}
