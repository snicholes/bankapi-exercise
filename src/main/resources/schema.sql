drop table if exists account_type cascade;
drop table if exists account_status cascade;
drop table if exists roles cascade;
drop table if exists users cascade;
drop table if exists account cascade;

create table account_type(
	id serial primary key,
	type_name varchar unique not null
);

create table account_status(
	id serial primary key,
	name varchar unique not null
);

create table roles(
	id serial primary key,
	name varchar unique not null
);

create table users(
	id serial primary key,
	username varchar unique not null,
	passwd varchar not null,
	first_name varchar not null,
	last_name varchar not null,
	email varchar not null,
	role_id integer references roles
);

create table account(
	id serial primary key,
	balance double,
    status_id integer references account_status,
	type_id integer references account_type,
	owner_id integer references users
);