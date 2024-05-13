# Excel File Generation with Spring Boot

This is a simple Spring Boot application that demonstrates how to generate an Excel file from a list of users and download it using a RESTful API endpoint.

## Table of Contents

- [Technologies](#technologies)
- [Features](#features)
- [Setup](#setup)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Apache POI
- Lombok

## Features

- Add a new user
- Export all users to an Excel file
- Download the Excel file

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/excel-file-generation.git
    ```

2. **Navigate to the project folder:**

    ```bash
    cd excel-file-generation
    ```

3. **Build the project:**

    If you're using Maven:

    ```bash
    mvn clean package
    ```

    If you're using Gradle:

    ```bash
    ./gradlew build
    ```

4. **Run the application:**

    ```bash
    java -jar target/excel-file-generation-0.0.1-SNAPSHOT.jar
    ```

## Usage

Once the application is up and running, you can access the following endpoints:

- **Add a new user:**

  ```http
  POST /api/v1/newUser
  ```
- **Export all users to an Excel file**

  ```http
  GET /api/v1/exportUsersToExcel
  ```

## API Endpoints

- **Add a new user:**

  ```http
  POST /api/v1/newUser
  ```
     **Request Body**

    ```http
    {
  "userName": "John Doe",
  "city": "New York",
  "email": "john.doe@example.com"
  }
  ``` 

- **Export all users to an Excel file**

  ```http
  GET /api/v1/exportUsersToExcel

  ```

  This endpoint will export all users to an Excel file and download it.

