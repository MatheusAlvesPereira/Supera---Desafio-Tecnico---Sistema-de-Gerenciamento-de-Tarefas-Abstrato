## Desafio Técnico Java Supera

### Java Spring boot app 

# Gerenciamento de Tarefas

Esta é uma aplicação de gerenciamento de tarefas que utiliza Next.js para o front-end e Java 21 com Spring Boot para o back-end. A aplicação permite criar, gerenciar e visualizar listas de tarefas e itens dentro delas.

## Requisitos

- **Java 21**: Para rodar o back-end.
- **Node.js**: Para rodar o front-end (Next.js).

## Estrutura do Projeto

- **`/demo`**: Contém o código do back-end, desenvolvido com Java 21 e Spring Boot.
- **`/frontend`**: Contém o código do front-end, desenvolvido com Next.js.

## Clonando o Repositório

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/MatheusAlvesPereira/Supera---Desafio-Tecnico---Sistema-de-Gerenciamento-de-Tarefas-Abstrato.git

   ## Configurando o Back-end

2. **Navegue para o diretório do back-end:**

   ```bash
   cd backend


3. **Configure o banco de dados:**
   ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha

Certifique-se de ter o PostgreSQL instalado e configurado.


4. **Compile e rode o back-end:**
.Compile o projeto usando Maven ou Gradle (dependendo da configuração do projeto). Exemplo usando Maven:
   ```bash
    mvn clean install

Rode o projeto Spring Boot:

O back-end estará disponível em http://localhost:8080.


**Configurando o Front-end**
Navegue para o diretório do front-end:

cd/frontend

npm install<br>
<br>
npm run dev<br>

