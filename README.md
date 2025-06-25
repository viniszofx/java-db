# Student Management API

A Spring Boot REST API for managing students and people records.

## 🚀 Features

- CRUD operations for students and people
- Data validation
- Error handling
- PostgreSQL database integration

## 📋 API Endpoints

### People Endpoints

**GET /pessoas** - List all people
**POST /pessoa** - Create new person

Example request body:

```json
{
  "nome_estudante": "João Silva",
  "idade": 20,
  "sexo": "M"
}
```

### Student Endpoints

**GET /alunos** - List all students
**POST /aluno** - Create new student

Example request body:

```json
{
  "idpessoa": 1,
  "campus": "Campus Central",
  "polo": "Polo A",
  "email_institucional": "aluno@instituicao.edu.br",
  "coordenacao": "Coordenação de TI",
  "curso": "Engenharia de Software",
  "situacao": "Ativo",
  "periodo_entrada": "2023.1"
}
```

## 📦 Required Fields

### Person

- nome_estudante
- idade
- sexo

### Student

- campus
- email_institucional (must be valid email)
- curso
- periodo_entrada

## 🛠️ Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## 💻 Running Locally

1. Clone the repository

```bash
git clone https://github.com/yourusername/edu-spring-api.git
```

2. Navigate to the project directory

```bash
cd edu-spring-api/api-java
```

3. Build the project

```bash
mvn clean install
```

4. Run the application

```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`
