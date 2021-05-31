package com.bukhari.springboot;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bukhari.springboot.bean.Person;
import com.bukhari.springboot.jdbc.PersonjdbcDao;

//@SpringBootApplication
public class SpringbootJDBCApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonjdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("users -> {}",dao.findAll());
		logger.info("user id 1001-> {}",dao.findById(1001));
		logger.info("Deleted Row -> {}",dao.deleteById(1002));
		
		logger.info("Inserting person -> {}",dao.insert(new Person(1088,"Sana","Islamabad",new Date())));
	
		logger.info("updating person -> {}",dao.update(new Person(1001,"Zoahib","Sialkot",new Date())));
		
	}

}
