-- first person
insert into person  values (1, '1 name', '1 surname');

insert into address values (1, 1, 'a address 1', 'city 1', 'ext');
insert into address values (2, 1, 'b address 1', 'city 1', 'ext');

insert into phone values (1, 1, 1, '8675309');
insert into phone values (2, 1, 2, '8675310');

-- second person
insert into person values (2, '2 name', '2 surname');
insert into address values (3, 2, 'a address 2', 'city 2', 'ext');
insert into address values (4, 2, 'b address 2', 'city 2', 'ext');

insert into phone values (3, 2, 1, '28675309');
insert into phone values (4, 2, 2, '28675310');


--create function all_persons() returns full_person_record[]