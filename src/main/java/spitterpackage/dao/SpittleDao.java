package spitterpackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spitterpackage.model.Spitter;
import spitterpackage.model.Spittle;

@Repository("SpittleDao")
//@Transactional
public class SpittleDao implements DAO<Spittle> {

	static String databaseName = "";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/" + databaseName;
	static final String USERNAME_DB = "root";
	static final String PASSWORD_DB = "1234";
	public String sql = null;
	private int status = 0;
	private int spitterid = 0;
	private List<Spittle> AllSpittles = new ArrayList<>();

	//@Autowired
	private SessionFactory sessionFactory;

	public Session getSession(SessionFactory sessionFactory) {
		try {
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			sessionFactory.openSession();
			return sessionFactory.getCurrentSession();
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// create Spittle
	@Override
	public void insert(Spittle spittle) {
		getSession(sessionFactory).save(spittle);
		;
		System.out.println("successfully saved Spittle");
	}

	// view my Spittles
	// thelei ftiaksimo
	public void get(Spitter spitter) {

		try {

			Class.forName(DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
			sql = "select post from spitterdb.spittle where username = " + "'" + spitter.getUsername() + "'";

			PreparedStatement viewspittle = connection.prepareStatement(sql);

			ResultSet rs = viewspittle.executeQuery(sql);

			while (rs.next()) {

				String post = rs.getString("post");
				System.out.println("Spittle : " + post + "\n");

			}

			rs.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// view all Spittles
	@Override
	public List<Spittle> getAll() {
		String hql = "from Spittle";
		Query query = getSession(sessionFactory).createQuery(hql);
		this.AllSpittles = query.list();
		return AllSpittles;
	}

	// update spittle
	@Override
	public void update(Spittle spittle) {
		getSession(sessionFactory).update(spittle);
		System.out.println("Spittle updated!");
	}

	// delete Spittle
	@Override
	public void delete(Spittle spittle) {
		getSession(sessionFactory).delete(spittle);
		System.out.println("Spittle Deleted");
	}

	@Override
	public List<Spittle> get(String x) {
		// TODO Auto-generated method stub
		return null;
	}

}
