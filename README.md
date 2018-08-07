# project-lebron getting started instructions

- download intellij CE from https://www.jetbrains.com/idea/download/#section=mac
- download and install JDK 10 from http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html
- download mysql and mysql workbench from
https://dev.mysql.com/downloads/

next lets import the project! open intellij then...

- import project > select the file > select maven > next > next in intellij... after you clone the project
- create a new schema in workbench named db_example
- since mysql is installed please do the following in the command line

Open up a terminal ....
//do this in command line
sudo mysql --password
create database db_example; -- Create the new database
create user 'springuser'@'localhost' identified by 'ThePassword';
grant all on db_example.* to 'springuser'@'localhost';

then go to run and the play button in intellij
