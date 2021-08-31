package com.xworkz.hibernate.camera.tester;


import com.xworkz.hibernate.camera.dao.CameraDAO;
import com.xworkz.hibernate.camera.dao.CameraDAOimpl;
import com.xworkz.hibernate.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		CameraEntity entity = new CameraEntity(1,35000.00,2,19,true,"Changing lens","India",782.00f,true,"In-built");

		CameraDAO dao = new CameraDAOimpl();
		System.out.println("save");
		dao.save(entity);
		
		System.out.println("read");
		dao.readbyID(1);
		System.out.println(entity);
		
		System.out.println("update");
		dao.updatebytypeById(1,"Lens");
		
		
		System.out.println("delete");
		dao.deleteById(1);
	}

}