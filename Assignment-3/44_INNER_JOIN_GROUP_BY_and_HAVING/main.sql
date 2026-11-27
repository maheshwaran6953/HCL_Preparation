select d.department_name, sum(s.amount)
from departments d
inner join employees e
on d.department_id=e.department_id
inner join sales s
on s.department_id=e.department_id
group by d.department_id
having sum(s.amount) > 50000;
