package com.xworkz.hibernate.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name ="custome_table")
public class CustomerEntity implements Serializable{
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_location")
	private String location;
	@Column(name = "c_purchased")
	private String purchased;
	@Column(name = "c_age")
	private int age;
	
	public CustomerEntity() {
		
	}

	public CustomerEntity(int id, String name, String location, String purchased, int age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.purchased = purchased;
		this.age = age;
	}

	public CustomerEntity(String name, String location, String purchased, int age) {
		super();
		this.name = name;
		this.location = location;
		this.purchased = purchased;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", location=" + location + ", purchased=" + purchased
				+ ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((purchased == null) ? 0 : purchased.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (purchased == null) {
			if (other.purchased != null)
				return false;
		} else if (!purchased.equals(other.purchased))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPurchased() {
		return purchased;
	}

	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
