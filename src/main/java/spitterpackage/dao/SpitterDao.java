package spitterpackage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spitterpackage.model.Spitter;

@Repository("SpitterDao")
@Transactional
public class SpitterDao implements DAO<Spitter> {

	private List<Spitter> AllSpitters = new ArrayList<>();

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession(SessionFactory sessionFactory) {
		try {
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			sessionFactory.openSession();
			return sessionFactory.getCurrentSession();
		}
	}
	
	//@PersistenceUnit
	//private EntityManagerFactory entityManagerFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// it adds a spitter into the database
	@Override
	public void insert(Spitter spitter) {
		getSession(sessionFactory).save(spitter);
		//entityManagerFactory.createEntityManager().persist(spitter);
	}

	// Get spitter account from database
	public List<Spitter> get(String username) {
		String hql = "from Spitter where username = :username";
		Query query = getSession(sessionFactory).createQuery(hql);
		query.setParameter("username", username);
		List<Spitter> spitterList = query.list();
		return spitterList;

	}

	// view all spitter accounts
	@Override
	public List<Spitter> getAll() {
		String hql = "from Spitter";
		Query query = getSession(sessionFactory).createQuery(hql);
		this.AllSpitters = query.list();
		return AllSpitters;
	}

	// update Spitter account
	@Override
	public void update(Spitter sp) {
		getSession(sessionFactory).update(sp);
		System.out.println("successfully updated");
	}

	// delete Spitter account
	@Override
	public void delete(Spitter spitter) {
		getSession(sessionFactory).delete(spitter);
		System.out.println("successfully deleted");
	}

}
