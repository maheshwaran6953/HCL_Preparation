update flights
set status='Delayed'
where city in ('Chennai', 'Coimbatore')
and status='Scheduled';
