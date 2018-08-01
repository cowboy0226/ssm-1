package com.wip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wip.model.UserDomain;
import com.wip.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService UserService;
	
	@RequestMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView modelAndView = new ModelAndView("index");
		UserDomain userDomain = UserService.findUserById(1);
		System.out.println(userDomain.toString());
		modelAndView.addObject("user",userDomain);
		return modelAndView;
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "index";
	}
	

}
