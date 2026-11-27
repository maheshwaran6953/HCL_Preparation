select product_id, product_name, category, price
from products
where category in ('Electronics', 'Accessories', 'Computer')
and price between 2000 and 50000
and (product_name LIKE 'Smart%' OR product_name LIKE 'Pro%');