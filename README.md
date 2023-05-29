
##  Sistema de Posts  
Sistema onde usuarios podem fazer posts e outros podem comentar

## Stack utilizada

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## Documentação da API - USUARIOS

#### RETORNAR TODOS OS USUARIOS

```http
  GET/users
```



#### RETORNAR UM USUARIO

```http
  GET/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### ATUALIZAR UM USUARIO

```http
  PUT/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 200 |



{  
    
    "nome": "*nome do usuario*"
    "email : "*email do usuario *"
}

#### CRIAR UM USUARIO

#### PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 201 |



{  
    
    "nome": "*nome do usuario*"
    "email : "*email do usuario*"
}

#### DELETAR UM USUARIO

```http
  GET/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

## Documentação da API - POSTS

#### RETORNAR TODOS OS POSTS

```http
  GET/posts
```


#### RETORNAR UM POST POR ID

```http
  GET/posts/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |


#### RETORNAR UM POST POR TITULO

```http
  GET/posts/titlesearch
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `text`      | `string` | **digite o titulo que deseja buscar**. |

#### RETORNAR UM POST POR TITULO OU DATA OU USUARIO 

```http
  GET/posts/titlesearch
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `text`      | `string` | **digite qualquer palavra, data ou usuario que deseja encontrar**.
## Aprendizados

Criação de CRUD, criação de post, diferenciação de usuarios criadores do conteudo e usuarios que comentam, utilização de banco de dados não-relacional(MongoDB)
