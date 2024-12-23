# Spring Learning Progress

This repository contains my daily Spring learning and revision progress, covering key concepts and practical implementations. Below is a summary of the topics I have covered so far.

## Topics Covered

### 1. Beans and Bean Models
- **Definition:** Beans are objects that are managed by the Spring IoC container.
- **Bean Scopes:**
  - `singleton` (Default): A single instance per Spring IoC container.
  - `prototype`: A new instance for every request.
  - `request`, `session`, `application`: Web-specific scopes.
- **Bean Lifecycle:**
  - Initialization and destruction callbacks using `@PostConstruct` and `@PreDestroy` annotations or implementing `InitializingBean` and `DisposableBean` interfaces.
- **Configuration:**
  - XML-based configuration (`<bean>` tags).
  - Java-based configuration (`@Configuration`, `@Bean` annotations).
  - Annotation-based (`@Component`, `@Service`, `@Repository`).

### 2. Autowiring Concepts
- **Types of Autowiring:**
  - `@Autowired`: Automatically injects a dependency by type.
  - `@Qualifier`: Used with `@Autowired` to resolve ambiguity when multiple beans of the same type exist.
  - `@Primary`: Marks a bean as the default when multiple candidates exist.
- **Handling Conflicts:**
  - Resolving multiple beans of the same type using `@Qualifier`.
  - Circular dependencies:
    - Setter injection or `@Lazy` initialization to break dependency cycles.
    - Proper design to avoid tightly coupled dependencies.

### 3. Aspect-Oriented Programming (AOP)
- **Definition:** AOP is used to modularize cross-cutting concerns like logging, security, and transaction management.
- **Key Concepts:**
  - **Aspect:** A module encapsulating cross-cutting concerns.
  - **Advice:** Action taken by an aspect at a join point.
    - `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing`, `@Around` annotations.
  - **Join Point:** A point during execution, such as method invocation.
  - **Pointcut:** Expressions to match join points (e.g., method patterns).
- **Implementation:**
  - Defining aspects using `@Aspect` and weaving them into the application.
  - XML or Java-based configuration for enabling AOP (`<aop:aspectj-autoproxy>` or `@EnableAspectJAutoProxy`).
### 4. Spring Data JPA
- **Key Features**:
  - Repository abstraction for database operations.
  - Query creation from method names (e.g., `findByName`).
  - Support for custom queries with `@Query`.
- **Transaction Management**: Automatic handling with `@Transactional`.

### 5. Spring Data REST
- **Purpose**: Automatically exposes RESTful APIs for JPA repositories.
- **Features**:
  - HAL explorer for navigating REST APIs.
  - Custom endpoints and projections.

### 6. Spring Security
- **Authentication**: Supports username/password and role-based access.
- **Authorization**: Secures endpoints with roles (`@PreAuthorize`, `@Secured`).
- **Thymeleaf Integration**: `spring-security` extras for secure templates.

### 7. RESTful APIs
- **Development**:
  - Creating endpoints with `@RestController`.
  - JSON serialization and validation with `@RequestBody`, `@Valid`.
- **Validation**: Using `@Valid` and `@NotNull` annotations.
- **Response Handling**: Returning appropriate HTTP status codes (`ResponseEntity`).

### 8. Thymeleaf Templates
- **Dynamic Views**:
  - HTML templates with Spring expressions (`th:text`, `th:if`).
  - Form validation and error handling.

### 9. Database Integration
- **PostgreSQL**:
  - Configured using Spring Boot starter dependencies.
  - Managed database migrations.


## Folder Structure

### Example 1: Core Basics
Contains examples and implementations of:
- Bean definitions and lifecycle.
- Bean scopes and initialization.
- Configuration methods.

### Autowired
Examples of:
- `@Autowired` with different injection types (field, setter, and constructor).
- Resolving conflicts with `@Qualifier` and `@Primary`.
- Circular dependency handling with `@Lazy`.

### Aspect-Oriented Programming
Examples of:
- Defining aspects for logging and security.
- Implementing different types of advice (`@Before`, `@Around`, etc.).
- Configuring AOP using both annotations and XML.

## Featured Project: SpringApplication1

This is a fully implemented school management application showcasing advanced Spring concepts. The application leverages various Spring features to provide a robust backend solution.

### Key Features
- **AOP (Aspect-Oriented Programming)**:
  - Logging, performance monitoring, and method-level interception.
- **Spring Security**:
  - Secure endpoints with user authentication and authorization.
- **Spring Data REST with HAL**:
  - Exposes RESTful APIs with hypermedia (HAL) support for easy navigation.
- **Spring Data JPA**:
  - Simplified database interactions using JPA repositories.
- **Validation**:
  - Input validation with `spring-boot-starter-validation`.
- **REST APIs**:
  - Designed and implemented RESTful endpoints for CRUD operations.
- **Thymeleaf Integration**:
  - For creating dynamic views and templates.
- **PostgreSQL**:
  - Used as the database backend.


---



### Features:
- CRUD operations for managing students, teachers, and courses.
- Role-based access control with secure endpoints.
- Auto-generated REST APIs with HAL explorer support.
- Dynamic front-end templates with form validation.

### Build & Configuration
- **Java Version**: 21
- **Maven Plugins**:
  - Configured with `maven-compiler-plugin` for Java 21 compatibility.

---

Stay tuned for more updates as I continue to revise and expand my Spring knowledge!
