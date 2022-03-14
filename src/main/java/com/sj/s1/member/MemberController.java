package com.sj.s1.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService memberServiece;
	
	@ModelAttribute("board")
	public String getBoard() {
		return "member";
	}
	
	@RequestMapping(value = "photoDown",method = RequestMethod.GET)
	public ModelAndView fileDown(MemberFileDTO memberFileDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fileDown");
		memberFileDTO=memberServiece.detailFile(memberFileDTO);
		mv.addObject("file",memberFileDTO);
		return mv;
	}
	
	@RequestMapping(value = "mypage",method = RequestMethod.GET)
	public String mypage(Model model, MemberDTO memberDTO, HttpSession session)throws Exception{
		memberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO=memberServiece.mypage(memberDTO);
		model.addAttribute("member",memberDTO);
		return "member/mypage";
	}
	
//	@RequestMapping(value = "mypage",method = RequestMethod.GET)
//	public ModelAndView mypage(HttpSession session)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
//		memberDTO = memberServiece.mypage(memberDTO);
//		mv.setViewName("member/mypage");
//		mv.addObject("member",memberDTO);
//		return mv;
//	}
	
	//logout
	@RequestMapping(value="logout",method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session, MemberDTO memberDTO, String remember, Model model, HttpServletResponse response)
			throws Exception {
		memberDTO = memberServiece.login(memberDTO);
		System.out.println("remember : " + remember);
		if (remember!=null && remember.equals("1")) {
			// cookie 생성
			Cookie cookie = new Cookie("remember", memberDTO.getId());
			//cookie.setPath("/");
			cookie.setMaxAge(-1);
			// 응답
			response.addCookie(cookie);
		}else {
			Cookie cookie = new Cookie("remember","");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			
		}
//		String path = "redirect:./login";
//
//		if (memberDTO != null) {
//			session.setAttribute("member", memberDTO);
//			path = "redirect:../";
//		}
		String message="Login Fail";
		String p="./login";
		if(memberDTO!=null) {
			session.setAttribute("member", memberDTO);
			message="Login Success";
			p="../";
		}
		model.addAttribute("message",message);
		model.addAttribute("path",p);
		String path="common/result";
		return path;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void login(Model model,@CookieValue(value="remember",defaultValue="",required = false)String rememberId) throws Exception {
		model.addAttribute("rememberId",rememberId);
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void join() throws Exception {
	}

	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(MemberDTO memberDTO,MultipartFile photo) throws Exception {
		int result = memberServiece.join(memberDTO,photo);
		System.out.println(photo.getOriginalFilename());
		System.out.println(photo.getSize());
		return "redirect:../";
	}
	
	@RequestMapping(value="joinCheck", method=RequestMethod.GET)
	public void joinCheck()throws Exception{
		
	}
}
