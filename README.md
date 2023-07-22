<h1 align="center"> Todo Application</h1>

>### Framework Used 
* [SpringBoot](javatpoint.com/spring-boot-tutorial)

>### Language Used
* [Java](https://www.java.com/en/download/help/whatis_java.html)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Repository** - Here database is stored, for which I have used arrayList. In the database layer, CRUD operations are performed.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **DataBase Class** - Here the class TodoModel is defined and the whatever a TodoModel class will load. e.g -todoId, todoName, todoDoneStatus.

>## Data Structure used in my project
In our project [ArrayList](https://www.geeksforgeeks.org/internal-working-of-arraylist-in-java/) and the methods involved with ArrayList, like add method for posting new Todo, remove method for deleting a Todo, update a Todo by status and specific Id, get a todo by Id, get all Todos, etc.
>## Project Summary
This project basically maintains the Todo information which includes -
* TodoId
* TodoName
* TodoDoneStatus

You can create a Todo, read a Todo, read by specific id, update Todo of specific todoId, delete a Todo by their userId by api calls.
