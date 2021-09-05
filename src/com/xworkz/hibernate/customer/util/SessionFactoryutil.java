package com.xworkz.hibernate.customer.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryutil {

	private static SessionFactory factory;
	public static SessionFactory getFactory() {
		if(factory !=null && factory.isClosed())
		{
			throw new IllegalStateException("some one Closed SessionFactory, please correct the code");
			
		}
		return factory;
	}
	static {
		try {
			System.out.println("SessionFactory STRATED");
			Configuration config = new Configuration().configure();
			factory=config.buildSessionFactory();
			System.out.println("SessionFactory COMPLETED");
		}
		catch(HibernateException e) {
			System.out.println("SessionFactory ERROR IN STATIC BLOCK");
			e.printStackTrace();
		}
	}
}
