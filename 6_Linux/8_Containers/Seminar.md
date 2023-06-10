user@gb:~$ sudo apt-get install ca-certificates curl gnupg

sudo apt install apt-transport-https ca-certificates curl software-properties-common

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu focal stable"

user@gb:~$ sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

user@gb:~$ docker run -d --restart always --name nginx1 -p 80:80 -v /var/www/html:/usr/share/nginx/html nginx
