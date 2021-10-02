package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.AdvertiserDAO;
import com.spring.model.Advertiser;
import com.spring.service.impl.IAdvertiserService;
@Service
public class AdvertiserService implements IAdvertiserService {
	
	@Autowired
	AdvertiserDAO advertiserDAO;
	
	@Override
	public Advertiser save(HttpServletRequest request) {
		Advertiser a = new Advertiser();
		a.setCode(request.getParameter("adver_code"));
		a.setFname(request.getParameter("fname"));
		a.setSurname(request.getParameter("surname"));
		a.setAddress(request.getParameter("address"));
		a.setEmail(request.getParameter("email"));
		a.setPassword(request.getParameter("password"));
		a.setComname(request.getParameter("comname"));
//		a.setComwebsite(request.getParameter("comwebsite"));
//		a.setFee(Double.valueOf(request.getParameter("fee")));
		return advertiserDAO.save(a);
	}

	@Override
	public Advertiser getById(int id) {
		return advertiserDAO.getById(id);
	}

	@Override
	public Advertiser update(HttpServletRequest request) {
		Advertiser a = new Advertiser();
		a.setId(Integer.valueOf(request.getParameter("id")));
		a.setFname(request.getParameter("fname"));
		a.setSurname(request.getParameter("surname"));
		a.setAddress(request.getParameter("address"));
		a.setEmail(request.getParameter("email"));
		a.setPassword(request.getParameter("password"));
		a.setComname(request.getParameter("comname"));
//		a.setComwebsite(request.getParameter("comwebsite"));
//		a.setFee(Double.valueOf(request.getParameter("fee")));
		return advertiserDAO.Update(a);
	}

	@Override
	public List<Advertiser> getAll() {
		return advertiserDAO.getAll();
	}

	@Override
	public Advertiser delete(int id) {
		Advertiser a = advertiserDAO.getById(id);
		return advertiserDAO.delete(a);
	}

	public Advertiser login(HttpServletRequest request) {
		Advertiser a = new Advertiser();
		a.setEmail(request.getParameter("email"));
		a.setPassword(request.getParameter("password"));
		return advertiserDAO.login(a);
	}

}
