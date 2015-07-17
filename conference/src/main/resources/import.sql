insert into local(local_name, local_elder, local_level) values ('용산','주평문',1);
insert into local(local_name, plocal_id, local_elder, local_level) values ('용산',1,'김경태',2);
insert into local(local_name, plocal_id, local_elder, local_level) values ('동작',1,'원종성',2);
insert into local(local_name, plocal_id, local_elder, local_level) values ('동작1',3,'원종범',3);
insert into local(local_name, plocal_id, local_elder, local_level) values ('동작2',3,'신용화',3);
insert into local(local_name, plocal_id, local_elder, local_level) values ('동작3',3,'지승해',3);

insert into car(car_name, driver_id, car_capacity, local) values ('엑스트렉',2,5,3);

insert into room(room_name, room_capacity, local) values ('501',5,3);
	
insert into saint(saint_name, saint_gender, saint_age, saint_status, saint_classify, local) values ('김종일','M',36,'전일','기존',4);
insert into saint(saint_name, saint_gender, saint_age, saint_head, saint_status, saint_classify, local) values ('오덕실','F',35,1,'전일','기존',4);
insert into saint(saint_name, saint_gender, saint_age, saint_head, saint_status, saint_classify, local) values ('김승주','M',6,1,'전일','기존',4);
insert into saint(saint_name, saint_gender, saint_age, saint_head, saint_status, saint_classify, local) values ('김주안','M',1,1,'전일','기존',4);

insert into carsaint(car, saint) values (1,2);
insert into carsaint(car, saint) values (1,3);
insert into carsaint(car, saint) values (1,4);

insert into roomsaint(room, saint) values (1,1);
insert into roomsaint(room, saint) values (1,2);
insert into roomsaint(room, saint) values (1,3);
insert into roomsaint(room, saint) values (1,4);

insert into summary(COUNTDATE, COUNT) values ('2010-01-01', 10);

