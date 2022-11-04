package com.gyojincompany.spring28.home;

import java.util.ArrayList;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gyojincompany.spring28.dao.ContentDao;
import com.gyojincompany.spring28.dto.ContentDto;

@Controller
public class controller {
	
	ContentDao dao;
	
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:list";
	}
	
	@RequestMapping(value = "/writeForm")
	public String writeForm() {
		
		return "writeForm";
	}	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request ,Model model) {
		
		ArrayList<ContentDto> dtos = dao.listDao();
		model.addAttribute("list" ,dtos);
		return "list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request) {
		
		String mid = request.getParameter("mid");
		
		dao.deleteDao(mid);
		
		
		
		return "redirect:list";
	}
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request) {
		
		String mwrite = request.getParameter("mwrite");
		String mcontent =request.getParameter("mcontent");
		
		dao.writeDao(mwrite, mcontent);
		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request) {
		
		String mwrite = request.getParameter("mwrite");
		String mcontent =request.getParameter("mcontent");
		
		dao.writeDao(mwrite, mcontent);
		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify_view")
	public String modify_view(HttpServletRequest request) {
		
		
		String mwrite = request.getParameter("mwrite");
		String mcontent =request.getParameter("mcontent");
		
		dao.writeDao(mwrite, mcontent);
		
						

		
		return "modify_view";
	}
}
