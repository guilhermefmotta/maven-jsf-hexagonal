--liquibase formatted sql

--changeset accounts:accounts-create
create table if not exists accounts (
    id serial primary key,
    name varchar,
    email varchar,
    fl_active bool default false
)
