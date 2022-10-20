drop table commerce;

create table commerce(
                         id  serial primary key ,
                         name varchar,
                         surname varchar,
                         department varchar,
                         salary int


);
insert into commerce(name,surname,department,salary)
values
('ilham','satimov','it',250);
