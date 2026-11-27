select c.customer_id, customer_name, order_id
from customers c
left join orders o
on c.customer_id=o.customer_id;