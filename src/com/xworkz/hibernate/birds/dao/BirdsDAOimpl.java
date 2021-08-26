package com.xworkz.hibernate.birds.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.birds.entity.BirdsEntity;

public class BirdsDAOimpl implements BirdsDAO {

	BirdsEntity birds = null;

	@Override
	public int save(BirdsEntity entity) {
		Configuration conf = new Configuration();
		conf.configure().addAnnotatedClass(BirdsEntity.class);
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int primaryKey = (int) session.save(entity);
		transaction.commit();
		System.out.println("save :" + primaryKey);
		session.close();
		factory.close();
		return primaryKey;
	}

	@Override
	public BirdsEntity readbyID(int primaryKey) {
		Configuration conf = new Configuration();
		conf.configure().addAnnotatedClass(BirdsEntity.class);
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		BirdsEntity db =session.get(BirdsEntity.class, primaryKey);
		System.out.println("Read by id :" + birds);
		session.close();
		factory.close();
		return db;
	}

}
