CREATE SEQUENCE shared_sequence START 10000;

create table person (
    id bigint default nextval('shared_sequence') primary key,
    name varchar(100) not null,
    surname varchar(100) not null
);

create table address (
  id bigint default nextval('shared_sequence') primary key,
  person_id BIGINT references person(id),
  address_1 text,
  city text,
  extraneous text
);

create table phone (
  id bigint default nextval('shared_sequence') primary key,
  person_id BIGINT references person(id),
  priority int default 0,
  digits varchar(15)
);

create type udt_person as (
  id bigint,
  name text
);

create type udt_address as (
    id bigint,
    address_1 text,
    city text
);

create type udt_phone as (
  id bigint,
  digits varchar(15)
);

create type full_person_record as (
    person udt_person,
    addresses udt_address[],
    phones udt_phone[]
);
