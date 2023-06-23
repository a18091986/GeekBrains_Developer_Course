use gb_mobile_phones;
drop table if exists academic_record;

create table academic_record(
	id int auto_increment primary key,
	name varchar(30),
	quartal varchar(30),
	subject varchar(30),
	grade int
);


insert into academic_record (name, quartal, subject, grade) values
('Александр', '1 четверть', 'математика', 4),
('Александр', '2 четверть', 'русский', 4),
('Александр', '3 четверть', 'физика', 5),
('Александр', '4 четверть', 'история', 4),
('Антон', '1 четверть', 'математика', 4),
('Антон', '2 четверть', 'русский', 3),
('Антон', '3 четверть', 'физика', 5),
('Антон', '4 четверть', 'история', 3),
('Петя', '1 четверть', 'физика', 4),
('Петя', '2 четверть', 'физика', 3),
('Петя', '3 четверть', 'физика', 4),
('Петя', '2 четверть', 'математика', 3),
('Петя', '3 четверть', 'математика', 4),
('Петя', '4 четверть', 'физика', 5)
	

-- средний бал ученика
-- наименьшую оценку ученика
-- наибольшую оценку ученика
-- сумму всех оценок
-- количество всех оценко

select name,
avg(grade) over w,
min(grade) over w,
max(grade) over w,
sum(grade) over w,
count(grade) over w
from academic_record
window w as (partition by name);


-- получить информацию об оценках Пети по физике четвертям

select *,
lead(grade, 2, null) over w, -- следующее значение
lag(grade, 2, null) over w -- предыдущее значение
from academic_record where name = "Петя" and subject = "физика"
window w as ();


-- временная таблица (temporary table) 
-- эта таблица уничтожается при отключении от базы данных
-- создается копия данных

-- обобщенное табличное выражение (with) (CTE)

-- представление (view)
-- не создается копии данных
-- хранится в базе данных, не уничтожается при отключении от БД



# создайте представление, в котором будут выводиться все сообщения, в которых принимал участие пользователь с id = 1;

select * from users;
select * from communities c ;
SELECT * from messages m ;
select * FROM users_communities uc;

create or REPLACE view messages_with_first_user as 
select * from messages m where from_user_id = 1 or to_user_id = 1;

select * from messages_with_first_user;

# найдите друзей пользователя с id = 1 и поместите выборку в представление (с помощью СТЕ)


CREATE or replace view friends_of_first_user as
with 
	f1 as (select initiator_user_id from friend_requests fr where target_user_id = 1 and status = 'approved'),
	f2 as (select target_user_id from friend_requests fr where initiator_user_id = 1 and status = 'approved')
select f1.initiator_user_id from f1 union select f2.target_user_id from f2;

select * from friends_of_first_user;



	