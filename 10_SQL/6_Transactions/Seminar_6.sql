use gb_mobile_phones;

# создать процедуру, которая выберет для 1 пользователя 5 пользователей в случайной комбинации, которые удовлетворяют хотя бы одному критерию:
-- из одного города
-- состоят в одной группе
-- друзья друзей

select * from users;
select * from profiles;
select * from friend_requests fr;
select * from users_communities uc;



select * from friends_1;

delimiter $$
create procedure find_five_random_users_by_criteria(IN user_idx int)
BEGIN
with 
	cte1 as (select initiator_user_id from friend_requests fr where target_user_id in (select initiator_user_id from 
		(with
		cte1 as (select initiator_user_id from friend_requests where target_user_id = user_idx and status = 'approved'),
		cte2 as (select target_user_id from friend_requests where initiator_user_id = user_idx and status = 'approved')
		select * from cte1
		union
		select * from cte2) as p1
	) and status = 'approved' and initiator_user_id != user_idx),
	cte2 as (select target_user_id from friend_requests fr where initiator_user_id in (select initiator_user_id from 
		(with
		cte1 as (select initiator_user_id from friend_requests where target_user_id = user_idx and status = 'approved'),
		cte2 as (select target_user_id from friend_requests where initiator_user_id = user_idx and status = 'approved')
		select * from cte1
		union
		select * from cte2) as p2
	) and status = 'approved' and initiator_user_id != user_idx)
select * from cte1
union
select * from cte2
union
select user_id from profiles p WHERE hometown = (select hometown from profiles where user_id = user_idx) and user_id != user_idx
UNION 
select distinct user_id from users_communities uc where community_id in (select community_id from users_communities uc where user_id = user_idx) and user_id != user_idx
order by rand()
limit 5;
END $$
delimiter ;

call find_five_random_users_by_criteria (3);

