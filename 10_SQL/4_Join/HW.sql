use gb_mobile_phones;
CREATE TABLE `shops` (
	`id` INT,
    `shopname` VARCHAR (100),
    PRIMARY KEY (id)
);

CREATE TABLE `cats` (
	`name` VARCHAR (100),
    `id` INT,
    PRIMARY KEY (id),
    shops_id INT,
    CONSTRAINT fk_cats_shops_id FOREIGN KEY (shops_id)
        REFERENCES `shops` (id)
);

INSERT INTO `shops`
VALUES 
		(1, "������ ����"),
        (2, "������ ���"),
        (3, "��������"),
        (4, "����� � ������");

INSERT INTO `cats`
VALUES 
		("Murzik",1,1),
        ("Nemo",2,2),
        ("Vicont",3,1),
        ("Zuza",4,3);


-- ��������� JOIN-�, ��������� ��������� ��������:
-- ������� ���� ������� �� ��������� �� id (������� ���������� shops.id = cats.shops_id)

select * from cats;

select * from shops;

select name from 
cats join shops on shops.id = cats.shops_id;

-- ������� ��������, � ������� ��������� ��� �Murzik� (���������� ��������� 2 ���������)

select shopname from 
shops left join cats on shops.id = cats.shops_id
where name = "Murzik";

SELECT shopname from shops where id in (select shops_id from cats where name = "Murzik");


-- ������� ��������, � ������� �� ��������� ���� �Murzik� � �Zuza�

select shopname from shops where id not in 
(select shops_id from cats where name in ('Murzik', 'Zuza'));


DROP TABLE IF EXISTS Analysis;

CREATE TABLE Analysis
(
	an_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	an_name varchar(50),
	an_cost INT,
	an_price INT,
	an_group INT
);

INSERT INTO Analysis (an_name, an_cost, an_price, an_group)
VALUES 
	('����� ������ �����', 30, 50, 1),
	('�������� �����', 150, 210, 1),
	('������ ����� �� �������', 110, 130, 1),
	('����� ������ ����', 25, 40, 2),
	('����� ������ ����', 35, 50, 2),
	('����� ������ ����', 25, 40, 2),
	('���� �� COVID-19', 160, 210, 3);

DROP TABLE IF EXISTS GroupsAn;

CREATE TABLE GroupsAn
(
	gr_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	gr_name varchar(50),
	gr_temp FLOAT(5,1),
	FOREIGN KEY (gr_id) REFERENCES Analysis (an_id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO GroupsAn (gr_name, gr_temp)
VALUES 
	('������� �����', -12.2),
	('����� �������', -20.0),
	('���-�����������', -20.5);

SELECT * FROM groupsan;

DROP TABLE IF EXISTS Orders;
CREATE TABLE Orders
(
	ord_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	ord_datetime DATETIME,	-- 'YYYY-MM-DD hh:mm:ss'
	ord_an INT,
	FOREIGN KEY (ord_an) REFERENCES Analysis (an_id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Orders (ord_datetime, ord_an)
VALUES 
	('2020-02-04 07:15:25', 1),
	('2020-02-04 07:20:50', 2),
	('2020-02-04 07:30:04', 1),
	('2020-02-04 07:40:57', 1),
	('2020-02-05 07:05:14', 1),
	('2020-02-05 07:15:15', 3),
	('2020-02-05 07:30:49', 3),
	('2020-02-06 07:10:10', 2),
	('2020-02-06 07:20:38', 2),
	('2020-02-07 07:05:09', 1),
	('2020-02-07 07:10:54', 1),
	('2020-02-07 07:15:25', 1),
	('2020-02-08 07:05:44', 1),
	('2020-02-08 07:10:39', 2),
	('2020-02-08 07:20:36', 1),
	('2020-02-08 07:25:26', 3),
	('2020-02-09 07:05:06', 1),
	('2020-02-09 07:10:34', 1),
	('2020-02-09 07:20:19', 2),
	('2020-02-10 07:05:55', 3),
	('2020-02-10 07:15:08', 3),
	('2020-02-10 07:25:07', 1),
	('2020-02-11 07:05:33', 1),
	('2020-02-11 07:10:32', 2),
	('2020-02-11 07:20:17', 3),
	('2020-02-12 07:05:36', 1),
	('2020-02-12 07:10:54', 2),
	('2020-02-12 07:20:19', 3),
	('2020-02-12 07:35:38', 1);



-- ������� �������� � ���� ��� ���� ��������, ������� ����������� 5 ������� 2020 � ��� ��������� ������.

-- ���� ������� �������� Analysis:
-- an_id � ID �������;
-- an_name � �������� �������;
-- an_cost � ������������� �������;
-- an_price � ��������� ���� �������;
-- an_group � ������ ��������.

-- ���� ������� ����� �������� Groups:
-- gr_id � ID ������;
-- gr_name � �������� ������;
-- gr_temp � ������������� ����� ��������.

-- ���� ������� ������� Orders:
-- ord_id � ID ������;
-- ord_datetime � ���� � ����� ������;
-- ord_an � ID �������.

select an_name, an_price from Analysis where an_id in 
(select ord_an from Orders where date(ord_datetime) between '2020-02-05' and '2020-02-12');
