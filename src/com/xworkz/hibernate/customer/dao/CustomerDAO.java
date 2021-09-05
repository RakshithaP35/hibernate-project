package com.xworkz.hibernate.customer.dao;

import java.util.List;

import com.xworkz.hibernate.customer.entity.CustomerEntity;

public interface CustomerDAO {
	
	void saveList(List<CustomerEntity> entity);

}
