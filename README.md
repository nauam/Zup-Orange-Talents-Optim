
# Desafio Orange Talents

<p align="center">
  <img src="https://img.shields.io/static/v1?label=java&message=15&color=blue&style=for-the-badge&logo=java"/> <img src="https://img.shields.io/static/v1?label=maven&message=4.0.0&color=red&style=for-the-badge&logo=apache"/> <img src="http://img.shields.io/static/v1?label=spring-boot&message=2.4.1&color=red&style=for-the-badge&logo=spring"/>
</p>
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=green&style=for-the-badge"/> <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
</p>

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Dependências](#dependências)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

## Descrição do projeto 

<p align="justify">
   API REST para um processo de abertura de nova conta no banco. As informações obrigatórias são: Nome, E-mail, CPF e Data de nascimento. 
</p>

## Funcionalidades

:heavy_check_mark: Metodo POST: Envio dos parâmetros,

:heavy_check_mark: Validação: Todos os parâmetros estão preenchidos,

:heavy_check_mark: Validação: Nome tem que conter mais de 5 caracteres,

:heavy_check_mark: Validação e duplicação: E-mail e CPF.

## Pré-requisitos

:warning: [JDK 15](https://www.oracle.com/br/java/technologies/javase-downloads.html)

:warning: [Apache Maven](https://maven.apache.org/download.cgi)

:warning: [Postman](https://www.postman.com/downloads/)

## Dependências
:wrench: H2 Database

:wrench: Spring Data JPA

:wrench: Spring Web

:wrench: Validation

## Como rodar a aplicação :arrow_forward:

### clone o projeto:

```
git clone https://github.com/nauam/Zup-Orange-Talents-Optim.git
cd Zup-Orange-Talents-Optim
```
### Construção
Para construir o projeto com o Maven, executar os comando abaixo:

```
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório target com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

### Execução
Para executar o projeto com o Maven Spring Boot Plugin, executar os comando abaixo:

```
mvn spring-boot:run
```
O comando irá rodar o projeto e subir na porta 8080

### Requisições

<details><summary><b>Payload (Clique aqui)</b></summary>

Cadastrar uma nova conta no banco: [**POST**]
```json
{
	"nome" : "Maria de Nazaré Esteves Tedesco",
	"email" : "nazare.tedesco@outlook.com",
	"cpf": "10131949004",
	"dataNascimento": "24/08/1968"
}
```
</details>

## Licença 

The [MIT License]() (MIT)

Copyright &copy;  2021 - Desafio Orange Talents (Nauam)