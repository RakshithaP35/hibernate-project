package com.xworkz.hibernate.birds.dao;

import com.xworkz.hibernate.birds.entity.BirdsEntity;

public interface BirdsDAO {
	
	int save(BirdsEntity entity);
	BirdsEntity readbyID(int primaryKey);

}
