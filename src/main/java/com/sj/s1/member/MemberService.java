package com.sj.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public int update(MemberDTO memberDTO)throws Exception{
		return memberDAO.update(memberDTO);
	}
	
	public MemberDTO mypage(MemberDTO memberDTO)throws Exception{
		return memberDAO.mypage(memberDTO);
	}
	
	public MemberDTO login(MemberDTO memberDTO) throws Exception{
		return memberDAO.login(memberDTO);
	}
	
	public int join(MemberDTO memberDTO)throws Exception{
		return memberDAO.join(memberDTO);
	}
	
}
