package com.xworkz.hibernate.birds.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "birds_table")
public class BirdsEntity implements Serializable {
	@Column(name= "b_id")
	@Id
	private int id;
	@Column(name= "b_name")
	private String name;
	@Column(name= "b_color")
	private String color;
	@Column(name= "b_type")
	private String type;
	@Column(name = "b_feathers")
	private boolean feathers;
	@Column(name = "b_region")
	private String region;
	@Column(name = "b_lifeSpan")
	private int lifeSpan;
	@Column(name = "b_gender")
	private String gender;
	@Column(name = "b_speciality")
	private String speciality;
	@Column(name = "b_sound")
	private String sound;

	public BirdsEntity() {

	}

	public BirdsEntity(int id, String name, String color, String type, boolean feathers, String region, int lifeSpan,
			String gender, String speciality, String sound) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.type = type;
		this.feathers = feathers;
		this.region = region;
		this.lifeSpan = lifeSpan;
		this.gender = gender;
		this.speciality = speciality;
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "BirdsEntity [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", feathers="
				+ feathers + ", region=" + region + ", lifeSpan=" + lifeSpan + ", gender=" + gender + ", speciality="
				+ speciality + ", sound=" + sound + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (feathers ? 1231 : 1237);
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + lifeSpan;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		BirdsEntity other = (BirdsEntity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (feathers != other.feathers)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (lifeSpan != other.lifeSpan)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
