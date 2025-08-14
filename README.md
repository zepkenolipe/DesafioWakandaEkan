# API REST - Cadastro de Beneficiários de Plano de Saúde

Este projeto é uma aplicação Java com **Spring Boot** que expõe endpoints REST para gerenciar beneficiários de um plano de saúde e seus documentos.

## 📌 Tecnologias Utilizadas
- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Banco embarcado **H2**
- Lombok
- Swagger OpenAPI

---

## 📂 Estrutura do Projeto
```
src/main/java/com/seuprojeto
│
├── controller        # Controllers REST
├── dto               # Objetos de transferência de dados
├── entity            # Entidades JPA
├── repository        # Interfaces de acesso a dados
├── service           # Regras de negócio
└── exception         # Tratamento de exceções
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
git clone https://github.com/seuusuario/seurepositorio.git
cd seurepositorio

# 2. Compilar e executar
mvn spring-boot:run
```

A aplicação estará disponível em:  
```
http://localhost:8080
```

---

## 🔗 Endpoints

### Beneficiários
- **POST** `/beneficiarios` → Cadastrar beneficiário junto com documentos
- **GET** `/beneficiarios` → Listar todos beneficiários
- **GET** `/beneficiarios/{id}/documentos` → Listar documentos de um beneficiário
- **PUT** `/beneficiarios/{id}` → Atualizar beneficiário
- **DELETE** `/beneficiarios/{id}` → Remover beneficiário

---

## 📄 Exemplo de Requisição (POST `/beneficiarios`)
```json
{
  "nome": "João da Silva",
  "telefone": "11999999999",
  "dataNascimento": "1990-05-12",
  "documentos": [
    {
      "tipoDocumento": "RG",
      "descricao": "Registro Geral"
    },
    {
      "tipoDocumento": "CPF",
      "descricao": "Cadastro Pessoa Física"
    }
  ]
}
```

---

## 🛠 Banco de Dados (H2)
Console H2:
```
http://localhost:8080/h2-console
```
Configurações:
- **JDBC URL:** `jdbc:h2:mem:meubanco`
- **User:** `sa`
- **Password:** *(em branco)*

---

## 📜 Documentação Swagger
Após iniciar a aplicação, acessar:
```
http://localhost:8080/swagger-ui.html
```

---

## ⚠️ Possíveis Melhorias Futuras
- Implementar autenticação/autorização com Spring Security.
- Adicionar paginação e filtros nas listagens.
- Criar validações mais robustas nos DTOs.
- Testes unitários e de integração.

---

## 👨‍💻 Autor
Desenvolvido por **Seu Nome**  
📧 Email: seuemail@dominio.com  
📌 GitHub: [seuusuario](https://github.com/seuusuario)
