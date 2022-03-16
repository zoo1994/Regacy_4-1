package com.sj.s1.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sj.s1.member.MemberDTO;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Login Interceptor");
		MemberDTO memberDTO=(MemberDTO)request.getSession().getAttribute("member");
		
		boolean check = true;
		if(memberDTO==null) {
			check=false;
			//1. foward형식 -servlet문법사용
			//request.setAttribute("message", "로그인이 필요합니다.");
			//request.setAttribute("path", "../member/login");
			//RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/common/result.jsp");
		//	view.forward(request, response);
			
			//2.redirect
			response.sendRedirect("../member/login");
		}
		return super.preHandle(request, response, handler);
	}
}
