### CRUD de Alunos – Spring Boot

Projeto simples de CRUD de alunos utilizando Spring Boot, Spring Data JPA, MySQL e um frontend HTML básico.

## 🚀 Tecnologias

Java 17+

Spring Boot 3

Spring Web

Spring Data JPA

MySQL

HTML/JS

## 📌 Funcionalidades

Criar aluno

Listar alunos

Buscar por ID

Atualizar aluno

Deletar aluno

## ⚙️ Configuração
application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/crud_alunos
spring.datasource.username=root
spring.datasource.password=SUASENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Crie o banco no MySQL:

CREATE DATABASE crud_alunos;

## ▶️ Como executar
mvn spring-boot:run


Ou execute CrudAlunosApplication pela IDE.

Acesse no navegador:

[http://localhost:8080/api/alunos](http://localhost:8080/api/alunos)

## 🌐 Frontend

Arquivo básico em:

src/main/resources/static/index.html

## 🧪 Endpoints Principais

GET /alunos – lista todos 
GET /alunos/{id} – busca por ID 
POST /alunos – cria registro 
PUT /alunos/{id} – atualiza 
DELETE /alunos/{id} – remove 

## 🧪 Testes de Desempenho com JMeter

Este projeto inclui um plano de teste JMeter para avaliar o desempenho da API.

## ▶️ Como executar

Baixe o Apache JMeter.

Abra o arquivo: test-plan-api.jmx

Clique em Run (▶️) para iniciar os testes.

## 📂 O plano contém

Thread Group (simulação de usuários)

HTTP Requests para os endpoints

Summary Report

Aggregate Report

View Results Tree

Graph Results (opcional)

## 🎯 Objetivo dos Testes

Medir tempo de resposta

Avaliar throughput

Identificar erros e gargalos

Gerar relatórios para análise



## 🙋‍♀️ Autora

Lilian Martins
