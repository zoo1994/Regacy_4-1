package com.sj.s1.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	@Autowired
	private ServletContext servletContext;
	
	public boolean remove(String path,String fileName)throws Exception{
		//파일을 hdd에서 삭제
		//저장된 폴더면,저장된 파일명
		path = servletContext.getRealPath(path);
		File file = new File(path, fileName);
		return file.delete();
	}
	
	public String save(MultipartFile multipartFile,String path)throws Exception{
		//파일저장은 tomcat이 아니라os에서 저장
		//path=/resources/upload/member
		System.out.println(path);
		System.out.println(servletContext);
		String realPath = servletContext.getRealPath(path);
		
		System.out.println(realPath);
		File file = new File(realPath);
//		System.out.println(file2.exists());
//		System.out.println(file2.isDirectory());
		if(!file.exists()) {
			file.mkdirs();//중간폴더가 없으면 에러 중간폴더가 없음녀 중간폴더도 생성
			
		}
		//1.시간
		Calendar ca = Calendar.getInstance();
		long l = ca.getTimeInMillis();//현재 시간을 밀리세컨즈로 변환
		String oriName= multipartFile.getOriginalFilename();
		String fileName = l+"_"+oriName;
		System.out.println("fileName : "+fileName);
		//2.uuid
		fileName=UUID.randomUUID().toString();
		fileName=fileName+"_"+oriName;
		System.out.println("UUID : "+fileName);
		//file hdd에 저장
		//1. multipartFile 클래스의 transferTO 메서드 사용
//		file = new File(realPath,fileName);
//		multipartFile.transferTo(file);
		//2.FileCopyUtils
		file=new File(file,fileName);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		return fileName;
	}
}
