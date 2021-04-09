drop database vaultdb;
drop user vault;
create user vault with password 'password';
create database vaultdb with template=template0 owner=vault;
\connect vaultdb;
alter default privileges grant all on tables to vault;
alter default privileges grant all on sequences to vault;

create table et_users(
                         user_id integer primary key not null,
                         first_name varchar(20) not null,
                         last_name varchar(20) not null,
                         email varchar(30) not null,
                         password text not null
);

create table et_data(
                            data_id integer primary key not null,
                              user_id integer not null,
                              title varchar(20) not null,
                              description varchar(50) not null
);
alter table et_data add constraint data_users_fk
    foreign key (user_id) references et_users(user_id);


create sequence et_users_seq increment 1 start 1;
create sequence et_data_seq increment 1 start 1;
