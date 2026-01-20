#  IUT - Tower Defense

This is a Java application built using **Maven**. This repository is a clone of the original repository https://gitlab.com/ludopradel/iut-tower-defense

## Prerequisites

Make sure you have the following installed on your system:

- **Java JDK 8 or later**
  ```bash
  java -version

- **Apache Maven**
  ```bash
  mvn -version


## Project Structure
project-root/
├── pom.xml
├── src/
│   └── main/
│       └── java/game/
│               ├── effect/
│               ├── enemy/
│               ├── panel/
│               ├── path/
│               ├── tower/
│               ├── util/ImageLoader.java
│               └── Game.java
└── target/


## Project Structure
From the project root directory (where pom.xml is located), run:
  ```bash
  mvn clean package
  ```

## Run the Application
- **Option 1: Run the generated JAR**
  ```bash
  java -jar target/<project-name>.jar


- **Option 2: Run using Maven**
  ```bash
  mvn exec:java


