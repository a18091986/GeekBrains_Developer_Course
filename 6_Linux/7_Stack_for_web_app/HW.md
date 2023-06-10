1 Установить Nginx и настроить его на работу с PHP-FPM.

user@gb:~$ sudo apt install nginx

user@gb:~$ sudo nginx -t

user@gb:~$ sudo apt install php-fpm


user@gb:~$ sudo nano /etc/nginx/sites-available/default 

        location ~ \.php$ {
                include snippets/fastcgi-php.conf;

                # With php-fpm (or other unix sockets):
                fastcgi_pass unix:/var/run/php/php8.1-fpm.sock;
                # With php-cgi (or other tcp sockets):
                # fastcgi_pass 127.0.0.1:9000;
        }


user@gb:~$ sudo nano /var/www/html/index.php


-- <?php
phpinfo();

2 Установить Apache. Настроить обработку PHP. Добиться одновременной работы с Nginx.

user@gb:~$ sudo apt install apache2  libapache2-mod-php -y

user@gb:~$ sudo nano /etc/apache2/sites-available/000-default.conf

<VirtualHost *:8080>

user@gb:~$ user@nano /etc/apache2/sites-available/000-default.conf/ports.conf

Listen 8080

user@gb:~$ user@systemctl restart apache2.service

3 Настроить схему обратного прокси для Nginx (динамика - на Apache).

user@gb:~$ sudo a2enmod actions fcgid alias proxy_fcgi

user@gb:~$ sudo systemctl restart apache2

user@gb:~$ sudo nano /etc/apache2/sites-available/000-default.conf

        <FilesMatch \.php$>
           SetHandler "proxy:unix:/var/run/php/php7.4-fpm.sock|fcgi://localhost"
        </FilesMatch>
    </VirtualHost>

user@gb:/var/log/apache2$ sudo nano /etc/nginx/sites-available/default

    # Virtual Host configuration for example.com
    #
    # You can move that to a different file under sites-available/ and symlink that
    # to sites-enabled/ to enable it.
    #
    #server {
    #       listen 80;
    #       listen [::]:80;
    #
    #       server_name example.com;
    #
    #       root /var/www/example.com;
    #       index index.html;
    #
    #       location / {
    #               try_files $uri $uri/ =404;
    #       }
    #}

4 Установить MySQL. Создать новую базу данных и таблицу в ней.

user@gb:/var/log/apache2$ sudo apt install mysql-client mysql-server -y

mysql> create database if not exists test_db;

mysql> create table if not exists test_table ( id int auto_increment primary key, test text);

mysql> insert into test_table (test) values ('test_test');

5 * Установить пакет phpmyadmin и запустить его веб-интерфейс для управления MySQL.

sudo apt install phpmyadmin

user@gb:/var/log/apache2$ sudo cp /etc/phpmyadmin/apache.conf /etc/apache2/conf-available/phpmyadmin.conf

user@gb:/var/log/apache2$ sudo a2enconf phpmyadmin

user@gb:/var/log/apache2$ sudo systemctl restart apache2.service 

6 * Настроить схему балансировки трафика между несколькими серверами Apache на стороне Nginx с помощью модуля ngx_http_upstream_module.

nano /etc/nginx/sites-available/default

upstream backend  {
server backend1.example.com weight=1;
server backend2.example.com weight=2;
server backend3.example.com weight=4;
}

