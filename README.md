Simple Inventory Spring Boot Application
Overview
The Simple Inventory Spring Boot Application is a RESTful API built with Java, Spring Boot, and PostgreSQL that allows users to manage a product inventory. This application includes essential CRUD operations, enabling users to retrieve, create, update, and delete products within an inventory database. The application leverages Spring Data JPA for database interaction and includes basic error handling to ensure smooth functionality.

Features
Product Management: Perform CRUD (Create, Read, Update, Delete) operations on products.
RESTful Endpoints: Easily accessible and testable via API tools such as Postman.
Database Integration: Seamless connection with a PostgreSQL database.
Spring Boot and Spring Data JPA: Streamlined data handling with minimal boilerplate code.
Prerequisites
To run this application, ensure you have the following installed:

Java Development Kit (JDK) version 17 or later
PostgreSQL database server
Apache Maven for dependency management
Getting Started
Step 1: Clone the Repository
Clone the project repository to your local machine:

bash

git clone https://github.com/YourUsername/simple-inventory-springboot.git
cd simple-inventory-springboot
Step 2: Configure Database
Set up a PostgreSQL database and name it inventory (or modify the application properties file with your custom database name).

Update your database configuration in src/main/resources/application.properties:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/inventory
spring.datasource.username=postgres
spring.datasource.password=root
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Step 3: Build and Run the Application
Build the project using Maven:

bash

mvn clean install
Then, start the application:

bash

java -jar target/simpleinventoryspringboot-0.0.1-SNAPSHOT.jar
The application will run on http://localhost:8080.

API Endpoints
The following RESTful endpoints are available to manage products in the inventory:

GET /api/products: Retrieve all products.
POST /api/products: Add a new product (expects JSON with product name, price, and quantity).
PUT /api/products/{id}: Update an existing product by ID.
DELETE /api/products/{id}: Delete a product by ID.
These endpoints can be tested using API tools like Postman or curl.


License
This project is open-source and available for further development or integration into larger systems.

