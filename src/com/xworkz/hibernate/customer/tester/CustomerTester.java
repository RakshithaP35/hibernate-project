package com.xworkz.hibernate.customer.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hibernate.customer.dao.CustomerDAO;
import com.xworkz.hibernate.customer.dao.CustomerDAOimpl;
import com.xworkz.hibernate.customer.entity.CustomerEntity;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAOimpl();

		List<CustomerEntity> customer = new ArrayList<CustomerEntity>();
		for (int i = 1; i <= 50; i++) {
			CustomerEntity entity = new CustomerEntity("Rakshitha", "Bangalore", "Slippers", 22);
			CustomerEntity entity1 = new CustomerEntity("Ranjith", "Bengaluru", "Shoes", 18);
			customer.add(entity1);
			customer.add(entity);
		}
		dao.saveList(customer);

	}

}
