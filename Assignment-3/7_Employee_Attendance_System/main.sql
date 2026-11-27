create table attendance (
    attendance_id int primary key,
    employee_id int not null,
    attendance_percentage decimal(5, 2) check (attendance_percentage between 0 and 100),
    attendance_status varchar(20) default 'Present'
);