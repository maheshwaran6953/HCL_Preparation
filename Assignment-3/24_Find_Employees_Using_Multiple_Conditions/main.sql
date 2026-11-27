select employee_name, department, experience_years, salary
from employees
where department in ('IT', 'Data Science', 'Engineering')
and experience_years between 3 and 8
and employee_name like '%a%';