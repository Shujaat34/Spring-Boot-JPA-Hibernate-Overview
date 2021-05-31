package com.bukhari.springboot;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bukhari.springboot.bean.Person;
import com.bukhari.springboot.jdbc.PersonjdbcDao;
import com.bukhari.springboot.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringbootJpaDemo implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaDemo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("user id 1001-> {}",repository.findById(1001));
		logger.info("Inserting person -> {}",repository.insert(new Person("Sana","Islamabad",new Date())));
		logger.info("Inserting person -> {}",repository.insert(new Person("shuja","Islamabad",new Date())));
		
		logger.info("updating person -> {}",repository.update(new Person(1001,"Zoahib","Sialkot",new Date())));
		//because delete is a void type method so we can't show it in logger
		repository.deleteById(1);
		
		logger.info("users -> {}",repository.findAll());
		
		
	}
}
