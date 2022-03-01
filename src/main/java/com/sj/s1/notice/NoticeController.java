package com.sj.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ModelAndView list()throws Exception {
		ModelAndView mv = new ModelAndView();
		List<NoticeDTO> ar = noticeService.list();
		mv.addObject("list",ar);
		mv.setViewName("notice/list");
		return mv;
	}
	
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public ModelAndView detail(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.detail(noticeDTO);
		mv.addObject("dto",noticeDTO);
		mv.setViewName("notice/detail");
		return mv;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String update(NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.update(noticeDTO);
		
		return "redirect:./list";
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView upate(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.detail(noticeDTO);
		mv.addObject("dto",noticeDTO);
		mv.setViewName("notice/update");
		return mv;				
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public ModelAndView add(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.add(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public ModelAndView add()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/add");
		return mv;
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String delete(NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.delete(noticeDTO);
		return "redirect:./list";
	}
	
}
