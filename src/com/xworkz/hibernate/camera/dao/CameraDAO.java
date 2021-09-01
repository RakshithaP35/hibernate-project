package com.xworkz.hibernate.camera.dao;

import java.util.List;

import com.xworkz.hibernate.camera.entity.CameraEntity;

public interface CameraDAO {

	int save(CameraEntity entity);
	CameraEntity readbyID(int primaryKey);
	void updatebytypeById(int id,String type);
	void deleteById(int id);
	void saveList(List<CameraEntity> entity1);
}
