select department
from employees
group by department
having count(department) > 2;