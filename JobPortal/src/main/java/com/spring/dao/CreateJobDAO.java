package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.dao.impl.ICreateJobDAO;
import com.spring.model.Advertiser;
import com.spring.model.CreateJob;

@Transactional
@Repository(value = "createJobDAO")
public class CreateJobDAO implements ICreateJobDAO{

	@Autowired
	private EntityManager entityManager;
	
	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	@Override
	public CreateJob save(CreateJob t) {
		getSession().save(t);
		getSession().flush();
		return t;
	}

	@Override
	public CreateJob getById(int id) {
		String query = "from createjob where id = '"+id+"'";
		List<CreateJob> createJob = getSession().createQuery(query).list();
		return createJob.get(0);
	}

	@Override
	public CreateJob Update(CreateJob t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreateJob> getAll() {
		String qls = "from createjob";
		List<CreateJob> createJob = getSession().createQuery(qls).list();
		return createJob;
	}

	@Override
	public CreateJob delete(CreateJob t) {
		// TODO Auto-generated method stub
		return null;
	}

}
