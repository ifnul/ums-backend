## What is this repository for?

This project contains backend part for UMS (University Management System).

Project is written on Java - cross-platform language using such web framework as Spring, Jpa(Hibernate), Liquibase, Gatling. We use Maven as build tool and PostgreSQL as relational database.

P.S - I assume, that you are using Linux or other Unix systems. For those guys, that use non-unix system - sorry guys, it's your own personal drama :)

Kindly asking you to install only those version, that are listed below.

* java -version = 1.8

## How do I get set up?

### Cloning repositories

```
$ git clone https://github.com/ifnul/ums-tools
$ git clone https://github.com/ifnul/ums-backend
```

Cloned repositories above should be in the same folder.

### Setting up database

```
$ sudo apt-get install postgresql
$ sudo -u postgres psql
$ \password
	> now enter password 'postgres' two times (default password)
$ CREATE DATABASE lnu;
$ \q
```

### Building project

After cloning go to ums-backend directory

```
cd ums-backend
```

First command below will build project with default parameters (database, mail, etc.). 
You can override parameters locally modifying in **{backend.folder}/pom.xml** file **properties** section.

```
$ ./backend build # build project with default parameters
$ ./backend migrate # execute db migrations
$ ./backend seed # seed db with test data
$ ./backend run # run tomcat server 
$ ./backend test # run integration tests 
```
Up you go, backend is ready and fully tested.


If you want to modify some properties without chaning pom.xml - use maven command line options: 

```
$ ./backend migrate -Dmigrations.jdbc.host=somehost -Dmigrations.jdbc.port=1234
$ ./backend run -Dtomcat7.port=9090
$ ./backend test -Dintegration.url=http://localhost:9090/is-lnu-rest-api/api
```
