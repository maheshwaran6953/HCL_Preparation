create table products (
    product_id int primary key,
    product_name varchar(100) not null,
    category varchar(50),
    price decimal(10, 2)
);