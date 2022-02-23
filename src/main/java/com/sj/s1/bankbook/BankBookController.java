package com.sj.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	

	
	@RequestMapping("delete")
	public String delete(BankBookDTO bankBookDTO)throws Exception{
		int result =bankBookService.delete(bankBookDTO);
		return "redirect:./list";
	}
	
	//db에 insert
	@RequestMapping(value = "add" , method = RequestMethod.POST )
	public String add(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.add(bankBookDTO);
		
		return "redirect:./list";
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add()throws Exception{
		
	}
	
	@RequestMapping(value="detail", method= RequestMethod.GET)
	public void detail(BankBookDTO bankBookDTO, Model model)throws Exception{
		bankBookDTO= bankBookService.detail(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
	}
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mv)throws Exception{
		//ModelAndView
		//매개변수 선언
		//메서드내에서 객체 생성
		//ModelAndView modelAndView = new ModelAndView();
		List<BankBookDTO> ar = bankBookService.list();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/list");
		return mv;
	}
}
