package com.sj.s1.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sj.s1.qna.QnaDAO.";
	
	public List<QnaDTO> list()throws Exception{
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	public int add(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add",qnaDTO);
	}
	
	public QnaDTO detail(QnaDTO qnaDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",qnaDTO);
	}
	
	public int update(QnaDTO qnaDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"update",qnaDTO);
	}
	
	public int delete(QnaDTO qnaDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",qnaDTO);
	}
}
