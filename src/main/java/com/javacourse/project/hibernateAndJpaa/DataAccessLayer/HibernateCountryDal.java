package com.javacourse.project.hibernateAndJpaa.DataAccessLayer;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.project.hibernateAndJpaa.entity.Country;

@Repository
public class HibernateCountryDal implements ICountryDal{
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Country> getAll() {
		Session session= entityManager.unwrap(Session.class);
		List<Country> country= session.createQuery("from Country",Country.class).getResultList();
		return country;
	}

	@Override
	@Transactional
	public void add(Country country) {
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	@Transactional
	public void updete(Country country) {
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
		
	}

	@Override
	@Transactional
	public void delete(Country country) {
		Session session= entityManager.unwrap(Session.class);
		session.delete(country);

	}

	@Override
	@Transactional
	public Country getCountryId(int id) {
		Session session= entityManager.unwrap(Session.class);
		Country country = session.get(Country.class, id);
		return country;
	}

}
