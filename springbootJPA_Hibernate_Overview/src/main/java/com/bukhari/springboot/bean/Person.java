package com.bukhari.springboot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_persons",query="select p from Person p")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date date_of_birth;

	public Person() {

	}
	
	public Person( String name, String location, Date date_of_birth) {
		this.name = name;
		this.location = location;
		this.date_of_birth = date_of_birth;
	}

	public Person(int id, String name, String location, Date date_of_birth) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.date_of_birth = date_of_birth;
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

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "\n\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", data_of_birth=" + date_of_birth
				+ "]";
	}

}
