package com.sj.s1.util;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class FileManager {
	
	@Autowired
	private ServletContext servletContext;
	
	public String save(MultipartFile file,String path)throws Exception{
		//파일저장은 tomcat이 아니라os에서 저장
		//path=/resources/upload/member
		String realPath = servletContext.getRealPath(path);
		System.out.println(realPath);
		return "";
	}
}
