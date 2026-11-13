# API Calculadora — Spring Boot

API REST simples de calculadora feita com **Java** e **Spring Boot**, no curso de Sistemas de Informação da **FIAP**.

## Endpoints

Todos usam `GET` e recebem os parâmetros `a` e `b` (valor padrão 0).

| Endpoint | Exemplo | Resposta |
| --- | --- | --- |
| `/calculadora/somar` | `/calculadora/somar?a=2&b=3` | `5` |
| `/calculadora/subtrair` | `/calculadora/subtrair?a=10&b=4` | `6` |
| `/calculadora/multiplicar` | `/calculadora/multiplicar?a=2&b=3` | `6.0` |
| `/calculadora/dividir` | `/calculadora/dividir?a=5&b=2` | `2.5` |

Divisão por zero devolve **400 Bad Request** com a mensagem "Não existe divisão por zero".

## Tecnologias

- Java 25
- Spring Boot (Spring Web MVC)
- JUnit 5 (testes da calculadora)
- Maven

## Como rodar

1. Abra o projeto no IntelliJ e rode `CalculadoraApplication` (ou `./mvnw spring-boot:run`).
2. Acesse no navegador: `http://localhost:8080/calculadora/somar?a=2&b=3`
3. Para rodar os testes: `./mvnw test`
