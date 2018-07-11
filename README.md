# springbootapp

Projeto de aplicação Spring Boot simples com um serviço de saudação.

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8: Necessário para executar o projeto Java](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.5.3: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/condessalovelace/springbootapp.git
```

#### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```
O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

#### Deploy

Após a construção, acessar o diretório `target` e executar o arquivo `jar`:

```shell
java -jar springbootapp-0.0.1-SNAPSHOT.jar
```

O serviço será disponibilizado em `http://localhost:9090/oi/`.

## Features

O projeto possui um serviço que cumprimenta pelo nome passado o usuário da requisição. Ele pode ser usado como modelo para o desenvolvimento de um projeto usando o SpringBoot.

## Configuração

- Se a porta 8080 estiver em uso, altere a mesma no arquivo `application.properties`.

## Links

- [Blog de desenvolvimento](https://condessalovelace.blogspot.com)

## Licença

Não se aplica.
