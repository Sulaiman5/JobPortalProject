package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.controller.impl.IJobSeekerController;
import com.spring.model.CreateJob;
import com.spring.model.JobSeeker;
import com.spring.service.CreateJobService;
import com.spring.service.JobSeekerService;

@RestController
@RequestMapping(value = "jobseeker")
public class JobSeekerController implements IJobSeekerController{
	
	@Autowired
	JobSeekerService jobSeekerService;
	
	@Autowired
	CreateJobService createJobService;
	
	@Override
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("/jobseeker/create");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		jobSeekerService.save(request);
		List<CreateJob> createJob = createJobService.getAll();
		return new ModelAndView("/jobcreate/show", "createJob", createJob);
	}
	
	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {
		System.out.println(id);
		JobSeeker j = jobSeekerService.getById(Integer.valueOf(id));
		return new ModelAndView("/jobseeker/edit", "j", j);
	}
	
	
	@RequestMapping(value = "/edit_seeker/{id}", method = RequestMethod.GET)
	public JobSeeker editSeeker(@PathVariable String id) {
		JobSeeker j = jobSeekerService.getById(Integer.valueOf(id));
		return j;
	}


	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		JobSeeker j = jobSeekerService.update(request);
	    List<JobSeeker> jobseeker = jobSeekerService.getAll();
	    return new ModelAndView("/jobseeker/show","jobseeker", jobseeker);
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable String id) {
		int pid = Integer.valueOf(id);
		JobSeeker j = jobSeekerService.delete(pid);
		List<JobSeeker> jobseeker = jobSeekerService.getAll();
	    return new ModelAndView("/jobseeker/show","jobseeker", jobseeker);
	}

	@Override
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<JobSeeker> jobseeker = jobSeekerService.getAll();
		return new ModelAndView("/jobseeker/show","jobseeker", jobseeker);
	}
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView loginpage() {
	return new ModelAndView("/jobseeker/login");
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		JobSeeker j = jobSeekerService.login(request);
		if(request.getParameter("email").equals(j.getEmail()) && request.getParameter("password").equals(j.getPassword())) {
			List<CreateJob> createJob = createJobService.getAll();
			return new ModelAndView("/jobcreate/show", "createJob", createJob);
		}
		    return new ModelAndView("/jobseeker/login");
	}
}
