A service TODO list task manager using Java, Spring and MongoDB.

## Getting Started

### With docker
```
docker-compose up
```
### Without docker
#### Prerequisites

- MongoDB https://docs.mongodb.com/manual/installation/
- Java https://nodejs.org/en/

#### Setup
```
$ ./mvn clean install
```

#### Start
```
mvn spring-boot:run
```

### API examples

- GET /todo Return all todo items

- GET /todo/{id} Return a specific todo item

- DELETE /todo/{id} delete a specific todo item

- POST /todo create a new todo item
  - e.g.:
  
  ```
  header: Content-Type = application/json
  body : {
	"title": "title 2",
	"description": "description 2"
  }
  ```