# Spring-Security-Project
Project Using Spring Security

It is a simple Spring Boot Authentication (Login & Registration) application secured
by basic spring security, where the user with role Admin can provide tasks to the
users with role user. 

The Backend of this app is build by using Spring Boot(Basic SpringSecurity) and Frontend is by using Thymleaf


Steps to Setup the Spring Boot Back end app (Spring-Project) 

1. Clone the application 

      git clone https://github.com/snehal-bagde/Spring-Security-Project.git
      cd Spring-Project 

2. Create MySQL database 

      create database app_db

 
3. Change MySQL username and password as per your MySQL installation 

      open src/main/resources/application.properties file. 
      change spring.datasource.username and spring.datasource.password properties as per your mysql installation 

  
4. Run the app 

      Run the spring boot app using IDE 
      The server will start on port 8080. 

  
5. Default Roles 

      The spring boot app uses role based authorization powered by spring security. To add the default roles in the database use below queries, 
      INSERT INTO `roles` (`id`, `name`) VALUES (1, 'ROLE_USER'); 
      INSERT INTO `roles` (`id`, `name`) VALUES (2, 'ROLE_ADMIN'); 

      Any new user who signs up to the app is assigned the ROLE_USER by default. 


