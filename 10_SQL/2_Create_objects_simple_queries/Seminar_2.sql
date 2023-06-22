-- 1 id -- ���������� ������������� ������,
-- 2 title -- �������� ������
-- 3 title_eng -- �������� ������ �� ���������� �����
-- 4 year_movie -- ��� ������
-- 5 count_min -- ������������ ������ � �������
-- 6 storyline -- �������� �����, ��������� �������� ������
-- ��� ���� (����� title_eng, count_min � storyline) ����������� ��� ����������. ���� id : ��������� ����, ������� ����������� �������������.

use gb_mobile_phones;

drop table if exists movies;
drop table if exists cinema;

create table if not exists movies (
	id int primary key auto_increment,
	title varchar(50) not null,
	title_eng varchar(50),
	year_movie year not null, 
	count_min int,
	storyline varchar(500)
);

insert into movies (title, title_eng, year_movie, count_min, storyline) values 
("���� ������", "A Beautiful Mind", 2001, 135, "�� ��������� ����������� �� ��������� ������ � ��� ��� ������ �� ����� ����� ���� ����� ���-�������. �������������� �����, �� �� ���� ����� ������� ������ ������������ ������ � ������� ������ ���, ������� ����������� ���� ������ ���������� � ����������� �������� ��� ������������� �����������. ������ ��������� � �� �� ����� ���������� � ������������ ������� � ������ ��� �������� ���� ������, ������� �������������� ��� ��� ����������� �����."),
("������� ����", "Forrest Gump", 1994, 142, "���� �� ���������� ���������, ������� ���� � �� ����� �����, �� ������ � �������� ������ � ������������ ��������� ��������� ������� ����� �������������� �����. � ������ ����������� ������ ������� �� ����������� ���, ��������� ��������� �������� ���, �� � ���� ���������� ���� ������� ������ � ���� ����������� ����������� � ����. ������� ������� ������ ������ ��� ������������ � ��������, �� ������ ������ �� ���������."),
("���� ���������� ������ ���������", NULL, 1998, 128, "�������-������������ �������� �������������� ������ �������, ������� ��������� ��� �������� � ������� ������������ ����� - ������, � �������� �������� ����� ��������. ����-�� � �������� ����� ���� ���������-������������ ���� ���������� ����� � ���������� ��� ���� ������������. �� �� ����� � ��������� ���� �������������� ������� ��������. ������� ������ �������� �� ��������� ����������� � �������� �������..."),
("����� � �������", "Back to the Future", 1985, 116, "��������� ����� � ������� ������ �������, ���������� ��� ������-����������� ����� �������, �������� �� 80-� � ������� 50-�. ��� �� ����������� �� ������ �������� ����������, ��� �����������, � ������-�����������, ������ �������."),
("������������ �����", "Pulp Fiction", 1994, 154, NULL);


-- 1 ������������� �������� movies � cinema.
-- 2 �������� �������� cinema ����� ������� status_active (��� BIT) � ������� genre_id ����� �������� title_eng.
-- 3 ������� ������� status_active �������� cinema.
-- 4 ������� �������� actors �� ���� ������
-- 5 �������� ������� ���� �� ������� genre_id c������� cinema � ��������� ��� �� ������� id �������� genres.
-- 6 �������� �������� genres �� ������ � �������� ���������������� ����.

select * from movies;

rename table movies to cinema;

alter table cinema add column status_active bit;
alter table cinema add genre_id int after title_eng;

alter table cinema drop column status_active;


drop table if exists genres;
drop table if exists actors;

create table if not exists genres (
	id int primary key auto_increment,
	genre_name varchar(30) not null
);

insert into genres (genre_name) values ('Action'), ('Documentation'), ('Comedy');

select * from genres;

alter table cinema add foreign key (genre_id) references genres(id);

select * from cinema;

describe cinema;


alter table cinema drop foreign key `cinema_ibfk_1`;

show create table cinema;

TRUNCATE genres;

select * from genres;

alter table cinema add column category varchar(1);
alter table cinema modify category varchar(15);

select * from cinema;

update cinema set category = '�� ����������';
update cinema set category = '�' where id in (1);
update cinema set category = '�' where id in (2,4);
update cinema set category = '�' where id = 5;

select *, 
case 
	when category = '�' THEN "������������"
	when category = '�' THEN "��������"
	when category = '�' THEN "�������"
	else "������"
end as "���������" from cinema;


# ������ 4 �������� id, �������� ������, �����������������, ��� � ����������� �� ����������������� (� �������������� CASE)

select id, title, count_min, 
case 
	when count_min < 120 then "�����������"
	when count_min > 130 then "�������"
else
	"�������"
end from cinema;

# ������ 5 �������� id, �������� ������, �����������������, ��� � ����������� �� ����������������� (� �������������� IF).

select id, title, count_min, if (count_min < 120, '�����������', if (count_min > 130, '�������', '�������')) as 'type' from cinema;

select null = null;

select null;

select 0 = 0;

