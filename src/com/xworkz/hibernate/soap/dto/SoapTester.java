package com.xworkz.hibernate.soap.dto;

import com.xworkz.hibernate.soap.constant.SoapType;
import com.xworkz.hibernate.soap.dao.SoapDAO;
import com.xworkz.hibernate.soap.dao.SoapDAOimpl;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO entity = new SoapDTO(2,"Riya","Glecerine",true,true,SoapType.Detergent);
		
		SoapDAO dao = new SoapDAOimpl();
		dao.save(entity);
		dao.read(entity);
		dao.update(entity);
		dao.delete(entity);
	}

}