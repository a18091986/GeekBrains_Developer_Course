use gb_mobile_phones;

-- Создайте представление, в которое попадет информация о пользователях (имя, фамилия, город и пол), которые не старше 20 лет.

select * from users;
select * from profiles;

create or replace view users_info as  
select 
	firstname, lastname, hometown, gender 
from 
	users u join profiles p on u.id = p.user_id where (year(CURDATE()) -  YEAR(p.birthday)) <= 20;

select * from users_info;

-- Найдите кол-во отправленных сообщений каждым пользователем и выведите ранжированный список пользователей,
-- указав имя и фамилию пользователя, количество отправленных сообщений и место в рейтинге 
-- (первое место у пользователя с максимальным количеством сообщений) . (используйте DENSE_RANK)

with
t1 as 
	(select concat(firstname, ' ', lastname) as fio, 
	count(*) over (partition by concat(firstname, ' ', lastname)) as mes_count
	from users u left join messages m on u.id = m.from_user_id
	)
select 
	*, 
	DENSE_RANK() over (order by mes_count desc) as `d_rank`
from t1
group by fio;

-- Выберите все сообщения, отсортируйте сообщения по возрастанию даты отправления (created_at) 
-- и найдите разницу времени отправления между соседними сообщениями, получившегося списка. (используйте LEAD или LAG)

select *, 
	TIMESTAMPDIFF(SECOND, LAG(created_at, 1, null) over (), created_at) as dd from messages m order by created_at;
