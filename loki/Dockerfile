FROM grafana/loki:latest

COPY config.yaml /etc/loki/config.yml

ENTRYPOINT ["/usr/bin/loki", "--config.file=/etc/loki/config.yml", "--config.expand-env=true"]
