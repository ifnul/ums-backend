##What is this repository for?
>This project contains backend part for UMS(Inoversity Management System).
Project is written on Java - crossplatform language using such web framework as Spring, Jpa(Hibernate), Liquibase, Gatling.We use Maven as build tool and PostgreSQL as relational database.


P.S - I assume, that you  are using Linux or other Unix systems.For those guys, that use non-unix system - sorry guys, it's your own personal drama :)

* Apache Tomcat - Our application server, that we use.

Kindly asking you to install only those version, that are listed below.
* java -version = 1.7
* mvn.version = 3.2.5
* spring.version = 4.1.0.RELEASE
* hibernate.version = 4.2.0.RELEASE
* tomcat.version = 7.0.47

##How do I get set up?

> **cd {backend.folder}**


> Command below will build project with default parameters.That means, that you will have default properties of database, mail parameters, etc. If you want to override them, go to **{backend.folder}/pom.xml** and find **properties** section. There you will find properties, that are mutable and can be changed during deploy process. they are marked as **mutable.***

> **mvn clean install**

> **cp ./is-lnu-rest-api/target/is-lnu-rest-api.war ~/PATH_TO_YOUR_TOMCAT/webapps**

> **cd ./is-lnu-liquibase**

> **mvn liquibase:update** # if you have other jdbc properties -> override them

> **cd ../is-lnu-sql**

> **mvn -Pdata clean install** 

> **cd {tomcat.folder}**

> **./bin/catalina.sh run**

> **cd {backend.folder}/is-lnu-integration**

> **mvn clean install** # Build must succeed.

>Up you go, backend is ready and fully tested.