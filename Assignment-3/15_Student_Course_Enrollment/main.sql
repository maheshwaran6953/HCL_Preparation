insert into students values (501, 'Arun Prakash', 'arun@example.com', 20),
(502, 'Kavya Devi', 'kavya@example.com', 19),
(503, 'Rohit Kumar', 'rohit@example.com', 21);

insert into courses (course_id, course_name, duration_months) values (601, 'Python Programming', 6),
(602, 'Data Science', 8);

insert into enrollments (enrollment_id, student_id, course_id) values (701, 501, 601),
(702, 502, 601),
(703, 503, 602);