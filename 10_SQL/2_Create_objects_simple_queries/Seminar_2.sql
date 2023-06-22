-- 1 id -- уникальный идентификатор фильма,
-- 2 title -- название фильма
-- 3 title_eng -- название фильма на английском языке
-- 4 year_movie -- год выхода
-- 5 count_min -- длительность фильма в минутах
-- 6 storyline -- сюжетная линия, небольшое описание фильма
-- Все поля (кроме title_eng, count_min и storyline) обязательны для заполнения. Поле id : первичный ключ, который заполняется автоматически.

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
("Игры разума", "A Beautiful Mind", 2001, 135, "От всемирной известности до греховных глубин — все это познал на своей шкуре Джон Форбс Нэш-младший. Математический гений, он на заре своей карьеры сделал титаническую работу в области теории игр, которая перевернула этот раздел математики и практически принесла ему международную известность. Однако буквально в то же время заносчивый и пользующийся успехом у женщин Нэш получает удар судьбы, который переворачивает уже его собственную жизнь."),
("Форрест Гамп", "Forrest Gump", 1994, 142, "Сидя на автобусной остановке, Форрест Гамп — не очень умный, но добрый и открытый парень — рассказывает случайным встречным историю своей необыкновенной жизни. С самого малолетства парень страдал от заболевания ног, соседские мальчишки дразнили его, но в один прекрасный день Форрест открыл в себе невероятные способности к бегу. Подруга детства Дженни всегда его поддерживала и защищала, но вскоре дороги их разошлись."),
("Иван Васильевич меняет профессию", NULL, 1998, 128, "Инженер-изобретатель Тимофеев сконструировал машину времени, которая соединила его квартиру с далеким шестнадцатым веком - точнее, с палатами государя Ивана Грозного. Туда-то и попадают тезка царя пенсионер-общественник Иван Васильевич Бунша и квартирный вор Жорж Милославский. На их место в двадцатом веке «переселяется» великий государь. Поломка машины приводит ко множеству неожиданных и забавных событий..."),
("Назад в будущее", "Back to the Future", 1985, 116, "Подросток Марти с помощью машины времени, сооружённой его другом-профессором доком Брауном, попадает из 80-х в далекие 50-е. Там он встречается со своими будущими родителями, ещё подростками, и другом-профессором, совсем молодым."),
("Криминальное чтиво", "Pulp Fiction", 1994, 154, NULL);


-- 1 Переименовать сущность movies в cinema.
-- 2 Добавить сущности cinema новый атрибут status_active (тип BIT) и атрибут genre_id после атрибута title_eng.
-- 3 Удалить атрибут status_active сущности cinema.
-- 4 Удалить сущность actors из базы данных
-- 5 Добавить внешний ключ на атрибут genre_id cущности cinema и направить его на атрибут id сущности genres.
-- 6 Очистить сущность genres от данных и обнулить автоинкрементное поле.

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

update cinema set category = 'Не определено';
update cinema set category = 'П' where id in (1);
update cinema set category = 'В' where id in (2,4);
update cinema set category = 'Д' where id = 5;

select *, 
case 
	when category = 'П' THEN "Подростковая"
	when category = 'В' THEN "Взрослая"
	when category = 'Д' THEN "Детская"
	else "Другая"
end as "категория" from cinema;


# Задача 4 Выведите id, название фильма, продолжительность, тип в зависимости от продолжительности (с использованием CASE)

select id, title, count_min, 
case 
	when count_min < 120 then "стандартный"
	when count_min > 130 then "длинный"
else
	"средний"
end from cinema;

# Задача 5 Выведите id, название фильма, продолжительность, тип в зависимости от продолжительности (с использованием IF).

select id, title, count_min, if (count_min < 120, 'стандартный', if (count_min > 130, 'длинный', 'средний')) as 'type' from cinema;

select null = null;

select null;

select 0 = 0;

