-- create table person
-- (
--     id integer not null,
--     name varchar(255) not null,
--     location varchar(255),
--     birth_date timestamp,
--     primary key(id)
-- );

-- NOTE: The table is not being automatically created w/ Hibernate

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
    VALUES(10001,  'Ranga', 'Hyderabad',systimestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
    VALUES(10002,  'James', 'New York',systimestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
    VALUES(10003,  'Pieter', 'Amsterdam',systimestamp());