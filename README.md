# Light spring application project
This is a sample Java application built using Spring framework and Hibernate ORM. The application demonstrates how to build a simple REST API with basic CRUD (Create, Read, Update, Delete) operations using Spring Boot, Hibernate and MySQL database.

The application is built with following technologies:

Java 8
Spring Boot 2.5.4
Hibernate 5.4.32.Final
MySQL 8.0.25
This application demonstrates:

How to set up a Spring Boot project with Hibernate ORM
How to use Spring Data JPA to interact with a database
How to implement CRUD operations using Hibernate and Spring Data JPA
How to implement validation using Hibernate Validator
How to handle exceptions and errors in a Spring Boot application
How to write JUnit tests for Spring Boot applications

Requirements
JDK 8 or higher
Maven 3.2 or higher
MySQL 8.0 or higher
Running the Application
Clone the repository: git clone https://github.com/<username>/<repository-name>.git
Navigate to the project directory: cd <repository-name>
Open application.properties file and update the MySQL database details according to your system configuration.
Build the project using Maven: mvn clean package
Run the application: java -jar target/<jar-file-name>.jar
API Endpoints
The application exposes following REST endpoints:

GET /api/cars: Get all cars
GET /api/cars/{id}: Get car by ID
POST /api/cars: Create a new car
PUT /api/cars/{id}: Update an existing car
DELETE /api/cars/{id}: Delete a car by ID
Testing
The application includes JUnit tests for testing various components of the application. To run the tests, use the following command:

Contribution
If you find any issues with this application or want to contribute to this project, please feel free to submit a pull request.




