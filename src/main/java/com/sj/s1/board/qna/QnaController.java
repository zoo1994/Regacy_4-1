package com.sj.s1.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sj.s1.board.BoardDTO;
import com.sj.s1.util.Pager;

@Controller
@RequestMapping(value="/qna/**")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@ModelAttribute("board")
	public String board() {
		return "Qna";
	}
	
	@RequestMapping(value="reply", method=RequestMethod.POST)
	public ModelAndView reply(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.reply(qnaDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@RequestMapping(value="reply", method=RequestMethod.GET)
	public ModelAndView reply(QnaDTO qnaDTO,ModelAndView mv)throws Exception{
		mv.addObject("dto", qnaDTO);//부모글번호
		mv.setViewName("board/reply");
		return mv;
	}
		
	// list
		@RequestMapping(value = "list", method = RequestMethod.GET)
		public String list(Model model, Pager pager) throws Exception {
		
			List<BoardDTO> ar = qnaService.list(pager);
			model.addAttribute("list", ar);
			model.addAttribute("pager", pager);

			return "board/list";
		}
		
		// add get
		@RequestMapping(value = "add", method = RequestMethod.GET)
		public String add() throws Exception {
			return "board/add";
		}
		
		// add post
		@RequestMapping(value = "add", method = RequestMethod.POST)
		public String add(QnaDTO qnaDTO) throws Exception {
			int result = qnaService.add(qnaDTO);
			
			return "redirect:./list";
		}
		
		// detail
		@RequestMapping(value = "detail", method = RequestMethod.GET)
		public ModelAndView detail(QnaDTO qnaDTO) throws Exception {
			ModelAndView mv = new ModelAndView();
			BoardDTO boardDTO = qnaService.detail(qnaDTO);
			mv.addObject("dto",boardDTO);
			mv.setViewName("board/detail");
			return mv;
		}
		
		// update get
		@RequestMapping(value = "update", method = RequestMethod.GET)
		public String update(QnaDTO qnaDTO, Model model) throws Exception {
			BoardDTO boardDTO = qnaService.detail(qnaDTO);
			model.addAttribute("dto", boardDTO);
			
			return "board/update";
		}
		
		// update post
		@RequestMapping(value = "update", method = RequestMethod.POST)
		public String update(QnaDTO qnaDTO) throws Exception {
			int result = qnaService.update(qnaDTO);
			
			return "redirect:./list";
		}
		
		// delete
		@RequestMapping(value = "delete", method = RequestMethod.GET)
		public String delete(QnaDTO qnaDTO) throws Exception {
			int result = qnaService.delete(qnaDTO);
			
			return "redirect:./list";
		}

}
