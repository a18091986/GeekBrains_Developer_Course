
-- create
CREATE TABLE STUDENTS (
  stId INTEGER PRIMARY KEY AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  age INTEGER NOT NULL,
  profession varchar(100) not null default 'absence',
  address  varchar(300) not null default 'absence'
);

-- insert
INSERT INTO STUDENTS (name, age) VALUES ('Clark', 20);
INSERT INTO STUDENTS (name, age, profession) VALUES ('A', 20, 'it');
INSERT INTO STUDENTS (name, age, profession, address) VALUES ('B', 22, 'develop', 'Moscow');


-- fetch 
SELECT * FROM STUDENTS;
