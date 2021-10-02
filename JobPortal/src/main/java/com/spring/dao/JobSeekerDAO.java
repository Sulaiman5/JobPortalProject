package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.impl.IJobSeekerDAO;
import com.spring.model.JobSeeker;


@Repository(value = "jobSeekerDAO")
@Transactional
public class JobSeekerDAO implements IJobSeekerDAO{

	@Autowired
	private EntityManager entityManager;
	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	@Override
	public JobSeeker save(JobSeeker j) {
		getSession().save(j);
		getSession().flush();
		return j;
	}

	@Override
	public JobSeeker getById(int pid) {
		String sql = "from jobseeker where id = '" + pid + "'";
		   List<JobSeeker> jobSeeker = getSession().createQuery(sql).list();
			return jobSeeker.get(0);
	}

	@Override
	public JobSeeker Update(JobSeeker t) {
		String hql = "update jobseeker set fname = '"+t.getFname()+"', lname = '"+t.getLname()+"', presentaddress = '"+t.getPresentaddress()+"', permanentaddress = '"+t.getPermanentaddress()+"', nid = '"+t.getNid()+"', number = '"+t.getNumber()+"', email = '"+t.getEmail()+"', password = '"+t.getPassword()+"' where id = '"+t.getId()+"'";
	    Query q = getSession().createQuery(hql);
	    q.executeUpdate();
        getSession().flush();
        return t;
	}

	@Override
	public List<JobSeeker> getAll() {
		String sql = "from jobseeker";
        List<JobSeeker> jobseeker = getSession().createQuery(sql).list();
        return jobseeker;
	}

	@Override
	public JobSeeker delete(JobSeeker t) {
		String sql = "delete jobseeker where id ='"+t.getId()+"'";
		int delete = getSession().createQuery(sql).executeUpdate();
		return t;
	}
	public JobSeeker login(JobSeeker j) {
		String sql = "from jobseeker where email = '"+j.getEmail()+"'";
		List<JobSeeker> jobseeke = getSession().createQuery(sql).list();
		return jobseeke.get(0);
	}
	
}
