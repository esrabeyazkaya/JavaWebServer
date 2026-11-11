# Java Web Server

## 1. Project Description

This project is a simple web server developed using only the Java programming language without using any third-party libraries.

The server listens for incoming client connections on port **1989**. When a user accesses the server through a web browser, the server processes the HTTP request and sends an HTML response.

The web page displays the student's full name, student number, and a short biography. HTML and CSS are used to create a visually appealing page.

## 2. Technologies Used

- Java
- Java Socket Programming
- HTTP Protocol
- HTML
- CSS

## 3. Project Features

- Runs on port 1989.
- Accepts client connections using Java Socket Programming.
- Processes incoming HTTP requests.
- Generates HTML content dynamically.
- Sends HTTP responses with appropriate headers.
- Uses UTF-8 encoding to support Turkish characters.
- Uses interfaces to reduce dependencies between classes.
- Demonstrates SOLID principles.

## 4. Project Structure

```text
JavaWebServer/
└── src/
    ├── Main.java
    ├── WebServer.java
    ├── ClientHandler.java
    ├── HtmlGenerator.java
    ├── AlternativeHtmlGenerator.java
    ├── HttpResponse.java
    ├── RequestHandler.java
    ├── HtmlProvider.java
    └── HttpResponseFormatter.java
```

## 5. Class Responsibilities

| Class / Interface | Responsibility |
|---|---|
| Main | Creates the required objects and starts the server. |
| WebServer | Opens the server socket and accepts client connections. |
| ClientHandler | Reads HTTP requests and sends responses to clients. |
| HtmlGenerator | Generates the main HTML page. |
| AlternativeHtmlGenerator | Provides an alternative HTML page implementation. |
| HttpResponse | Creates HTTP response headers and combines them with the HTML content. |
| RequestHandler | Defines the client request handling contract. |
| HtmlProvider | Defines the HTML generation contract. |
| HttpResponseFormatter | Defines the HTTP response formatting contract. |

## 6. How to Run

**Requirements:** Java JDK 15 or later.

1. Open the `src` directory in a terminal.
2. Compile the source files:

```bash
javac *.java
```

3. Start the server:

```bash
java Main
```

4. Open a web browser and visit:

```text
http://localhost:1989
```

## 7. SOLID Principles

The project demonstrates the five SOLID principles:

- **Single Responsibility Principle (SRP):** Each class has a specific responsibility, such as managing connections, generating HTML, or formatting HTTP responses.
- **Open/Closed Principle (OCP):** New HTML generator implementations can be added without modifying the existing client handling logic.
- **Liskov Substitution Principle (LSP):** Different implementations of the `HtmlProvider` interface can be used interchangeably.
- **Interface Segregation Principle (ISP):** Small and focused interfaces are used instead of a single large interface.
- **Dependency Inversion Principle (DIP):** Classes depend on abstractions rather than directly depending on concrete implementations.

## 8. Student Information

- **Name:** Esra Beyazkaya
- **Student Number:** 1250505070
- **Department:** Software Engineering

## 9. Purpose

This project was developed for educational purposes to understand Java networking, socket programming, HTTP communication, object-oriented programming, and SOLID principles.
