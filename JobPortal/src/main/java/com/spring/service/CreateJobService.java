/**
 * 
 */
package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.CreateJobDAO;
import com.spring.model.CreateJob;
import com.spring.service.impl.ICreateJobService;

/**
 * @author mdsul
 *
 */
@Service
public class CreateJobService implements ICreateJobService{

	@Autowired
	CreateJobDAO createJobDAO;
	
	@Override
	public CreateJob save(HttpServletRequest request) {
		CreateJob c = new CreateJob();
		c.setCode(request.getParameter("create_code"));
		c.setAdver_code(request.getParameter("adver_code"));
		c.setFname(request.getParameter("adver_name"));
		c.setJobname(request.getParameter("jobname"));
		c.setJobtitle(request.getParameter("jobtitle"));
		c.setResponsibilities(request.getParameter("responsibilities"));
		c.setEducational(request.getParameter("educational"));
		c.setExperience(request.getParameter("experience"));
		c.setAge(request.getParameter("age"));
		c.setJoblocation(request.getParameter("joblocation"));
		c.setSalary(request.getParameter("salary"));
		return createJobDAO.save(c);
	}

	@Override
	public CreateJob getById(int id) {
		return createJobDAO.getById(id);
	}

	@Override
	public CreateJob update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreateJob> getAll() {
		
		return createJobDAO.getAll();
	}

	@Override
	public CreateJob delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CreateJob> getAllpage() {
		// TODO Auto-generated method stub
		return null;
	}

}
