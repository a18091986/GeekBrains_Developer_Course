-- »спользу€ операторы €зыка SQL, создайте табличку УsalesФ. «аполните ее данными

use gb_mobile_phones;
drop table if exists sales;
create table if not exists sales (
	id serial primary key,
	order_date date default (current_date),
	count_product int not null
);

insert into sales (order_date, count_product) values ('2022-01-01', 156), ('2022-01-02', 180), ('2022-01-03', 21), ('2022-01-04', 124), ('2022-01-05', 341);

select * from sales;

-- —группируйте значений количества в 3 сегмента Ч меньше 100, 100-300 и больше 300.

select *, if (count_product < 100, 'low', if (count_product <= 300, 'middle', 'big')) as `type` from sales;


-- —оздайте таблицу УordersФ, заполните ее значени€ми. ѕокажите УполныйФ статус заказа, использу€ оператор CASE

drop table if exists orders;
create table if not exists orders (
	id serial primary key,
	employee_id varchar(3),
	amount float(5,2), 
	order_status varchar(10)
);

insert into orders (employee_id, amount, order_status) values
	('e03', 15.00, 'open'), ('e01', 25.5, 'open'), ('e05', 100.7, 'closed'), ('e02', 22.18, 'open'), ('e04', 9.5, 'cancelled');


select *, CASE 
	when order_status = 'open' then 'order is in open state'
	when order_status = 'closed' then 'order is closed'
	else 'order is cancelled'
END as full_order_status from orders;


-- „ем NULL отличаетс€ от 0?

# NULL - говорит об отсутсвии значени€. NULL нельз€ сравнивать: 
# select null = null -> NULL 
# select 0 = 0 -> 1