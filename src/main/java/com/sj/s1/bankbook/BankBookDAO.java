package com.sj.s1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BankBookDAO {
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.sj.s1.bankbook.BankBookDAO.";
	
	//detail
	public BankBookDTO detail(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",bankBookDTO);
	}
	
	//list
	public List<BankBookDTO> list() throws Exception{
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	//insert
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add",bankBookDTO);
	}
	
	//delete
	public int delete(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",bankBookDTO);
	}
}