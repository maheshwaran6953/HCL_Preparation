create table bank_accounts (
    account_id int primary key,
    customer_name varchar(100) not null,
    account_number varchar(20) unique not null,
    balance decimal(10, 2),
    status varchar(20) default 'Active'
);