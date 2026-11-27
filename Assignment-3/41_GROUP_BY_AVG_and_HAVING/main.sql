select department, avg(salary)
from employees
group by department
having avg(salary) > 60000;