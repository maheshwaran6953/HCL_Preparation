select product_name, sum(amount)
from sales
group by product_name;