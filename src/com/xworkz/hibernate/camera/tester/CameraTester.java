package com.xworkz.hibernate.camera.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hibernate.camera.dao.CameraDAO;
import com.xworkz.hibernate.camera.dao.CameraDAOimpl;
import com.xworkz.hibernate.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		// List<CameraEntity> cam = new ArrayList<>();

		CameraEntity entity = new CameraEntity( 35000.00, 2, 19, true, "Changing lens", "India", 782.00f, true,
				"In-built");
		CameraEntity entity1 = new CameraEntity(45000.00, 3, 20, true, "lenss", "India", 560.00f, false, "manual");

		CameraDAO dao = new CameraDAOimpl();
		System.out.println("save");
		dao.save(entity);
		dao.save(entity1);

		List<CameraEntity> cam = new ArrayList<CameraEntity>();
		System.out.println("saveList:");
		cam.add(entity1);
		cam.add(entity);
		dao.saveList(cam);

		System.out.println("read");
		System.out.println(dao.readbyID(1));

		System.out.println("update");
		dao.updatebytypeById(1, "no lens");

		System.out.println("delete");
		dao.deleteById(1);

		List<Integer> id = new ArrayList<Integer>();
		System.out.println("delete list");
		id.add(1);
		id.add(2);
		dao.deleteList(id);

	}

}
