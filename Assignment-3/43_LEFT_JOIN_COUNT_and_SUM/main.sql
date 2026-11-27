    select c.customer_id, c.customer_name, count(o.order_id), coalesce(sum(o.amount), 0.00)
    from customers c
    left join orders o
    on c.customer_id=o.customer_id
    group by c.customer_id;