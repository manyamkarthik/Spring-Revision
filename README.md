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



Stay tuned for more updates as I continue to revise and expand my Spring knowledge!
