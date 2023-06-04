- Создать два произвольных файла. 

user@gb:~/gb$ touch f; touch s

- Первому присвоить права на чтение и запись для владельца и группы, только на чтение — для всех. Второму присвоить права на чтение и запись только для владельца. Сделать это в численном и символьном виде.

user@gb:~/gb$ sudo chmod ug=rw f; sudo chmod o=r f;

user@gb:~/gb$ sudo chmod a= s; sudo chmod u=rw s;

user@gb:~/gb$ sudo chmod 664 f; sudo chmod 600 s;

- Назначить новых владельца и группу для директории целиком.

user@gb:~$ sudo chown root:adm gb

- создать пользователя используя утилиту useradd и adduser

user@gb:~$ sudo useradd -U user1

user@gb:~$ useradd user2

- удалить пользователя, используя утилиту userdel.

user@gb:~$ sudo userdel test3

- создать группу с использованием утилит groupadd и addgroup;

user@gb:~$ sudo addgroup group1

user@gb:~$ sudo groupadd group2

- попрактиковаться в смене групп у пользователей;
- добавить пользователя в группу, не меняя основной;

user@gb:~$ sudo adduser user1 group1

user@gb:~$ sudo usermod -g group2 user1

- Создать пользователя с правами суперпользователя. Сделать так, чтобы sudo не требовал пароль для выполнения команд.

user@gb:~$ sudo usermod -aG sudo user1

user@gb:~$ sudo visudo

user1 ALL=(ALL) NOPASSWD: ALL

- Используя дополнительные материалы, выдать одному из созданных пользователей право на выполнение ряда команд, требующих прав суперпользователя (команды выбираем на своё усмотрение).

user2 ALL=(ALL) NOPASSWD: /usr/bin/apt, /sbin/reboot

- Создать группу developer и нескольких пользователей, входящих в неё. Создать директорию для совместной работы. Сделать так, чтобы созданные одними пользователями файлы могли изменять другие пользователи этой группы.

user@gb:~$ sudo addgroup developer

user@gb:~$ sudo adduser dev1

user@gb:~$ sudo adduser dev2

user@gb:~$ sudo adduser dev1 developer

user@gb:~$ sudo adduser dev2 developer

user@gb:~/gb$ sudo chown dev1:developer develop

user@gb:~/gb$ sudo chmod 464 develop/

user@gb:~/gb$ sudo chmod g+s develop/

- Создать в директории для совместной работы поддиректорию для обмена файлами, но чтобы удалять файлы могли только их создатели.

user@gb:~/gb/develop$ mkdir obmen

user@gb:~/gb/develop$ sudo chmod +t obmen/

- Создать директорию, в которой есть несколько файлов. Сделать так, чтобы открыть файлы можно было, только зная имя файла, а через ls список файлов посмотреть было нельзя.

user@gb:~/gb/develop/obmen$ cd hid

user@gb:~/gb/develop/obmen/hid$ sudo touch hid

user@gb:~/gb/develop/obmen/hid$ sudo touch hid2\

user@gb:~/gb/develop/obmen$ sudo chmod ugo-rw hid

user@gb:~/gb/develop/obmen$ sudo chmod ugo=x hid


