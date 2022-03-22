package com.sj.s1.board.notice.noticeReply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/noticeReply/*")
public class NoticeReplyController {
	@Autowired
	private NoticeReplyService noticeReplyService;
	
	@PostMapping("delete")
	public ModelAndView delete(NoticeReplyDTO noticeReplyDTO)throws Exception{
		int result = noticeReplyService.delete(noticeReplyDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/ajaxResult");
		mv.addObject("result",result);
		return mv;
	}	
	
	//@RequestMapping(value="add",method = RequestMethod.POST)
	@PostMapping("add")
	public ModelAndView add(NoticeReplyDTO noticeReplyDTO)throws Exception{
		System.out.println("add");
		ModelAndView mv = new ModelAndView();
		int result = noticeReplyService.add(noticeReplyDTO);
		mv.addObject("result",result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	@GetMapping("list")
	public ModelAndView list(NoticeReplyDTO noticeReplyDTO)throws Exception{
		System.out.println("list");
		System.out.println(noticeReplyDTO.getNum());
		List<NoticeReplyDTO> ar = noticeReplyService.list(noticeReplyDTO);
		System.out.println(ar);
		ModelAndView mv = new ModelAndView();
		mv.addObject("noticeReply",ar);
		mv.setViewName("common/noticeRelpy");
		return mv;
	}
}
