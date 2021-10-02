package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.AppRole;


@Repository
@Transactional
public class AppRoleDAO {
	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public List<String> getRoleNames(Long userId) {
//        String sql = "Select ur.appRole.roleName from UserRole ur " //
//                + " where ur.appUser.userId = :userId ";
// 
//        Query query = getSession().createQuery(sql);
//        query.setParameter("userId", userId);
//        return query.list();
    	  List<String> roleNames = new ArrayList<String>();
	        roleNames.add("ADMIN");
	        return roleNames;
    }
    
		public List<AppRole> getAllDoc() {
				
				Query query = getSession().createQuery("FROM AppRole");
						
				List<AppRole> entityList = query.list();
				System.out.println("role    ...........   " + entityList.size());
				return entityList;
			}
		 
}
