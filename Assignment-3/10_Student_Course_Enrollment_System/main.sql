create table students (
    student_id int primary key,
    student_name varchar(100) not null,
    email varchar(150) unique not null,
    age int check (age>=17)
);

create table courses (
    course_id int primary key,
    course_name varchar(100) unique not null,
    duration_months int check (duration_months>0)
);

create table enrollments (
    enrollment_id int primary key,
    student_id int references students(student_id) not null,
    course_id int references courses(course_id) not null,
    enrollment_status varchar(20) default 'Active',
    unique(student_id, course_id)
);