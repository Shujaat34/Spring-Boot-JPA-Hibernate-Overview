package com.bukhari.springboot.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bukhari.springboot.bean.Person;
import com.bukhari.springboot.bean.PersonRowMapper;

@Repository
public class PersonjdbcDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//list all persons
	public List<Person> findAll(){
		List<Person> list = jdbcTemplate.query("Select * from person", new BeanPropertyRowMapper(Person.class));
		return list;
	}
	
	//findById
	public Person findById(int id) {
		String sql = "select * from person where id=?";
		Person person =jdbcTemplate.queryForObject(
				sql, new Object[] {id},
				new PersonRowMapper());
		return person;
	}
	
	public int deleteById(int id) {
		String sql = "delete from person where id=?";
		int rows =jdbcTemplate.update(
				sql, new Object[] {id});
		return rows;
	}
	
	public int insert(Person person) {
		String sql = "insert into person(id,name,location,date_of_birth) "
				+ "values(?,?,?,?);";
		int rows =jdbcTemplate.update(
				sql, new Object[] {person.getId(),person.getName(),person.getLocation(),
						new Timestamp(person.getDate_of_birth().getTime())});
		return rows;
	}
	
	
	public int update(Person person) {
		String sql = "update person set name=?,location=?,date_of_birth=? "
				+ " where id=? ";
		int rows =jdbcTemplate.update(
				sql, new Object[] {person.getName(),person.getLocation(),
						new Timestamp(person.getDate_of_birth().getTime()),person.getId()});
		return rows;
	}
	
	
	
}
