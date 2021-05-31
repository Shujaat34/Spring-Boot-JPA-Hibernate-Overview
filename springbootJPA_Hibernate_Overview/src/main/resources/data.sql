/*CREATE TABLE person(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	date_of_birth timestamp,
	primary key (id)

);  Creating the Entity using JPA

*/ 

INSERT INTO person (id,name,location,date_of_birth)
VALUES (1001,'Raheel','Hyderabad','1999-04-02'),
 		(1002,'Muneeb','Islamabad','2000-02-08'),
	   (1003,'Javeria','Karachi','1996-11-02'),
	   (1004,'Akhtar','Hyderabad','1997-09-06'),
	   (1005,'Suhail','Sukkur','1990-03-02'),
	   (1006,'Muneeb','Badeen','1990-03-02');