package com.sj.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;
	
	public int update(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.update(noticeDTO);
	}
	
	public int add(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.add(noticeDTO);
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.detail(noticeDTO);
	}
	
	public List<NoticeDTO> list ()throws Exception{
		return noticeDAO.list();
	}
}
