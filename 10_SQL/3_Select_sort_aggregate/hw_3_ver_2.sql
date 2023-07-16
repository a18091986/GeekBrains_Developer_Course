drop table if exists salespeople;
create table if not exists salespeople (
	snum int,
	sname varchar(20),
	city varchar(20),
	comm double
);

insert into salespeople (snum, sname, city, comm) values 
	(1001, "Peel", "London", .12),
	(1002, "Serres", "San Jose", .13),
	(1004, "Motika", "London", .11),
	(1007, "Rifkin", "Barcelona", .15),
	(1003, "Axelrod", "New York", .10);


drop table if exists customers;
create table if not exists customers (
	cnum int,
	cname varchar(20),
	city varchar(20),
	rating int,
	snum int
);

insert into customers (cnum, cname, city, rating, snum) values 
	(2001, "Hoffman", "London", 100, 1001),
	(2002, "Giovanni", "Rome", 200, 1003),
	(2003, "Liu", "SanJose", 200, 1002),
	(2004, "Grass", "Berlin", 300, 1002),
	(2006, "Clemens", "London", 100, 1001),
	(2008, "Cisneros", "SanJose", 300, 1007),
	(2007, "Pereira", "Rome", 100, 1004);


drop table if exists orders;
create table if not exists orders (
	onum int,
	amt double,
	odate DATE,
	cnum int,
	snum int
);

insert into orders (onum, amt, odate, cnum, snum) values 
	(3001, 18.69, '1990-03-10', 2008, 1007),
	(3003, 767.19, '1990-03-10', 2001, 1001),
	(3002, 1900.10, '1990-03-10', 2007, 1004),
	(3005, 5160.45, '1990-03-10', 2003, 1002),
	(3006, 1098.16, '1990-03-10', 2008, 1007),
	(3009, 1713.23, '1990-04-10', 2002, 1003),
	(3007, 75.75, '1990-04-10', 2004, 1002),
	(3008, 4723.00, '1990-05-10', 2006, 1001),
	(3010, 1309.95, '1990-06-10', 2004, 1002),
	(3011, 9891.88, '1990-06-10', 2006, 1001);



select * from salespeople s;
select * from customers;
select * from orders;


-- task_1

select city, sname, snum, comm from salespeople;

-- task_2

select rating, cname from customers where city = "SanJose";

-- task_3

select DISTINCT snum from orders s ;

-- task_4

select * from customers where cname like 'G%';

-- tsk_5

select * from orders where amt > 1000;

-- task_6

select * from orders where amt = (select min(amt) from orders);

-- task_7

select * from customers where rating > 100 and city != 'Rome';

-- task_8

select * from staff order by salary;
select * from staff order by salary desc;

-- task_9

select * from staff order by salary limit 5;

-- task 10 

select * from staff where speciality in 
	(select speciality 
	from 
	(select speciality, sum(salary) ss from staff group by speciality having ss > 100000) t1) 
	order by speciality;








