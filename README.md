# Nexus Inventory Engine

## Project Overview

Nexus Inventory Engine is a backend inventory management system built using Java, Spring Boot, Spring Data JPA, and PostgreSQL.

The project demonstrates enterprise backend development practices including layered architecture, REST API development, database integration, and clean separation of concerns through Controller-Service-Repository design patterns.

The application allows inventory products to be created, retrieved, and managed through RESTful APIs while persisting data in a PostgreSQL database.


## Architecture

The application follows a layered architecture pattern commonly used in enterprise Spring Boot applications.

### Request Flow

Client
→ Controller Layer
→ Service Layer
→ Repository Layer
→ PostgreSQL Database

### Components

#### Controller Layer

Handles incoming HTTP requests and returns API responses.

Current Controllers:

* HealthController
* ProductController

#### Service Layer

Contains business logic and application-specific processing.

Current Services:

* HealthService
* ProductService

#### Repository Layer

Provides database access using Spring Data JPA repositories.

Current Repository:

* ProductRepository

#### Database Layer

PostgreSQL is used as the persistent storage layer. Hibernate/JPA manages entity mapping and database interactions.


## Tech Stack

### Backend

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Security

### Database

* PostgreSQL 16
* Hibernate ORM

### Build & Dependency Management

* Maven

### Version Control

* Git
* GitHub

### Development Tools

* VS Code
* Postman


## Setup Instructions

### Prerequisites

Before running the application, ensure the following are installed:

* Java 17
* Maven
* PostgreSQL 16+
* Git

### Clone the Repository

```bash
git clone https://github.com/AnasBaseer/nexus-inventory-engine.git
cd nexus-inventory-engine
```

### Create Database

Open PostgreSQL and run:

```sql
CREATE DATABASE nexus_inventory;
```

### Configure Database Connection

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nexus_inventory
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Application

```bash
./mvnw spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## API Endpoints

### Health Check

#### Get Application Status

```http
GET /health
```

Example Response:

```json
{
  "service": "Nexus Inventory Engine",
  "status": "UP"
}
```

---

### Product APIs

#### Create Product

```http
POST /api/products
```

Request Body:

```json
{
  "name": "Laptop",
  "description": "Dell XPS 15",
  "price": 1200.00,
  "quantity": 5
}
```

#### Get All Products

```http
GET /api/products
```

#### Get Product By ID

```http
GET /api/products/{id}
```

#### Delete Product

```http
DELETE /api/products/{id}
```

## Database Schema

### Products Table

| Column      | Type    |
| ----------- | ------- |
| id          | BIGINT  |
| name        | VARCHAR |
| description | VARCHAR |
| price       | DOUBLE  |
| quantity    | INTEGER |

The table is automatically generated using Hibernate and JPA entity mappings.

## DevOps & CI/CD

The project includes a complete CI/CD pipeline implemented using GitHub Actions and modern DevOps practices.

### Continuous Integration (CI)

The CI pipeline automatically runs on every push and pull request and performs:

* Maven Build Verification
* Checkstyle Code Quality Checks
* Unit Test Execution
* Docker Image Build Validation
* PostgreSQL Service Integration

### Security

Security automation is implemented using:

* GitHub CodeQL Security Analysis
* Dependabot Dependency Monitoring
* Automated Vulnerability Detection

### Containerization

The application is fully containerized using Docker.

#### Docker Features

* Multi-stage Docker Build
* Docker Compose Support
* PostgreSQL Container Integration
* Production-ready Container Packaging

### Container Registry

Docker images are automatically published to GitHub Container Registry (GHCR) through GitHub Actions.

Published Image:

```text
ghcr.io/anasbaseer/nexus-inventory-engine
```

### Quality Gates

Every commit is validated through:

* Build Verification
* Code Style Enforcement (Checkstyle)
* Unit Testing
* Security Scanning
* Docker Build Validation

This ensures only validated and production-ready code reaches the main branch.


## Future Enhancements

Planned improvements for future iterations of the project:

* JWT Authentication and Authorization
* Role-Based Access Control (RBAC)
* Swagger / OpenAPI Documentation
* Inventory Analytics Dashboard
* Product Search and Filtering
* Audit Logging
* Unit and Integration Testing

## Author

Anas Baseer Mohammed

Java Backend Developer

GitHub:
https://github.com/AnasBaseer

LinkedIn:
https://www.linkedin.com/in/anasbaseermohammed/
