package com.xworkz.hibernate.birds.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

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
			System.out.println("SF INIT STRATED");
			Configuration config = new Configuration().configure();
			factory=config.buildSessionFactory();
			System.out.println("SF ERROR IN STATIC BLOCK");
		}
		catch(HibernateException e) {
			System.out.println("SF ERROR IN STATIC BLOCK");
			e.printStackTrace();
		}
	}
}
