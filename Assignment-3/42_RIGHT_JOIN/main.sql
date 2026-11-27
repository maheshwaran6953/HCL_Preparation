select d.department_id, d.department_name, e.employee_id, e.employee_name
from employees e
right join departments d
on e.department_id=d.department_id;