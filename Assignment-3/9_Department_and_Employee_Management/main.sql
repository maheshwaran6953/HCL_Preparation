create table departments (
    department_id int primary key,
    department_name varchar(100) not null,
    location varchar(100)
);

create table employees (
    employee_id int primary key,
    employee_name varchar(100) not null,
    email varchar(150) unique not null,
    department_id int references departments(department_id),
    salary decimal(10, 2) check (salary>=0),
    employee_status varchar(20) default 'Active'
);