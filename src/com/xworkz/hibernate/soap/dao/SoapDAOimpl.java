package com.xworkz.hibernate.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.soap.dto.SoapDTO;

public class SoapDAOimpl implements SoapDAO{

	@Override
	public int save(SoapDTO entity) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(SoapDTO.class);
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
