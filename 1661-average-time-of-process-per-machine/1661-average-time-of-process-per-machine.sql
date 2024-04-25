/* Write your PL/SQL query statement below */
-- Write your PostgreSQL query statement below
select machine_id,round(avg(vaqt),3) processing_time from (select sum(case when activity_type='start' then -1*timestamp else timestamp end) as vaqt, machine_id from Activity group by machine_id,process_id) group by machine_id;