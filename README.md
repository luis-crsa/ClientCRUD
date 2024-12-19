# 📑ClientCRUD
Aplicação backend para gerenciamento de clientes com operações CRUD (Create, Read, Update, Detele).

![image](https://github.com/user-attachments/assets/b79ca988-e588-40ac-816e-ffbc48c1a0a5)

## 🛠️Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## 📍Endpoints da API
| Rota               | Descrição                                          
|----------------------|-----------------------------------------------------
| GET /clients     | Recupera as informações de todos os clientes
| GET /clients/{id}   | Recupera as informações de um cliente pelo id
| POST /clients     | Salva um novo cliente
| PUT /clients/{id}     | Atualiza as informações de um cliente pelo id
| DELETE /clients/{id}     | Deleta um cliente pelo id

## 💻Execução do projeto
Pré-requisitos: Java 21

```bash
# Clone o repositório
git clone https://github.com/luis-crsa/ClientCRUD.git

# Acesse a pasta do projeto
cd clientcrud

# Execute o projeto
./mvnw spring-boot:run
```

# 👨‍💻Autor
Luís Cláudio Rodrigues Sarmento
