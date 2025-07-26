FROM grafana/promtail:latest

COPY config.yaml /etc/promtail/config.yml

ENTRYPOINT ["/usr/bin/promtail", "-config.file=/etc/promtail/config.yml"]
