-- Initialize the postgreSQL database template (using spring boot JDBC)

drop database vaultdb;
drop user vault;
create user vault with password 'password';
create database vaultdb with template=template0 owner=vault;
\connect vaultdb;
alter default privileges grant all on tables to vault;
alter default privileges grant all on sequences to vault;

create table users(
                         user_id integer primary key not null,
                         first_name varchar(20) not null,
                         last_name varchar(20) not null,
                         email varchar(30) not null,
                         password text not null
);

create table data(
                            data_id integer primary key not null,
                              user_id integer not null,
                              title varchar(20) not null,
                              message varchar(50) not null,
                                type varchar(20) not null
);
alter table data add constraint data_users_fk
    foreign key (user_id) references users(user_id);


create sequence users_seq increment 1 start 1;
create sequence data_seq increment 1 start 1;
