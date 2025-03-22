# Spring Boot MVC Project

## Overview
This project is a Spring Boot MVC application designed to demonstrate the use of the Model-View-Controller (MVC) architecture. It includes features such as dependency injection, RESTful endpoints, and integration with a templating engine for dynamic web pages.

## Features
- RESTful API endpoints for CRUD operations.
- Integration with jsp for server-side rendering.

## Prerequisites
- Java 21 or higher.
- Maven 3.9.8+.
- An IDE like IntelliJ IDEA or Eclipse or STS.

## Getting Started
1. Clone the repository:
    ```bash
    git clone https://github.com/Suraj-Mohapatra/spring-boot-mvc.git
    ```
2. Navigate to the project directory:
    ```bash
    cd spring-boot-mvc
    ```
3. Build the project:
    ```bash
    mvn clean package
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage
- Access the application at `http://localhost:8080/myapp/`.
- Use the provided endpoints to interact with the application.

## Folder Structure
- `src/main/java`: Contains the Java source code.
- `src/main/resources`: Contains application properties and templates.
- `src/test/java`: Contains unit and integration tests. (skipped for this project)