# Sistema de Biblioteca (Java MVC)

Projeto simples feito em Java com Spring Boot e Thymeleaf para treinar o padrão MVC (Model, View, Controller).

## O que foi feito no projeto:

* **Estrutura de pastas:** Organização padrão do Spring Boot com `src/main/java` (para o código Java) e `src/main/resources/templates` (para as telas HTML).
* **Telas (Views):** Criação das páginas de início e de detalhes em HTML + Thymeleaf para **Livros, Autores, Categorias, Usuários e Empréstimos**, todas ligadas por um menu de navegação.
* **Controladores (Controllers):** Criação das rotas (`/livros`, `/autores`, `/categorias`, `/usuarios`, `/emprestimos`) para conectar os dados do Java com as telas HTML.
* **Modelos (Models):** Criação das classes com os atributos básicos de cada item do sistema (nome, título, ISBN, data de empréstimo, etc.).
* **Git e GitHub:** Configuração do repositório, commits e envio de todo o código pelo terminal.

## Como rodar:
1. Abra o projeto no VS Code.
2. Rode a aplicação Spring Boot.
3. Acesse `http://localhost:8080/livros` no navegador.
