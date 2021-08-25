package com.xworkz.hibernate.soap.dao;

import com.xworkz.hibernate.soap.dto.SoapDTO;

public interface SoapDAO {
	int save(SoapDTO entity);
	
	int read(SoapDTO entity);
	
	int update(SoapDTO entity);
	
	int delete(SoapDTO entity);
}