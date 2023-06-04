# desafio_postech_docker
API Rest com Spring Boot, Kotlin e Gradle rodando no docker com conexão ao mysql

Para startar o projeto siga os passos abaixos:

    - docker network create network-linguagem
    - docker compose up
    
Abra o navegador e entre em:

    - http://localhost:8080/
    
Caso não estiver com o docker compose instalado em sua maquina, rodar os comandos abaixo

    - docker pull mysql
    - docker pull felipefreitasdocker/app-desafio-postech
    - docker network create network-linguagem
    - docker run --name mysql --network network-linguagem -p 3306:3306 -e MYSQL_USER=felipe -e MYSQL_PASSWORD=123 -e MYSQL_DATABASE=LinguagemDB -d mysql
    - docker run --name minha-api --network network-linguagem -p 8080:8080 -e DATABASE_HOST=mysql felipefreitasdocker/app-desafio-postech:1.0 
