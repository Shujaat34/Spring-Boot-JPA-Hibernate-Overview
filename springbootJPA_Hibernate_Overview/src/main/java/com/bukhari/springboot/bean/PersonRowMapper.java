package com.bukhari.springboot.bean;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> , Serializable{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

		Person person = new Person();
		person.setId(rs.getInt("ID"));
		person.setName(rs.getString("NAME"));
		person.setLocation(rs.getString("LOCATION"));
		person.setDate_of_birth(rs.getTimestamp("date_of_birth"));

		return person;
	}

}
