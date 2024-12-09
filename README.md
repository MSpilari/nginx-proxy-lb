# 🇺🇸 Nginx Proxy Load Balancer

This repository provides a practical setup for implementing a load balancer, a rate limiter using **NGINX**, as well as a circuit breaker and monitoring with Spring Actuator, Prometheus, and Grafana.

---

## 🚀 **How to Use**

### 1. Prerequisites

- **Docker** and **Docker Compose** installed.
- Access to backend instances (applications that will receive balanced traffic).

### 2. Clone the Repository

```bash
git clone https://github.com/MSpilari/nginx-proxy-lb.git
cd nginx-proxy-lb
```

### 3. Start the Service with Docker Compose

Run the command:

```bash
docker-compose up -d
```

This will start:

- A container with NGINX configured as a reverse proxy, load balancer, and rate limiter.
- Two containers running Spring Boot, simulating two backend servers.
- A container with Prometheus.
- A container with Grafana.

### 4. Access the Application

Access the application through the URL configured in the container (e.g., `http://localhost:8080/hello-world`).
Access the Grafana dashboard, already consuming data from Prometheus, via `http://localhost:3000/`.

---

## 📂 **Project Structure**

```
spring_app_server/
├── .mvn/
│   └── [Maven Wrapper files]
├── nginx/
│   └── [Nginx-related configurations]
├── prometheus/
│   └── [Prometheus configuration files]
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── [Java source code files]
│   │   ├── resources/
│   │       └── [Spring Boot resource files like application.properties or application.yml]
│   └── test/
│       └── [Unit tests and integration tests]
├── target/
│   └── [Build output directory]
├── .gitattributes
├── .gitignore
├── docker-compose.yaml
├── Dockerfile
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 🛠️ **How to Contribute**

1. Fork the project.
2. Create a branch for your feature/fix: `git checkout -b my-feature`.
3. Make the changes and commit them: `git commit -m "My new feature"`.
4. Push it to your fork: `git push origin my-feature`.
5. Open a Pull Request.

---

## 📄 **License**

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and share it.

---

## 🧑‍💻 **Author**

- **MSpilari**
  - [GitHub](https://github.com/MSpilari)

If you have any questions or suggestions, feel free to open an issue! 😊

---

# 🇧🇷 Nginx Proxy Load Balancer

Este repositório contém uma configuração prática para implementar um balanceador de carga, um rate limiter utilizando o **NGINX**, além de um circuit breaker e monitoramento com Spring Actuator, Prometheus e Grafana.

---

## 🚀 **Como Usar**

### 1. Pré-requisitos

- **Docker** e **Docker Compose** instalados.
- Acesso às instâncias de backend (aplicações que receberão o tráfego balanceado).

### 2. Clonar o Repositório

```bash
git clone https://github.com/MSpilari/nginx-proxy-lb.git
cd nginx-proxy-lb
```

### 3. Subir o Serviço com Docker Compose

Execute o comando:

```bash
docker-compose up -d
```

Isso iniciará um contêiner com o NGINX configurado como proxy reverso, balanceador de carga, rate limiter.
Dois contêineres com Sprig boot, rodando uma aplicação simulando dois servidores.
Um contêiner com Prometheus.
Um contêiner com Grafana.

### 5. Acessar a Aplicação

Acesse a aplicação através da URL configurada no contêiner (por exemplo, `http://localhost:8080/hello-world`).
Acesso o dashboard do Grafana, já consumindo dados do Prometheus através do URL `http://localhost:3000/`

---

## 📂 **Estrutura do Projeto**

```
spring_app_server/
├── .mvn/
│   └── [Maven Wrapper files]
├── nginx/
│   └── [Nginx-related configurations]
├── prometheus/
│   └── [Prometheus configuration files]
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── [Java source code files]
│   │   ├── resources/
│   │       └── [Spring Boot resource files like application.properties or application.yml]
│   └── test/
│       └── [Unit tests and integration tests]
├── target/
│   └── [Build output directory]
├── .gitattributes
├── .gitignore
├── docker-compose.yaml
├── Dockerfile
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 🛠️ **Como Contribuir**

1. Faça um fork do projeto.
2. Crie uma branch para a sua funcionalidade/correção: `git checkout -b minha-feature`.
3. Realize as alterações e comite: `git commit -m "Minha nova feature"`.
4. Envie para o seu fork: `git push origin minha-feature`.
5. Abra um Pull Request.

---

## 📄 **Licença**

Este projeto está licenciado sob a [MIT License](LICENSE). Sinta-se à vontade para usar, modificar e compartilhar.

---

## 🧑‍💻 **Autor**

- **MSpilari**
  - [GitHub](https://github.com/MSpilari)

Se tiver dúvidas ou sugestões, sinta-se à vontade para abrir uma issue! 😊
