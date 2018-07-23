CREATE TABLE post (
 ID int NOT NULL AUTO_INCREMENT primary key NOT NULL,
 User_ID int NOT NULL,
 Project_ID int NOT NULL,
 Title varchar(30),
 Description varchar(100)
);

CREATE TABLE project (
 ID int NOT NULL AUTO_INCREMENT primary key NOT NULL,
 User_ID int NOT NULL,
 Title varchar(30),
 Description varchar(100)
);

CREATE TABLE project_join_requests (
 ID int NOT NULL AUTO_INCREMENT primary key NOT NULL,
 User_ID int NOT NULL,
 Project_Owner_ID int NOT NULL,
 Project_ID int NOT NULL
);


---future stuff that needs implemented
-- side_project - these will be like organizations that users will put together and other users will join
-- app_setting - a application settings table for the app that users can control
-- comments - you know what these are, you can comment on side projects posts
-- messages - between users directly
-- requests - these are made to join a side project
