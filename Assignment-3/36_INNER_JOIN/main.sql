select employee_name, department_name
from employees e
inner join departments d
on e.department_id=d.department_id;