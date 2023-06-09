1. Подключить дополнительный репозиторий на выбор: Docker, Nginx, Oracle MySQL. Установить любой пакет из этого репозитория.

root@gb:/home# curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu focal stable"

sudo apt install docker-ce

2. Установить и удалить deb-пакет с помощью dpkg.

root@gb:/home# dpkg -i libc6 --auto-deconfigure
root@gb:/home# dpkg -i exa.deb

3. Установить и удалить snap-пакет.

root@gb:/home# sudo snap install gimp
root@gb:/home# sudo snap remove gimp

4. Добавить задачу для выполнения каждые 3 минуты (создание директории, запись в файл).

crontab -e
*/3 * * * * mkdir /home/cron_test;  echo "123" >> /home/cron_test/test 

5. * Подключить PPA-репозиторий на выбор. Установить из него пакет. Удалить PPA из системы.

sudo add-apt-repository ppa:shutter/ppa
sudo apt-get update 
sudo apt-get install shutter
udo add-apt-repository –remove ppa:shutter/ppa


6. * Создать задачу резервного копирования (tar) домашнего каталога пользователя. Реализовать с использованием пользовательских crontab-файлов.

crontab -e
*/3 * * * * tar -cvzf /tmp/files.tar.gz /home