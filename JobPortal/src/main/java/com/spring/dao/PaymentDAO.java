package com.spring.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Payment;

@Transactional
@Repository(value = "paymentDAO")
public class PaymentDAO {

	@Autowired
	private EntityManager entityManager;
	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	
	public Payment save(Payment p) {
		getSession().save(p);
		getSession().flush();
		return p;
	}

}
