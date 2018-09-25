create table country(id int PRIMARY KEY NOT NULL, name varchar(255) NOT NULL)
													  
create table city(id int PRIMARY KEY NOT NULL, name varchar(255) NOT NULL, country_id int NOT NULL, FOREIGN KEY (country_id) REFERENCES country(id))																																																																

insert into country values(1, 'Ukraine')
insert into country values(2, 'USA')	
insert into country values(3, 'Spain')
insert into city values(1, 'Kiyv', 1)
insert into city values(2, 'Lviv', 1)
insert into city values(3, 'Dnipro', 1)
insert into city values(4, 'Atlanta', 2)
insert into city values(5, 'Boston', 2)
insert into city values(6, 'Detroit', 2)
insert into city values(7, 'Madrid', 3)
insert into city values(8, 'Barcelona', 3)
insert into city values(9, 'Toledo', 3)																	   
						  
select * from city																																			
select * from city where id%2=0 	
select count(*) from city where name like 'K%'
select c.name, cc.name from city c inner join country cc on c.country_id = cc.id
																																				

																																				
