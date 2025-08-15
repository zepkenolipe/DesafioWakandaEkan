# API REST - Cadastro de Beneficiários de Plano de Saúde

Este projeto é uma aplicação Java com **Spring Boot** que expõe endpoints REST para gerenciar beneficiários de um plano de saúde e seus documentos.

## 📌 Tecnologias Utilizadas
- Java 17
- Spring Boot 3.5.4
- Spring Web
- Spring Data JPA
- Banco embarcado **H2**
- Lombok
- Swagger OpenAPI

---

## 📂 Estrutura do Projeto
```
src/main/java/br/com/ekan/desafioekan
│
├── beneficiario
│ ├── api                  # Controllers REST de beneficiário
│ ├── domain               # Entidades e DTOs de beneficiário
│ ├── infra                # Configurações e utilitários de beneficiário
│ ├── repository           # Repositórios JPA de beneficiário
│ └── service              # Regras de negócio de beneficiário
│
├── documento
│ ├── api                  # Controllers REST de documento
│ ├── domain               # Entidades e DTOs de documento
│ ├── repository           # Repositórios JPA de documento
│ └── service              # Regras de negócio de documento
│
└── handler                # Tratamento global de exceções
```

---

## 🗄 Modelo de Dados

**Relacionamento:**  
Um **Beneficiário** possui **um ou mais Documentos**.

**Beneficiário**
- id
- nome
- telefone (único)
- dataNascimento
- dataInclusao
- dataAtualizacao

**Documento**
- id
- tipoDocumento
- descricao
- dataInclusao
- dataAtualizacao
- beneficiario_id (FK)

---

## 🚀 Executando o Projeto

### Pré-requisitos
- Java 17 ou superior
- Maven 3.x

### Passos para execução
```bash
# 1. Clonar o repositório
git https://github.com/zepkenolipe/DesafioWakandaEkan.git
cd seurepositorio

# 2. Compilar e executar
mvn spring-boot:run
```

A aplicação estará disponível em:  
```
http://localhost:8080/desafio-ekan/api
```

---

## 🔗 Endpoints

### Beneficiários
- **POST** `/beneficiario` → Cadastrar um beneficiário
- **GET** `/beneficiario` → Listar todos os beneficiários cadastrados
- **GET** `/beneficiario/{id}` → Listar dados de um beneficiário
- **PATCH** `/beneficiario/{id}` → Atualizar os dados cadastrais de um beneficiário
- **DELETE** `/beneficiario/{id}` → Remover um beneficiário

### Documentos (vinculados a beneficiário)
- **POST** `/beneficiario/{idBeneficiario}/documento` → Cadastrar um documento para um beneficiário
- **GET** `/beneficiario/{idBeneficiario}/documento` → Listar todos os documentos de um beneficiário a partir de seu id

---

## 🛠 Banco de Dados (H2)
Console H2:
```
http://localhost:8080/desafio-ekan/api/console
```
Configurações:
- **JDBC URL:** `jdbc:h2:mem:demodb`
- **User:** `sa`
- **Password:** *(em branco)*

---

## 📜 Documentação Swagger
Após iniciar a aplicação, acessar:
```
http://localhost:8080/desafio-ekan/api/swagger
```

---
---

## 👨‍💻 Autor
Desenvolvido por **Phellipe Rhian**  
📧 Email: phelliperrp@gmail.com
📌 GitHub: [zepkenolipe](https://github.com/zepkenolipe)
