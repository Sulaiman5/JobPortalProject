package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.AppUser;

@Repository
@Transactional
public class AppUserDAO {
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    public AppUser findUserAccount(String userName) {
        try {
//        	Query query = getSession().createQuery("FROM AppUser where userName = :userName");
//        	 query.setParameter("userName", userName);
//        	 List<AppUser> list = query.list();
        	// Prep work

        	AppUser appUser = null;
        	SQLQuery query = getSession().createSQLQuery("select * from app_user where user_name = '"+userName+"'");
        	List<Object[]> rows = query.list();

        	for(Object[] row : rows){
        		System.out.println(row[1].toString());
        		System.out.println(row[2].toString());
           	   appUser = new AppUser(null, row[1].toString(), row[2].toString(), false);

        	}
        	return appUser;
        	
        } catch (NoResultException e) {
            return null;
        }
    }
}
