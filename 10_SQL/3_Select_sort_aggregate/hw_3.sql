use gb_mobile_phones;
drop table if exists staff;
create table if not exists staff (
	id serial primary key,
	first_name varchar(10),
	last_name varchar(10),
	post varchar(10),
	seniority int,
	salary int,
	age int
);


insert into staff (first_name, last_name, post, seniority, salary, age) values
	('Вася', 'Петров', 'Начальник', 40, 100000, 60), 
	('Петр', 'Власов', 'Начальник', 8, 70000, 30),
	('Катя', 'Катина', 'Инженер', 2, 70000, 25),
	('Саша', 'Сасин', 'Инженер', 12, 50000, 35),
	('Иван', 'Иванов', 'Рабочий', 40, 30000, 59),
	('Петр', 'Петров', 'Рабочий', 20, 25000, 40),
	('Сидр', 'Сидоров', 'Рабочий', 10, 20000, 35),
	('Антон', 'Антонов', 'Рабочий', 8, 19000, 28),
	('Юрий', 'Юрков', 'Рабочий', 5, 15000, 25),
	('Максим', 'Максимов', 'Рабочий', 2, 11000, 22),
	('Юрий', 'Галкин', 'Рабочий', 3, 12000, 24),
	('Людмила', 'Маркина', 'Уборщик', 10, 10000, 49)

	
-- 1 Отсортируйте данные по полю заработная плата (salary) в порядке: убывания; возрастания

select * from staff order by salary;
select * from staff order by salary desc;

-- 2 Выведите 5 максимальных заработных плат (saraly)

select * from staff order by salary desc limit 5;

-- 3 Посчитайте суммарную зарплату (salary) по каждой специальности (роst)

select 
	post, sum(salary) as sum_salary 
from staff
group by
	post
order by sum_salary desc;
	

-- 4 Найдите кол-во сотрудников с специальностью (post) «Рабочий» в возрасте от 24 до 49 лет включительно.

select count(*) from staff where post = "Рабочий" and age between 24 and 49;

-- 5 Найдите количество специальностей

select count(distinct post) from staff;

-- 6 Выведите специальности, у которых средний возраст сотрудников меньше 40 лет

select 
	post, avg(age) a_a  
from 
	staff 
group by 
	post 
having 
	a_a < 40;


