# Sistema de Gestão de Usuários e Endereços

## Visão Geral

Este projeto é uma aplicação web desenvolvida com Java no backend e Angular, HTML e CSS no frontend. A aplicação oferece funcionalidades de CRUD (Create, Read, Update, Delete) para gerenciar usuários e seus respectivos endereços. O projeto também implementa o padrão de projeto Singleton para garantir que uma única instância de uma classe seja criada e utilizada em toda a aplicação.

## Funcionalidades

- **CRUD de Usuários**: Adicione, visualize, atualize e exclua informações de usuários.
- **CRUD de Endereços**: Gerencie os endereços associados aos usuários, permitindo a criação, leitura, atualização e exclusão.
- **Padrão Singleton**: A aplicação utiliza o padrão Singleton para gerenciar recursos compartilhados e garantir a consistência das operações.

## Tecnologias Utilizadas

- **Backend**: Java
- **Frontend**: Angular, HTML, CSS

## Estrutura do Projeto

- **Backend**: O servidor backend foi construído em Java, provendo APIs RESTful para interagir com o frontend e realizar operações de CRUD no banco de dados.
- **Frontend**: A interface do usuário foi desenvolvida com Angular, HTML e CSS, oferecendo uma experiência interativa e responsiva.

## Como Executar o Projeto

1. **Clone o Repositório**

    ```bash
    git clone <URL do repositório>
    cd <diretório do repositório>
    ```

2. **Configuração do Backend**

    - Certifique-se de ter o Java instalado.
    - Navegue até o diretório do backend.
    - Configure seu banco de dados e as propriedades do arquivo de configuração.
    - Inicie o servidor backend.

3. **Configuração do Frontend**

    - Certifique-se de ter o Node.js instalado.
    - Navegue até o diretório do frontend.
    - Instale as dependências necessárias usando `npm install`.
    - Inicie o servidor frontend com `ng serve`.

4. **Acessando a Aplicação**

    - Acesse a aplicação em seu navegador através do endereço `http://localhost:4200`.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
