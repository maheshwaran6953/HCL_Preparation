select customer_id, customer_name, city
from customers
where city in ('Chennai', 'Coimbatore')
and customer_name like '%a';