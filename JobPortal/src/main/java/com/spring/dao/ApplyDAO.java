package com.spring.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.ApplyJob;
@Transactional
@Repository(value = "applyDAO")
public class ApplyDAO {

	@Autowired
	private EntityManager entityManager;
	
	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	
	public ApplyJob save(ApplyJob a) {
		getSession().save(a);
		getSession().flush();
		return a;
	}

}
