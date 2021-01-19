create table account_type(
	id serial primary key,
	type_name varchar unique not null
);

create table account_status(
	id serial primary key,
	status_name varchar unique not null
);

create table roles(
	id serial primary key,
	role_name varchar unique not null
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
	account_status_id integer references account_status,
	account_type_id integer references account_type,
	owner_id integer references users
);