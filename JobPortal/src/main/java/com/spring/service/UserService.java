package com.spring.service;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDAO;
import com.spring.model.AppUser;




@Service("userService")
public class UserService {

	@Autowired
	UserDAO userDAO;

	public AppUser register(HttpServletRequest request) {
		AppUser u = new AppUser();
		u.setUserId(Long.valueOf("12"));
		u.setUserName(request.getParameter("username"));
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encrytedPassword = passwordEncoder.encode(request.getParameter("password"));
//		u.setEncrytedPassword(encrytedPassword);
		u.setEnabled(true);
		return userDAO.register(u);
	}

	public AppUser login(HttpServletRequest request) {
		AppUser u = new AppUser();
		u.setUserId(Long.valueOf("12"));
		u.setUserName(request.getParameter("username"));
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encrytedPassword = passwordEncoder.encode(request.getParameter("password"));
//		u.setEncrytedPassword(encrytedPassword);
		u.setEnabled(true);
		return userDAO.login(u);
		
	}	
}
