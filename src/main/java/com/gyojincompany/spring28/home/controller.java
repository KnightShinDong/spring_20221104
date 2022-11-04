package com.gyojincompany.spring28.home;

import javax.naming.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gyojincompany.spring28.dao.ContentDao;

@Controller
public class controller {
	
	ContentDao dao;
	
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "list";
	}
	
	@RequestMapping(value = "/writeForm")
	public String writeForm() {
		return "writeForm";
	}	
	@RequestMapping(value = "/list")
	public String list() {
		return "list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete() {
		return "redirect:list";
	}
	@RequestMapping(value = "/write")
	public String write() {
		return "redirect:list";
	}
}
