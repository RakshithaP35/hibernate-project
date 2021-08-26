package com.xworkz.hibernate.birds.entity;

import com.xworkz.hibernate.birds.dao.BirdsDAO;
import com.xworkz.hibernate.birds.dao.BirdsDAOimpl;

public class BirdsTester {

	public static void main(String[] args) {
		BirdsEntity entity = new BirdsEntity(1,"crow","Black","Domestic",true,"Warm & Cold Region",15,"Male","ppl belives it has ancestors","kawkaw");
		
		BirdsDAO dao = new BirdsDAOimpl();
		dao.save(entity);
		dao.readbyID(1);
		System.out.println(entity);

	}

}
