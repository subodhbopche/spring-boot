drop table emp;
create table emp(eid int primary key auto_increment, first_Name varchar(100), last_Name varchar(100), email_ID varchar(100));

insert into emp(first_Name, last_Name, email_ID) values("subodh", "bopche", "subodh@gmail.com"),
("Ramesh", "Kumar", "Ramesh@gmail.com"),
("Payal", "patle", "payal@gmail.com"),
("Harsha", "patle", "harsha@gmail.com");