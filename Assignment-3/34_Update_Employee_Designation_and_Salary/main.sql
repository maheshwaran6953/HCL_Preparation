update employees
set designation='Senior Software Engineer', salary=salary*1.12
where designation='Software Engineer'
and experience_years>=5;