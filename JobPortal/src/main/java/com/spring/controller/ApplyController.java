package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.ApplyJob;
import com.spring.service.ApplyService;

@RestController
@RequestMapping(value = "apply")
public class ApplyController {
	
	@Autowired
	ApplyService applyService;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
	return new ModelAndView("/jobcreate/welcome");
}	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
	ApplyJob a =	applyService.save(request);
	System.out.println(request.getParameter("fname"));
	return new ModelAndView("/jobcreate/welcome");
	}
	

}
