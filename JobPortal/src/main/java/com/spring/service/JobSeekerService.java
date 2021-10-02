package com.spring.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.JobSeekerDAO;
import com.spring.model.JobSeeker;
import com.spring.service.impl.IJobSeekerService;

@Service
public class JobSeekerService implements IJobSeekerService{

	@Autowired
	JobSeekerDAO jobSeekerDAO;
	@Override
	public JobSeeker save(HttpServletRequest request) {
		JobSeeker j = new JobSeeker();
		j.setCode(request.getParameter("seeker_code"));
		j.setFname(request.getParameter("fname"));
		j.setLname(request.getParameter("lname"));
		j.setPresentaddress(request.getParameter("presentaddress"));
		j.setPermanentaddress(request.getParameter("permanentaddress"));
		j.setNid(request.getParameter("nid"));
		
//		java.sql.Date bithdate = Date.valueOf(request.getParameter("birth"));
//		j.setBirth(bithdate);
		j.setNumber(request.getParameter("number"));
		j.setEmail(request.getParameter("email"));
		j.setPassword(request.getParameter("password"));
		j.setEducation(request.getParameter("education"));
		j.setCompany(request.getParameter("company"));
		return jobSeekerDAO.save(j);
	}
	@Override
	public JobSeeker getById(int id) {
		return jobSeekerDAO.getById(id);
	}
	@Override
	public JobSeeker update(HttpServletRequest request) {
		
		JobSeeker j = new JobSeeker();
		j.setId(Integer.valueOf(request.getParameter("id")));
		j.setFname(request.getParameter("fname"));
		j.setLname(request.getParameter("lname"));
		j.setPresentaddress(request.getParameter("presentaddress"));
		j.setPermanentaddress(request.getParameter("permanentaddress"));
		j.setNid(request.getParameter("nid"));
		
//		java.sql.Date bithdate = Date.valueOf(request.getParameter("birth"));
//		j.setBirth(bithdate);
		j.setNumber(request.getParameter("number"));
		j.setEmail(request.getParameter("email"));
		j.setPassword(request.getParameter("password"));
		j.setEducation(request.getParameter("education"));
		j.setCompany(request.getParameter("company"));
		return jobSeekerDAO.Update(j);
	}

	@Override
	public List<JobSeeker> getAll() {
		return jobSeekerDAO.getAll();
	}

	@Override
	public JobSeeker delete(int id) {
		JobSeeker j = jobSeekerDAO.getById(id);
		return jobSeekerDAO.delete(j);
	}
	public JobSeeker login(HttpServletRequest request) {
		JobSeeker j = new JobSeeker();
		j.setEmail(request.getParameter("email"));
		j.setPassword(request.getParameter("password"));
		return jobSeekerDAO.login(j);
	}

}
