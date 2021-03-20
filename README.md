# Simple Spring Boot with H2 database example

Very simple Spring Boot application that uses Spring JDBC and an embedded H2 database.

Spring has a pretty cool feature where it auto-executes any `.sql` files located in `/src/main/resources`

## Usage

Start it up the spring-boot way
```bash
mvn spring-boot:run
```

Only 1 Rest Endpoint to call
```bash
curl localhost:8080/getall
```