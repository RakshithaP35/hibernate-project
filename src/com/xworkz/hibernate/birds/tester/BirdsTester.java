package com.xworkz.hibernate.birds.tester;

import com.xworkz.hibernate.birds.dao.BirdsDAO;
import com.xworkz.hibernate.birds.dao.BirdsDAOimpl;
import com.xworkz.hibernate.birds.entity.BirdsEntity;

public class BirdsTester {

	public static void main(String[] args) {
		BirdsEntity entity = new BirdsEntity(4,"crow","Black","Domestic",true,"Warm & Cold Region",15,"Male","ppl belives it has ancestors","kawkaw");
		
		BirdsDAO dao = new BirdsDAOimpl();
		System.out.println("save");
		dao.save(entity);
		
		System.out.println("read");
		dao.readbyID(4);
		System.out.println(entity);
		
		System.out.println("update");
		dao.updatebyNameById(4,"kiwi");
		
		
		System.out.println("delete");
		dao.deleteById(4);
	}

}
