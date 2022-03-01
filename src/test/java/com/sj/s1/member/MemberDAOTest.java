package com.sj.s1.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sj.s1.MyJunitTest;
import com.sj.s1.bankbook.BankBookDTO;

public class MemberDAOTest extends MyJunitTest {
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void updateTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setEmail("test1@naver.com");
		memberDTO.setId("test121");
		memberDTO.setPw("testpw1");
		memberDTO.setName("testname1");
		memberDTO.setPhone("010-21-2122");
		int result = memberDAO.update(memberDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void joinTest()throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setEmail("test@naver.com");
		memberDTO.setId("test12");
		memberDTO.setPw("testpw");
		memberDTO.setName("testname");
		memberDTO.setPhone("010-1121-2122");
		int result =memberDAO.join(memberDTO);
		assertEquals(1, result);
	}
	//@Test
	public void loginTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id12");
		memberDTO.setPw("id2i");
		memberDTO=memberDAO.login(memberDTO);
		assertNotNull(memberDTO);
	}
	//@Test
	public void mypageTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id112");
		memberDTO= memberDAO.mypage(memberDTO);
		assertNotNull(memberDTO);
	}	
}
