# Write your MySQL query statement below
select p.project_id, round(avg(1.0*e.experience_years),2) average_years from Project p
left join Employee e using(employee_id)
group by p.project_id;