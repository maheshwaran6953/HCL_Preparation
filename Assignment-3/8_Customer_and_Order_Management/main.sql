create table customers (
    customer_id int primary key,
    customer_name varchar(100) not null,
    email varchar(150) not null
);

create table orders (
    order_id int primary key,
    customer_id int not null references customers(customer_id),
    order_amount decimal(10, 2) check (order_amount>=0),
    order_status varchar(20) default 'Pending'
);