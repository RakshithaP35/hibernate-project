package com.xworkz.hibernate.birds.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.birds.entity.BirdsEntity;
import com.xworkz.hibernate.birds.util.SessionFactoryUtil;

public class BirdsDAOimpl implements BirdsDAO {

	BirdsEntity birds = null;

	@Override
	public int save(BirdsEntity entity) {
		
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int primaryKey = (int) session.save(entity);
		transaction.commit();
		System.out.println("save :" + primaryKey);
		session.close();
		return primaryKey;
	}

	@Override
	public BirdsEntity readbyID(int primaryKey) {
		
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		BirdsEntity db =session.get(BirdsEntity.class, primaryKey);
		System.out.println("Read by id :" + birds);
		session.close();
		return db;
	}

	@Override
	public void updatebyNameById(int id, String name) {
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BirdsEntity entity = new BirdsEntity();
		entity = (BirdsEntity) session.get(BirdsEntity.class, id);
		entity.setName(name);
		session.update(entity);
		session.getTransaction().commit();
		System.out.println("updated name : " + name);
		session.close();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BirdsEntity entity = new BirdsEntity();
		entity = (BirdsEntity) session.get(BirdsEntity.class, id);
		session.delete(entity);
		session.getTransaction();
		System.out.println("deleted :" +id);
		session.close();
	}

}
