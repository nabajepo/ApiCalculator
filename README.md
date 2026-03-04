# ApiCalculator — Spring Boot REST API (Kotlin)

## Overview
ApiCalculator is a lightweight REST API built with **Spring Boot + Kotlin** that performs basic arithmetic operations:
addition, subtraction, multiplication, and division.

The API exposes simple endpoints of the form:
`/calculator/{operation}/{number1}/{number2}`

---

## Features
- REST endpoints for basic calculations
- Built with Spring Boot (Kotlin)
- Simple error handling (400 Bad Request on invalid requests)
- Includes a minimal HTML page (`static/index.html`) listing endpoints

---

## Tech Stack
- Kotlin
- Spring Boot (Web)
- Gradle (Kotlin DSL)

---

## API Endpoints

| Operation | Endpoint | Example |
|----------|----------|---------|
| Add | `/calculator/add/{n1}/{n2}` | `/calculator/add/1/2` |
| Subtract | `/calculator/subtract/{n1}/{n2}` | `/calculator/subtract/10/3` |
| Multiply | `/calculator/multiply/{n1}/{n2}` | `/calculator/multiply/4/5` |
| Divide | `/calculator/divide/{n1}/{n2}` | `/calculator/divide/10/2` |

### Example responses
- `1 + 2 = 3`
- `10 - 3 = 7`
- `4 X 5 = 20`
- `10 / 2 = 5`

---

## Run locally

### Start the server
```bash
./gradlew bootRun # The API will run on: http://localhost:8080
```

---
## Testing the API

**Using a browser** 
Open : http://localhost:8080/calculator/add/1/2

**Using Curl**
curl http://localhost:8080/calculator/add/1/2
curl http://localhost:8080/calculator/subtract/10/3
curl http://localhost:8080/calculator/multiply/4/5
curl http://localhost:8080/calculator/divide/10/2




