package com.xworkz.hibernate.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.soap.dto.SoapDTO;

public class SoapDAOimpl implements SoapDAO{
	SoapDTO soap = null;
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

	@Override
	public int read(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		SoapDTO dt = (SoapDTO) session.get(SoapDTO.class,1);
		System.out.println(dt);
		tr.commit();
		System.out.println("read the data");
		session.close();
		factory.close();

		return 1;
	}

	@Override
	public int update(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		soap = (SoapDTO) session.get(SoapDTO.class, 1);
		soap.setOdour("Rose");
		session.update(soap);
		session.getTransaction().commit();
		System.out.println("update :" + soap);
		session.close();
		return 1;
	}

	@Override
	public int delete(SoapDTO entity) {
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.load(SoapDTO.class,new Integer(1));
		SoapDTO dt = (SoapDTO) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("Data deleted");
		tr.commit();
		session.close();
		sessionfact.close();
		return 1;
	}
	

}
