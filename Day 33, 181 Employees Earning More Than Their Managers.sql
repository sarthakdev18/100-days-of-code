# Write your MySQL query statement below
SELECT Worker.name AS Employee FROM Employee AS Worker
INNER JOIN Employee AS Manager ON (Worker.managerId = Manager.Id) 
WHERE Worker.salary > Manager.salary;