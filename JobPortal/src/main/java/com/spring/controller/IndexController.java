package com.spring.controller;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	  public ModelAndView login(@RequestParam(value = "error", required = false) String error,@RequestParam(value = "/logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView(); 
		  if (error != null) {
		  model.addObject("error", "Invalid username and/or password!"); 
	  } 
	  
	  if (logout != null) { 
		  System.out.println(">>>>>>"); 
		  model.addObject("msg", "You've been logged out successfully."); } 
	      model.setViewName("login");
	      return model; 
	  }

	  @RequestMapping(value = "/logout", method = RequestMethod.GET) 
	  public ModelAndView logout() { 
	  ModelAndView model = new ModelAndView();
	  model.addObject("msg", "You've been logged out successfully.");
	  model.setViewName("login");
	  return model;

	  }

	 @RequestMapping("/index")
		public ModelAndView index(Model model, /* Authentication auth, */  Principal p) {
//			String uname = auth.getName();
//			String uname1 = p.getName();
//			model.addAttribute("uname", uname);
//			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//	
//			if (principal instanceof UserDetails) {
//			  String username = ((UserDetails)principal).getUsername();
//			  model.addAttribute("username", username);
//			} else {
//			  String username = principal.toString();
//			  model.addAttribute("username", username);
//			}
			return new ModelAndView("index");
		}

}
	
