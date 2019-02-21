# Spring REST API Example

Example of [**REST API**](https://en.wikipedia.org/wiki/REST) implemented in Java using [**Spring**](https://spring.io/projects/spring-framework) framework and a [**MySQL**](https://www.mysql.com/) database.

## Configuration instructions

1. Create a file **_application.properties_**
2. Write the following contents to the file:

```properties
spring.datasource.url = 
spring.datasource.username = 
spring.datasource.password = 
spring.datasource.platform = mysql
spring.datasource.max-active = 100
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.jpa.show-sql = true
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
```

3. Configure the fields **spring.datasource.url**, **spring.datasource.username**, and **spring.datasource.password** accoring to your settings
4. Copy the file to directories **./src/main/resources/** and **./src/test/resources/**

## Installation instructions

1. Clone the repo to your local machine
2. Unzip the files

## Operating instructions

1. Go to the repo directory in a terminal
2. Run the following command to build the app

```batch
mvn package
```

3. Run the following command to launch the app

```batch
java -jar target/se-0.0.1-SNAPSHOT.jar
```

4. To stop the app, press **Ctrl + C** in the terminal

## A file manifest

### Tree

```txt
.
├───.settings
│   ├───org.eclipse.core.resources.prefs
│   ├───org.eclipse.jdt.apt.core.prefs
│   ├───org.eclipse.jdt.core.prefs
│   ├───org.eclipse.jpt.core.prefs
│   ├───org.eclipse.jpt.entitygen.new-mysql.mylocal
│   ├───org.eclipse.m2e.core.prefs
│   ├───org.eclipse.wst.common.project.facet.core.prefs.xml
│   └───org.eclipse.wst.common.project.facet.core.xml
├───bin
│   └───target
│       ├───classes
│       │   ├───META-INF
│       │   └───se
│       ├───generated-sources
│       │   └───annotations
│       ├───maven-archiver
│       └───maven-status
│           └───maven-compiler-plugin
│               └───compile
│                   └───default-compile
├───img
│   ├───DELETE_request_res.png
│   ├───DELETE_request.png
│   ├───GET_ALL_request_res.png
│   ├───GET_ALL_request.png
│   ├───GET_request_res.png
│   ├───GET_request.png
│   ├───POST_request_res.png
│   ├───POST_request.png
│   ├───PUT_request_res.png
│   └───PUT_request.png
├───src
│   ├───main
│   │   ├───java
│   │   │   ├───META-INF
│   │   │   │   ├───additional-spring-configuration-metadata.json
│   │   │   │   └───persistence.xml
│   │   │   └───se
│   │   │       ├───Application.java
│   │   │       ├───Partner.java
│   │   │       ├───PartnerController.java
│   │   │       └───PartnerRepository.java
│   │   └───resources
│   └───test
│       └───resources
├───target
│   ├───classes
│   │   ├───META-INF
│   │   │   ├───additional-spring-configuration-metadata.json
│   │   │   └───persistence.xml
│   │   └───se
│   └───test-classes
├───.classpath
├───.gitignore
├───.project
├───partner.sql
├───pom.xml
└───README.md
```

### Total: 42 files

## Copyright and licensing information

## Contact information for the distributor or programmer

## Known bugs

### _Some classes are not found_

#### Problem

Dependencies are incorrect.

#### Solution

Change the contents of the following configuration files according to the error log and settings of your machine:

1. **_./.classpath_**
2. **_./.project_**
3. **_./pom.xml_**

## Credits and acknowledgments

### Authors

- **Roman Bezusiak** - _Initial work_ - [Roman Bezusiak (GitHub profile)](https://github.com/roman-bezusiak)

### Used resources

- **[Wikimedia Foundation Inc.](https://wikimediafoundation.org/wiki/Home), Wikipedia** - _Encyclopedia materials_ - [wikipedia.org](https://www.wikipedia.org/)

### Used code

- **Spring** - _Spring framework_ - [Spring](https://spring.io/projects/spring-framework)