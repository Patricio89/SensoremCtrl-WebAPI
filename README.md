# SensoremCtrl-WebAPI
RESTful API for Project PAAD.

## Motivation:
This API is part of a set of the [Paad Project](https://github.com/SensoremCtrl/paad)
It handles user input from a web application where it registers email adresses combined with a set of two data values to be controlled by
a external application. 

## Build status:
Get Requests: - Functional
* getTemperature
* getHumidity
* getTimeStamp

Post Request - Functional
Post NewValues(Email, Temperature, Humidity)

Put Request - Failing
Put updateValues. 

## Code style:
[![java-standard-style](https://img.shields.io/badge/code%20style-standard-brightgreen.svg?style=flat)](https://github.com/SensoremCtrl/SensoremCtrl-WebAPI)

## Tech/framework used:
- [Spring-Boot](https://projects.spring.io/spring-boot/)
- [Hibernate](http://hibernate.org/)

## Installation:
Host locally or build up as .war for external deployment.

## Tests:
<b>None</b>

## How to use?
Modify properties file to map towards the directory of your database.
Boot up and CRUD functionality will work.

## Contribute
PUT request is failing, need to be fixed.

## Credits:
* Adrian Wieslander - Junior Software Developer/Student
* Patricio Morales - Junior Software Developer/Student

## License
* Intern - Software Developer (Student) CC By [Patricio Morales](https://github.com/Patricio89)
* Intern - Software Developer (Student) CC By [Adrian Wieslander](https://github.com/AdrWie)
* B3IT Innovation AB CC By [Johnne Adermark]()
* B3IT Innovation AB CC By [Kenneth Andersson]()
