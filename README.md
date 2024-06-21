# Micro Serviço de gerenciamento de Eventos

**API Spring Boot 3.x para registro de participantes em eventos**

## O que foi desenvolvido
**A aplicação é um micro serviço que se comunica com uma API externa de envio de e-mails utilizando Amazon SES. **
**Para cada novo participante registrado em um evento, um e-mail utilizando o serviço externo é disparado como confirmação de cadastro. **
**A aplicação é responsavel por cadastrar novo evento, listar todos os eventos cadastrados, filtrar os eventos por data e registrar novos participantes.**


**Possibilidade de Melhoria:** 
- para garantir que os e-mails de notificação sejam enviados, micro serviço de evento depender diretamente de um middleware de gerenciamento de filas 
para caso o serviço de e-mails esteja indisponivel no momento


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

> **Nota:** Para os dois primeiros comandos, é necessario executar dentro da pasta raiz do projeto i.e **ms-evento** pasta

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

**Envie uma requisição POST para o endpoint '/eventos' usando um aplicativo terceiro como o Postman**
<br/>
**O arquivo .json de Collections da API esta disponivel na pasta raiz da aplicação ***`

