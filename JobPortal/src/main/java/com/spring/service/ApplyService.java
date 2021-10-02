package com.spring.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ApplyDAO;
import com.spring.model.ApplyJob;



@Service
public class ApplyService {

	@Autowired
	ApplyDAO applyDAO;
	
	public ApplyJob save(HttpServletRequest request) {
		ApplyJob a = new ApplyJob();
		a.setJobtitle(request.getParameter("jobtitle"));
		a.setLocation(request.getParameter("location"));
		a.setCivi(request.getParameter("civi"));
		a.setProposel(request.getParameter("proposel"));
		a.setAdver_code(request.getParameter("adver_code"));
		a.setCreate_code(request.getParameter("create_code"));
		a.setSeeker_code(request.getParameter("seeker_code"));
		a.setFname(request.getParameter("fname"));
		a.setLname(request.getParameter("lname"));
		a.setNid(request.getParameter("nid"));
		a.setEmail(request.getParameter("email"));
		return applyDAO.save(a);
	}
}
