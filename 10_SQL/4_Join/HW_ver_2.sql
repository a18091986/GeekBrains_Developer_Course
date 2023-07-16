select * from AUTO;

-- task_1

SELECT color, mark, count(*) cnt 
FROM AUTO 
WHERE mark IN ('BMW','LADA') 
GROUP BY color, mark;

select 'BMW', COLOR, count(*) cnt from AUTO where MARK = "BMW" group by COLOR
union
select 'LADA', COLOR, count(*) cnt from AUTO where MARK = "LADA" group by COLOR;


-- task_2

SELECT DISTINCT mark, (select count(*) FROM AUTO t1 WHERE t1.mark != t.mark) cnt FROM AUTO t;

-- task_3

create table test_a (id INT, data varchar(1));
create table test_b (id INT);
insert into test_a(id, data) values
(10, 'A'),
(20, 'A'),
(30, 'F'),
(40, 'D'),
(50, 'C');
insert into test_b(id) values
(10),
(30),
(50);

select * from test_a left join test_b on test_a.id = test_b.id where test_b.id is NULL;

select * from test_a left join test_b using (id) where test_b.id is NULL;
