package com.store.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.books.utilities.StoreUtil;

@Controller
public class MainController {
	
	@RequestMapping(value="/")
	public String redirect2Index(Model model) throws Exception
	{
		model.addAttribute("items", StoreUtil.getItems());
		model.addAttribute("contacts", StoreUtil.getContacts());
		return "redirect:/index";
	}
	
	@RequestMapping(value="/index")
	public String returnIndex()
	{
		return "index";
	}
	
}
