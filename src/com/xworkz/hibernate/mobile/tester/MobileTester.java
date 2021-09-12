package com.xworkz.hibernate.mobile.tester;

import com.xworkz.hibernate.mobile.dao.MobileDAO;
import com.xworkz.hibernate.mobile.dao.MobileDAOimpl;
import com.xworkz.hibernate.mobile.entity.MobileEntity;
import com.xworkz.hibernate.mobile.service.MobileService;
import com.xworkz.hibernate.mobile.service.MobileServiceImpl;

public class MobileTester {

	public static void main(String[] args) {
		MobileEntity entity = new MobileEntity("Redmi", "gold", true,22000);
		MobileEntity entity1 = new MobileEntity("Samsung", "silver", true,25000);
		
	
		MobileDAO dao = new MobileDAOimpl();
		MobileService service = new MobileServiceImpl();
		service.save(entity);
		service.save(entity1);
	
		System.out.println("*******");
		System.out.println(service.readPriceByName("Redmi"));
		
		System.out.println("*******");
		System.out.println(service.readTotalPrice());
		
		System.out.println("*******");
		System.out.println(service.readMaxPrice());
		
		System.out.println("*******");
		System.out.println(service.readMinPrice());
		
		System.out.println("*******");
		service.updatePriceByName(33000,"Samsung hjd");
	

	}

}
