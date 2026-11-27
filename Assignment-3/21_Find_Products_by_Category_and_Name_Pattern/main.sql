select product_name, category, price
from products
where category in ('Laptop', 'Mobile')
and product_name like '%pro%';