use gb_mobile_phones;

-- Создайте таблицу users_old, аналогичную таблице users. Создайте
-- процедуру, с помощью которой можно переместить любого (одного)
-- пользователя из таблицы users в таблицу users_old. (использование
-- транзакции с выбором commit или rollback – обязательно).

select * from users;
select firstname, lastname, email from users where id = 3;
insert into old_users (firstname, lastname, email) select firstname, lastname, email from users where id = 3;

DROP TABLE IF EXISTS old_users;
CREATE TABLE old_users (
	id SERIAL PRIMARY KEY, -- SERIAL = BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    email VARCHAR(120) UNIQUE
);

drop procedure if exists move_user;

delimiter $$
create procedure move_user(IN user_idx int)
BEGIN
start transaction;
insert into old_users (firstname, lastname, email) select firstname, lastname, email from users where id = user_idx;
delete from users where id = user_idx;
if row_count() = 1 then
    commit;
    select 'OK';
else
    rollback;
    select 'ERROR';
end if;
END $$
delimiter ;

call move_user (4);

select * from old_users;

-- Создайте функцию hello(), которая будет возвращать приветствие, в
-- зависимости от текущего времени суток. С 6:00 до 12:00 функция должна
-- возвращать фразу "Доброе утро", с 12:00 до 18:00 функция должна
-- возвращать фразу "Добрый день", с 18:00 до 00:00 — "Добрый вечер", с
-- 00:00 до 6:00 — "Доброй ночи".

-- select  
-- case 
-- 	when CURRENT_TIME() between '06:00:00' and '12:00:00' then 'Доброе утро'
-- 	when CURRENT_TIME() between '12:00:00' and '18:00:00' then 'Добрый день'
-- 	when CURRENT_TIME() between '18:00:00' and '00:00:00' then 'Добрый вечер'
-- 	else 'Доброй ночи'
-- end as hello;

drop function if exists hello;
delimiter $$
CREATE function hello(t time)
	returns varchar(100) DETERMINISTIC
begin
	declare x varchar(100);
set x = 
case
	when t between '06:00:00' and '12:00:00' then 'Доброе утро'
	when t between '12:00:00' and '18:00:00' then 'Добрый день'
	when t between '18:00:00' and '23:59:59' then 'Добрый вечер'
	else 'Доброй ночи'
end;
return x;
end $$
delimiter ;

select hello(CURRENT_TIME());

