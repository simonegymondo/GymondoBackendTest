## Gymondo Backend Test

You should not take more than 90 minutes to complete all the tasks.

###### Problem Statement
You are asked to extend some of the /rest-api/api/v1/users endpoint functionalities. The application right now is completely functional but we'd like to enrich the user information with:

* The subscriptions that belong a users or users;
* The expiration date of each subscription.

###### Objectives
You are being tested for good practices, code cleanliness and performance.

###### Reflections

* What's the problem with the GET /rest-api/api/v1/users endpoint? How can we solve it? Ignore the security topic.
* Imagine that for some reason we decide that we no longer want to deliver the subscriptions with the user (this means removing the subscriptions member from the json). What would you do to accomplish that? Why is this such an important topic?

###### Installing and running

You'll need:
* Java SDK 8
* Git
* Maven
* An IDE of your choice

```
git clone https://github.com/Gymondo-git/GymondoBackendTest.git
git checkout master

mvn clean install

cd rest-api

# To run the application:
mvn tomcat7:run

# Open a web browser and type http://localhost:8080/rest-api/api/v1/users
```
