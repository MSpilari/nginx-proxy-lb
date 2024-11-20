# Nginx Proxy Load Balancer

Este repositório contém uma configuração prática para implementar um balanceador de carga utilizando o **NGINX**. Ele é projetado para distribuir o tráfego de forma eficiente entre múltiplas instâncias de backend, garantindo alta disponibilidade e desempenho para aplicações web.

---

## 📋 **Recursos**

- Configuração de proxy reverso utilizando **NGINX**.
- Balanceamento de carga com suporte a:
  - **Round Robin** (distribuição padrão).
  - Outras estratégias configuráveis.
- Suporte para redirecionamento de tráfego HTTP para HTTPS.
- Configuração personalizável para tempo de timeout e failover.
- Logging centralizado de requisições e erros.
- Pronto para ambientes de produção e desenvolvimento.

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

### 3. Configurar os Backends

Edite o arquivo `nginx.conf` na seção `upstream backend` para incluir as instâncias de backend:

```nginx
upstream backend {
    server backend1.example.com; # Substitua pelo endereço do servidor 1
    server backend2.example.com; # Substitua pelo endereço do servidor 2
}
```

### 4. Subir o Serviço com Docker Compose

Execute o comando:

```bash
docker-compose up -d
```

Isso iniciará um container com o NGINX configurado como proxy reverso e balanceador de carga.

### 5. Acessar a Aplicação

Acesse o balanceador de carga através da URL configurada no container (por exemplo, `http://localhost`).

---

## ⚙️ **Configuração**

### Personalização no `nginx.conf`

O arquivo `nginx.conf` permite ajustes como:

- **Política de balanceamento de carga**:

  - Padrão: Round Robin.
  - Pode ser alterado para `least_conn` (menor conexão ativa) ou `ip_hash` (persistência por IP).

  Exemplo:

  ```nginx
  upstream backend {
      least_conn;
      server backend1.example.com;
      server backend2.example.com;
  }
  ```

- **Redirecionamento HTTP para HTTPS**:
  Habilite adicionando a seguinte configuração no bloco `server`:

  ```nginx
  server {
      listen 80;
      server_name example.com;
      return 301 https://$host$request_uri;
  }
  ```

- **Timeouts**:
  Ajuste o tempo de espera por resposta de backends:
  ```nginx
  proxy_connect_timeout 30s;
  proxy_read_timeout 30s;
  ```

---

## 📂 **Estrutura do Projeto**

```
nginx-proxy-lb/
│
├── docker-compose.yml   # Configuração Docker Compose
├── Dockerfile           # Dockerfile os servidores Spring Boot
├── nginx                # Diretório do NGINX
│     ├── nginx.conf     # Arquivo de configuração principal do NGINX
│     ├── Dockerfile     # Dockerfile do NGINX
└── README.md            # Este arquivo
```

---

## 🐳 **Detalhes do Docker Compose**

- **Serviço NGINX**:

  - Imagem base: `nginx:alpine`.
  - Mapeamento de portas: `8080:8080` (HTTP).

- **Logs**:
  - Os logs do NGINX podem ser acessados diretamente no container:
    ```bash
    docker logs <container-id>
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
