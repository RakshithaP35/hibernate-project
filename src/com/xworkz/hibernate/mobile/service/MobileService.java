package com.xworkz.hibernate.mobile.service;

import com.xworkz.hibernate.mobile.entity.MobileEntity;

public interface MobileService {

	int save(MobileEntity entity);

	boolean readPriceByName(String name);

	double readTotalPrice();

	double readMaxPrice();

	double readMinPrice();
	
	boolean updatePriceByName(double price,String name);
}
