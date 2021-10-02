package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.controller.impl.IAdvertiserController;
import com.spring.model.Advertiser;
import com.spring.service.AdvertiserService;

@RestController
@RequestMapping(value = "advertiser")
public class AdvertiserController implements IAdvertiserController{

	@Autowired
	AdvertiserService advertiserService;
	
	@Override
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("advertisers/create");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		advertiserService.save(request);
		System.out.println(request.getParameter(""));
		return new ModelAndView("/jobcreate/create");
	}

	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {
		Advertiser b =	advertiserService.getById(Integer.valueOf(id));
		return new ModelAndView("/advertisers/edit", "b", b);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		Advertiser b = advertiserService.update(request);
		List<Advertiser> advertiser = advertiserService.getAll();
		return new ModelAndView("/advertisers/show", "advertiser", advertiser);
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable String id) {
		int pid = Integer.valueOf(id);
		Advertiser t =	advertiserService.delete(pid);
		List<Advertiser> advertiser = advertiserService.getAll();
		return new ModelAndView("/advertisers/show", "advertiser", advertiser);
	}

	@Override
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<Advertiser> advertiser = advertiserService.getAll();
		return new ModelAndView("/advertisers/show", "advertiser", advertiser);
	}
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView loginpage() {
		return new ModelAndView("/advertisers/login");
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		Advertiser a = advertiserService.login(request);
		if(request.getParameter("email").equals(a.getEmail())&& request.getParameter("password").equals(a.getPassword())) {
			return new ModelAndView("/jobcreate/create") ;
		}else {
		    return new ModelAndView("/advertisers/login");
		}
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("/advertisers/welcome");
	}
}
