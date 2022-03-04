create table city (
CITY_ID varchar(255) not null,
CITY_NAME varchar(255), 
STATE_ID varchar(255), 
primary key (CITY_ID),
foreign key (STATE_ID) REFERENCES state(STATE_ID)
);
