package com.xwrokz.hibernate.dryFruits.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xwrokz.hibernate.dryFruits.dto.DryFruitsDTO;

public class DryFruitsDAOimpl implements DryFruitsDAO{

	@Override
	public int save(DryFruitsDTO entity) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(DryFruitsDTO.class);
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		int primaryKey = (int)session.save(entity);
		transaction.commit();
		System.out.println(primaryKey);
		
		session.close();
		factory.close();
		
		return primaryKey;
	}

}
