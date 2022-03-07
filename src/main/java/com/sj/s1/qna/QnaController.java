package com.sj.s1.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sj.s1.notice.NoticeDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="delete",method =RequestMethod.GET)
	public String delete(QnaDTO qnaDTO)throws Exception{
		int result = qnaService.delete(qnaDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView update(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.update(qnaDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@RequestMapping(value="update", method =RequestMethod.GET )
	public void update(QnaDTO qnaDTO, Model model)throws Exception{
		qnaDTO=qnaService.detail(qnaDTO);
		model.addAttribute("dto",qnaDTO);
	}
	
	
//	@RequestMapping(value="update", method=RequestMethod.GET)
//	public ModelAndView update(QnaDTO qnaDTO)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		qnaDTO=qnaService.detail(qnaDTO);
//		mv.addObject("dto",qnaDTO);
//		mv.setViewName("qna/update");
//		return mv;
//	}
////	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<QnaDTO> ar = qnaService.list();
		mv.addObject("list",ar);
		mv.setViewName("qna/list");
		return mv;
	}
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public String add()throws Exception{
		return "qna/add";
	}
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String add(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.add(qnaDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value="detail",method =RequestMethod.GET)
	public ModelAndView detail(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaDTO = qnaService.detail(qnaDTO);
		mv.addObject("dto",qnaDTO);
		mv.setViewName("qna/detail");
		return mv;
	}
}

