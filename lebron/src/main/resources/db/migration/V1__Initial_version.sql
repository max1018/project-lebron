
--Initial DB Script
CREATE TABLE user (
 ID int NOT NULL AUTO_INCREMENT primary key NOT NULL,
 Email varchar(50),
 Name varchar(30),
 Address varchar(100),
 City varchar(40),
 Password varchar(20)
);

--used when we add data later
--alter table user add column username VARCHAR(15);
--add data
insert into USER values(1, "bseager21@gmail.com", "Brandon Seager","123 up your ass street", "Grand Rapids MI","admin");