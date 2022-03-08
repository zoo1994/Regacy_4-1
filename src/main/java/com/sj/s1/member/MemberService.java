package com.sj.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.sj.s1.util.FileManager;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private FileManager fileManager;
	
	public MemberDTO mypage(MemberDTO memberDTO)throws Exception{
		return memberDAO.mypage(memberDTO);
	}
	
	public MemberDTO login(MemberDTO memberDTO) throws Exception{
		return memberDAO.login(memberDTO);
	}
	
	public int join(MemberDTO memberDTO,MultipartFile photo)throws Exception{
		//1. 파일을 HDD에 저장
		
		//2. 정보를 DB에 저장
		fileManager.save(photo, "resources/upload/member/");
		return memberDAO.join(memberDTO);
	}
	
}
