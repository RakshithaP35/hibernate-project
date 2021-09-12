package com.xworkz.hibernate.mobile.dao;

import com.xworkz.hibernate.mobile.entity.MobileEntity;

public interface MobileDAO {

	int save(MobileEntity entity);
	
	void read(int id);
	
	double readPriceByName(String name);
	
	double readTotalPrice();
	
	double readMaxPrice();
	
	double readMinPrice();
	
	void updatePriceByName(double price,String name);
	
	

}
