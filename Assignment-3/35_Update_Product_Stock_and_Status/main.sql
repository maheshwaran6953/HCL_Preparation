update inventory
set stock_quantity=stock_quantity+20, status='In Stock'
where category in ('Electronics', 'Accessories')
and stock_quantity>10;