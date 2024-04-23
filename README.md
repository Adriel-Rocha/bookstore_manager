<h1 align="center">
  Bookstore API Manager
</h1>

<p align="center">
<img src="https://img.shields.io/static/v1?label=LinkedIn&message=@adriel-francisco-rocha&color=8257E5&labelColor=000000" alt="@adriel-francisco-rocha" />
<img src="https://img.shields.io/static/v1?label=Tipo&message=API-REST&color=8257E5&labelColor=000000" alt="API-REST" />
</p>

API para cadastro dos livros de uma livraria através de uma API REST.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [MapStruct](https://mapstruct.org/)
- [H2](https://www.h2database.com/html/main.html)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3
- Implantação na nuvem através do Heroku

## Como Executar

- Para executar o projeto no terminal, digite o seguinte comando:
```
mvn spring-boot:run
```

A API poderá ser acessada em [localhost:8080/api/v1/books](http://localhost:8080/api/v1/books).
O Swagger poderá ser visualizado em [http://localhost:8080/api/v1/books/swagger-ui.html](http://localhost:8080/api/v1/books/swagger-ui.html)
O projeto mplantado no Heroku poderá ser acessado em [https://bookstore-manager-df0ea7d704f0.herokuapp.com/](https://bookstore-manager-df0ea7d704f0.herokuapp.com/).
O Swagger no Heroku poderá ser visualizado em [https://bookstore-manager-df0ea7d704f0.herokuapp.com/swagger-ui.html](https://bookstore-manager-df0ea7d704f0.herokuapp.com/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Livro
```


$ http POST :8080/api/v1/books

[
    {
      "name": "Investidor Inteligwnte",
      "pages": 200,
      "chapters": 20,
      "isbn": "0-596-52068-9",
      "publisherName": "Harper Collins",
      "author": {
          "name": "Benjamin Graham",
          "age":100
      }
    }
]
```

- Listar Livro pelo id
```
$ http GET :8080/api/v1/books/1

[
    {
      "id": 1,
      "name": "Investidor Inteligwnte",
      "pages": 200,
      "chapters": 20,
      "isbn": "0-596-52068-9",
      "publisherName": "Harper Collins",
      "author": {
          "name": "Benjamin Graham",
          "age":100
      }
    }
]
```