select order_id, customer_name, total_amount
from orders
where order_year = '2025'
and total_amount between 2000 and 10000;