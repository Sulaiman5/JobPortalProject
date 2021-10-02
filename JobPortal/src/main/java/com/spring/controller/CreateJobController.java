package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Advertiser;
import com.spring.model.CreateJob;
import com.spring.model.JobSeeker;
import com.spring.service.AdvertiserService;
import com.spring.service.CreateJobService;
import com.spring.service.JobSeekerService;

@RestController
@RequestMapping(value = "createJob")
public class CreateJobController implements ICommonController{

	@Autowired
	CreateJobService createJobService;
	
	@Autowired
	AdvertiserService advertiserService;
	
	@Autowired
	JobSeekerService jobSeekerService;
	
	@Override
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		List<Advertiser> advertiser = advertiserService.getAll();
		return new ModelAndView("/jobcreate/create","advertiser", advertiser );
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		createJobService.save(request);
		return new ModelAndView("/jobcreate/create");
	}
	
	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {
		CreateJob c = createJobService.getById(Integer.valueOf(id));
		return new ModelAndView("/jobcreate/showpage", "c", c);
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		
		return null;
	}

	@Override
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<CreateJob> createJob = createJobService.getAll();
		return new ModelAndView("index", "createJob", createJob);
	}

	@RequestMapping(value = "/showpage", method = RequestMethod.GET)
	public  ModelAndView getAllpage() {
		List<CreateJob> createJob = createJobService.getAllpage();
		return new ModelAndView("/jobcreate/showpage", "createJob", createJob);
	}
}
