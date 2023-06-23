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
('���������', '1 ��������', '����������', 4),
('���������', '2 ��������', '�������', 4),
('���������', '3 ��������', '������', 5),
('���������', '4 ��������', '�������', 4),
('�����', '1 ��������', '����������', 4),
('�����', '2 ��������', '�������', 3),
('�����', '3 ��������', '������', 5),
('�����', '4 ��������', '�������', 3),
('����', '1 ��������', '������', 4),
('����', '2 ��������', '������', 3),
('����', '3 ��������', '������', 4),
('����', '2 ��������', '����������', 3),
('����', '3 ��������', '����������', 4),
('����', '4 ��������', '������', 5)
	

-- ������� ��� �������
-- ���������� ������ �������
-- ���������� ������ �������
-- ����� ���� ������
-- ���������� ���� ������

select name,
avg(grade) over w,
min(grade) over w,
max(grade) over w,
sum(grade) over w,
count(grade) over w
from academic_record
window w as (partition by name);


-- �������� ���������� �� ������� ���� �� ������ ���������

select *,
lead(grade, 2, null) over w, -- ��������� ��������
lag(grade, 2, null) over w -- ���������� ��������
from academic_record where name = "����" and subject = "������"
window w as ();


-- ��������� ������� (temporary table) 
-- ��� ������� ������������ ��� ���������� �� ���� ������
-- ��������� ����� ������

-- ���������� ��������� ��������� (with) (CTE)

-- ������������� (view)
-- �� ��������� ����� ������
-- �������� � ���� ������, �� ������������ ��� ���������� �� ��



# �������� �������������, � ������� ����� ���������� ��� ���������, � ������� �������� ������� ������������ � id = 1;

select * from users;
select * from communities c ;
SELECT * from messages m ;
select * FROM users_communities uc;

create or REPLACE view messages_with_first_user as 
select * from messages m where from_user_id = 1 or to_user_id = 1;

select * from messages_with_first_user;

# ������� ������ ������������ � id = 1 � ��������� ������� � ������������� (� ������� ���)


CREATE or replace view friends_of_first_user as
with 
	f1 as (select initiator_user_id from friend_requests fr where target_user_id = 1 and status = 'approved'),
	f2 as (select target_user_id from friend_requests fr where initiator_user_id = 1 and status = 'approved')
select f1.initiator_user_id from f1 union select f2.target_user_id from f2;

select * from friends_of_first_user;



	