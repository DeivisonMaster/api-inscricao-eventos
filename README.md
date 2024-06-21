# API Spring Boot de Eventos

**API Spring Boot 3.x para registro de participantes em eventos**

## O que foi desenvolvido
**Foi desenvolvido um serviço de envio de emails que recebe os dados de um cliente como destino, assunto e mensagem e envia estes dados ao seu destino.**
**A aplicação foi implantada em uma instância EC2 mas por questões de custos, o serviço esta offline.**

**Foi escolhido o nivel Pleno para o desafio <br/>**
**O Java na versão 17 foi escolhido como linguagem. <br/>**
**Utilizado padrão Restful para o desenvolvimento do serviço. <br/>**
**Dentro do requisito tecnico, foi escolhido a trilha de back-end com um minimo de front-end sendo a documentação via API Docs.**

## Tecnologias

- **Java 17** 
- **Spring Boot** 
- **Apache Maven** 
- **Spring Data JPA** 
- **Spring Open Feign**
- **API Docs** 
- **Devtools**
- **Lombok**
- **H2 Database** 

## Como rodar a aplicação

**Inicie a aplicação usando qualquer um dos comandos abaixo**

> **Nota:** Para os dois primeiros comandos, é necessario executar dentro da pasta raiz do projeto i.e **email-service** pasta

- **Usando maven** ``` mvn spring-boot:run```

- **A partir de arquivo jar**
  Criar um arquivo jar usando o comando '**mvn clean install**' e então executar 
  <br/>```java -jar target/ms-evento-0.0.1-SNAPSHOT.jar```


- **Diretamente a partir de uma IDE**
  <br/>```Clicar com o botão direito em MsEventoApplication.java e então clicar na opção 'Run' ```
  <br/><br/>

> **Nota:** Por padrão aplicações Spring Boot iniciam na porta 8080. 
Se a porta 8080 estiver ocupada em seu sistema, então voce pode mudar o numero da porta atualizando a linha **server.port**  dentro do arquivo 
**application.properties** que esta disponivel dentro da pasta **src > main > resources**.

<br/>

**Envie uma requisição POST para o endpoint '/eventos' endpoint usando um aplicativo terceiro como o Postman**

## Acesso a API Docs
- **Swagger** ``` http://localhost:8080/swagger-ui.html ```
- **API Docs** ``` http://localhost:8080/v3/api-docs ```

