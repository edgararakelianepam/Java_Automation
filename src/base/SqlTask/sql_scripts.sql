create table cars_list (   -- creation table1
cars_name_id smallint not null primary key,
cars_name varchar (30),
cars_factory smallint not null,
car_color varchar(10),
issue_date date
)
create table cars_factory_list (         -- creation table2
cars_factory_list_id smallint not null primary key,
factory_name varchar (30),
factory_country smallint
)
create table factory_location (     -- creation table3
factory_id smallint not null primary key,
factory_country varchar (20)
)
alter table cars_list  -- foreign key
add foreign key (cars_factory) references cars_factory_list (cars_factory_list_id)

alter table cars_factory_list  -- foreign key
add foreign key (factory_country) references factory_location (factory_id)


insert into cars_list (cars_name_id, cars_name, cars_factory, car_color, issue_date) values   -- insert data to table1
(1, 'Ford Kuga', 1, 'blue', '15/11/2022') , (2, 'BMW X5', 2, 'black', '14/12/2022'), (3, 'Mercedes M500', 3, 'white', '25/01/2023'), (4, 'Toyota Corolla', 4, 'red', '21/03/2023'),
(5, 'Ford Focus', 1, 'black', '10/02/2023'), (6, 'Mercedes M600', 3, 'gray', '14/05/2023')

insert into cars_factory_list (cars_factory_list_id, factory_name, factory_country) values   -- insert data to table2
(1, 'Ford Motor Company', 1), (2, 'BMW Factory', 2), (3, 'Mercedes Factory', 2), (4, 'Toyota Factory', 3)

insert into factory_location (factory_id, factory_country) values  -- insert data to table3
(1, 'USA'), (2, 'Germany'), (3, 'Japan')

select * from factory_location fl -- checking created table
select * from cars_factory_list cfl -- checking created table
select * from  cars_list cl -- checking created table

update cars_list set cars_name = 'Toyota Camry' where cars_name_id = 4   -- updating data

delete from cars_list where cars_name_id = 2; --deletion data by specific data
delete from cars_list; --deletion data from table

select * from cars_list where issue_date between '01/01/2023' and '01/02/2023' -- select with between
select * from cars_list where car_color in ('blue', 'black', 'white') --select with in
select * from cars_list cl where cars_name like '%rd%' -- select with like

select * from cars_list cl join cars_factory_list cfl   -- join ordered by
on cl.cars_factory = cfl.cars_factory_list_id
join factory_location fl on cfl.factory_country = fl.factory_id
order by fl.factory_country

SELECT count(*) + (SELECT count(*) FROM cars_factory_list) + (SELECT count(*) -- count of all recors
FROM factory_location)  AS total_amount FROM cars_list

select count(*) from cars_list cl where car_color = 'black'   -- aggregated
