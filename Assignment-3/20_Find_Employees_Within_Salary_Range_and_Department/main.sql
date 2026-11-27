select employee_name, department, salary
from employees
where department in ('IT', 'FINANCE')
and salary between 50000 and 70000;