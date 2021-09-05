package com.xworkz.hibernate.customer.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hibernate.customer.entity.CustomerEntity;
import com.xworkz.hibernate.customer.util.SessionFactoryutil;

public class CustomerDAOimpl implements CustomerDAO {

	private SessionFactory factory = SessionFactoryutil.getFactory();

	@Override
	public void saveList(List<CustomerEntity> entity) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			AtomicInteger atomicInteger = new AtomicInteger();
			entity.forEach(customerEntity -> {
				CustomerEntity customer = session.load(CustomerEntity.class, customerEntity.getId());
				if (customer != null) {
					session.save(customerEntity);
					System.out.println(customerEntity);
				}
				if (atomicInteger.incrementAndGet() % 50 == 0) {
					session.flush();

				}
			});
			transaction.commit();

		}
	}

}
