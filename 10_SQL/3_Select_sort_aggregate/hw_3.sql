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
	('����', '������', '���������', 40, 100000, 60), 
	('����', '������', '���������', 8, 70000, 30),
	('����', '������', '�������', 2, 70000, 25),
	('����', '�����', '�������', 12, 50000, 35),
	('����', '������', '�������', 40, 30000, 59),
	('����', '������', '�������', 20, 25000, 40),
	('����', '�������', '�������', 10, 20000, 35),
	('�����', '�������', '�������', 8, 19000, 28),
	('����', '�����', '�������', 5, 15000, 25),
	('������', '��������', '�������', 2, 11000, 22),
	('����', '������', '�������', 3, 12000, 24),
	('�������', '�������', '�������', 10, 10000, 49)

	
-- 1 ������������ ������ �� ���� ���������� ����� (salary) � �������: ��������; �����������

select * from staff order by salary;
select * from staff order by salary desc;

-- 2 �������� 5 ������������ ���������� ���� (saraly)

select * from staff order by salary desc limit 5;

-- 3 ���������� ��������� �������� (salary) �� ������ ������������� (��st)

select 
	post, sum(salary) as sum_salary 
from staff
group by
	post
order by sum_salary desc;
	

-- 4 ������� ���-�� ����������� � �������������� (post) �������� � �������� �� 24 �� 49 ��� ������������.

select count(*) from staff where post = "�������" and age between 24 and 49;

-- 5 ������� ���������� ��������������

select count(distinct post) from staff;

-- 6 �������� �������������, � ������� ������� ������� ����������� ������ 40 ���

select 
	post, avg(age) a_a  
from 
	staff 
group by 
	post 
having 
	a_a < 40;


