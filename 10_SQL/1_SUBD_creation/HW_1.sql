use gb_mobile_phones;

drop table if exists phones;

create table if not exists phones (
	id serial primary key,
	ProductName varchar (100) not null unique,
	Manufacter varchar (100) not null,
	ProductCount int not null,
	Price int not null
);

insert into phones (ProductName, Manufacter, ProductCount, Price) values 
			('iPhoneX', 'Apple', 20, 80000), 
			('MobileHTC', 'HTC', 1, 40000),
			('SonyPhone', 'Sony', 2, 70000), 
			('OneplusPhone', 'OnePlus', 20, 30000),
			('SamsungPhone', 'Samsung', 5, 90000), 
			('SamsungPhone_2', 'Samsung', 1, 140000);
		
			
		
select * from phones where ProductCount > 2;

select * from phones where Manufacter = 'Samsung';

select * from phones where Price * ProductCount BETWEEN 100000 and 145000;

