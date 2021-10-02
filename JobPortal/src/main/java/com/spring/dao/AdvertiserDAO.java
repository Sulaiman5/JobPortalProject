package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.impl.IAdvertiserDAO;
import com.spring.model.Advertiser;

@Transactional
@Repository(value = "advertiserDAO")
public class AdvertiserDAO implements IAdvertiserDAO {
 
	@Autowired
	private EntityManager entityManager;
	
	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	@Override
	public Advertiser save(Advertiser t) {
		getSession().save(t);
		getSession().flush();
		return t;
	}

	@Override
	public Advertiser getById(int id) {
		String query = "from advertiser where id = '"+id+"'";
		List<Advertiser> advertiser = getSession().createQuery(query).list();
		System.out.println("DAO");
		return advertiser.get(0);
	}

	@Override
	public Advertiser Update(Advertiser t) {
		String hql = "update advertiser set fname = '"+t.getFname()+"', surname = '"+t.getSurname()+"', address = '"+t.getAddress()+"', email = '"+t.getEmail()+"', password = '"+t.getPassword()+"', comname = '"+t.getComname()+"' where id = '"+t.getId()+"'";
	    Query q = getSession().createQuery(hql);
	    q.executeUpdate();
        getSession().flush();
        return t;
	}

	@Override
	public List<Advertiser> getAll() {
		String qls = "from advertiser";
		List<Advertiser> advertiser = getSession().createQuery(qls).list();
		return advertiser;
	}
	@Override
	public Advertiser delete(Advertiser t) {
		String sql = "delete advertiser where id = '"+t.getId()+"'";
		int delete = getSession().createQuery(sql).executeUpdate();
		return t;
	}
	public Advertiser login(Advertiser a) {
		String qsl = "from advertiser where email = '"+a.getEmail()+"'";
		List<Advertiser> advertiser = getSession().createQuery(qsl).list();
		return advertiser.get(0);
	}
}
