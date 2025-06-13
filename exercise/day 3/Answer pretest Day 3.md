1. 
select departments.name as department_name, sum(employees.salary) as total_salary
from departments 
inner join employees 
on departments.id = employees.department_id
group by department_name 
order by total_salary desc

2. 
select employees.name from employees
where employees.id not in (select employee_id from employee_projects);

3. 

4. 
select * from projects
where (end_date - start_date) > (
    select AVG(DATE '2025-06-12' - hire_date)
    from employees
);

5. 
select employees.name, count(distinct project_id) as total_project
from employees inner join employee_projects 
on employees.id = employee_projects.employee_id
group by employees.name
having count(distinct project_id) >= 2;
