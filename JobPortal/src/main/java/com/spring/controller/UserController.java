package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.AppUser;
import com.spring.service.UserService;


@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/registerpage", method = RequestMethod.GET)
	public ModelAndView registerpage() {
		return new ModelAndView("user/register");
	}
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView loginpage() {
		return new ModelAndView("user/login");
	}
	@RequestMapping(value = "/forgetform", method = RequestMethod.GET)
	public ModelAndView forgetform() {
		return new ModelAndView("user/forgetform");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request) {
		 userService.register(request);
		return new ModelAndView("user/login");
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		AppUser u = userService.login(request);
		if(request.getParameter("username").equals(u.getUserName()) && request.getParameter("password").equals(u.getEncrytedPassword())) {
			return new ModelAndView("user/welcome");
		}else {
			return new ModelAndView("user/error");
		}
		
	}
}
