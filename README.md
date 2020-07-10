# MarvelAPI

Projeto desenvolvido com o objetivo de re-implementar os endpoints beseados na [API orginal](https://developer.marvel.com/docs#!/public) e foi desenvolvido em [Java](https://java.com) utilizando o framework [Spring Boot](https://spring.io/projects/spring-boot).

## Tecnologias utilizadas

| # | Para que |
|:-:|:-|
| [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml) | Linguagem de programação que a aplicação foi construída |
| [Docker](https://www.docker.com) | Ferramenta de container que a aplicação é empacotada e executada |
| [Lombok](https://projectlombok.org) | Ferramenta utilitária para geração de código em Java com foco em diminuir o boilerplate |
| [Spring Boot](https://spring.io/projects/spring-boot) | Framework base em que a aplicação foi construída e projetada |
| [Spring Fox](http://springfox.github.io/springfox/) | Ferramenta para geração da documentação da api Rest com Swagger, que funciona integrada com Spring Boot |
| [H2 Database Engine](https://www.h2database.com/html/main.html) | H2 é um sistema de gerenciamento de banco de dados relacional escrito em Java que pode ser incorporado em aplicativos Java ou executado no modo cliente-servidor |
| [Swagger](https://swagger.io) | Tecnologia utilizada para documentação das api’s Rest  |
| [JUnit 5](https://junit.org/junit5/) | Utilizado para execução dos testes da app |
| [Jacoco](https://www.eclemma.org/jacoco/) | Ferramenta utilizada para monitoramento de cobertuda de código dos testes |

## Execução

### Execução local IDE 

A aplicação pode ser executada e alterada por uma IDE, para fazer isso é necessário ter as seguintes ferramentas:

#### Pré requisitos

- [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml) 
- [Maven >= 3.x](https://maven.apache.org/ref/3.6.3/)


### Build local

Caso necessário a aplicação pode ser executada localmente via linha de comando.

#### Pré requisitos
- [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml) 
- [Maven >= 3.x](https://maven.apache.org/ref/3.6.3/)

#### Execução

```shell
# Na raiz do projeto, executar os seguintes comandos

# Build Maven (executa os testes automatizados)
mvn clean install

# Execução 
#OBS: Por padrão o sistema está configurado para subir na porta 9003
java -jar target\marvelAPI-latest.jar
```


### Build local Docker

Caso necessário a aplicação pode ser executada localmente via Docker.

#### Pré requisitos
- [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml) 
- [Maven >= 3.x](https://maven.apache.org/ref/3.6.3/)
- [Docker](https://www.docker.com)

#### Execução

```shell
# Na raiz do projeto, executar os seguintes comandos

mvn package

# OBS: O nome da imagem já está pré-configurado como: marvel-api-olimar:latest
# Ex: 
#     docker run -p 9003:9003 marvel-api-olimar:latest

```

#### Swagger

A documentação da API pode ser acessada via Swagger, disponível atráves do link `http://localhost:9003/swagger-ui.html`.
