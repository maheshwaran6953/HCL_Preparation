create table library_members (
    member_id int primary key,
    member_name varchar(100) not null,
    email varchar(150) unique not null,
    phone varchar(15)
);