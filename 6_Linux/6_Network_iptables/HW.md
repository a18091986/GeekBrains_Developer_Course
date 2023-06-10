.1. * Настроить статическую конфигурацию (без DHCP) в Ubuntu через ip и netplan. Настроить IP, маршрут по умолчанию и DNS-сервера (1.1.1.1 и 8.8.8.8). Проверить работоспособность сети.
# This is the network config written by 'subiquity'
network:
  ethernets:
    ens33:
      addresses:
      - 192.168.2.23/24
      nameservers:
        addresses:
        - 8.8.8.8
        - 8.8.4.4
        search: []
      routes:
      - to: default
        via: 192.168.2.1
  version: 2

2. Настроить правила iptables для доступности сервисов на TCP-портах 22, 80 и 443. Также сервер должен иметь возможность устанавливать подключения к серверу обновлений. Остальные подключения запретить.
3. Запретить любой входящий трафик с IP 3.4.5.6.
4. Запросы на порт 8090 перенаправлять на порт 80 (на этом же сервере).
5. Разрешить подключение по SSH только из сети 192.168.0.0/24. 

-P INPUT DROP
-P FORWARD ACCEPT
-P OUTPUT DROP
-A INPUT -s 192.168.2.0/24 -p tcp -m tcp --dport 22 -j ACCEPT
-A INPUT -p tcp -m tcp --dport 22 -j DROP
-A INPUT -s 3.4.5.6/32 -j DROP
-A INPUT -p tcp -m tcp --dport 80 -j ACCEPT
-A INPUT -p tcp -m tcp --dport 22 -j ACCEPT
-A INPUT -p tcp -m tcp --dport 443 -j ACCEPT
-A INPUT -p tcp -m tcp --dport 2020 -j ACCEPT
-A INPUT -p tcp -j DROP
-A OUTPUT -p tcp -m tcp --dport 2020 -j ACCEPT
-A OUTPUT -d 192.168.2.0/24 -j ACCEPT