
# Parking - REST API
![Maven](https://img.shields.io/badge/maven-4.0.0-green)
![JDK](https://img.shields.io/badge/JDK-11-green)
![JAVA](https://img.shields.io/badge/JAVA-green)
![SPRINGBOOT](https://img.shields.io/badge/SpringBoot-2.7.4-green)

REST API para controle de estacionamento de carros

O projeto consiste em um sistema de estacionamento, temos as entradas de carro e no checkout fazemos o cálculo da tarifa.
Utilizamos DTO para cada RESPONSE nos endpoints do controller, e inversão de controle utilizando construtor ao invés do autowired.

## Requisitos

- Spring Web
- PostgreSQL -> Driver
- Spring Data JPA
- Hibernate Validator

Retorno dos dados por DTO:
- Model Mapper

Documentação:
- Swagger UI - Swagger 2 - SpringFox starter

## Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

## Stop database
docker stop parking-db

## Start database
docker start parking-db
