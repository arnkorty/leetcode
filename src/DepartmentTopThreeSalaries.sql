SELECT d.Name AS Department, e.Name AS Employee, e.Salary FROM Employee e, Department d
WHERE (SELECT COUNT(DISTINCT Salary) FROM Employee WHERE Salary > e.Salary
AND DepartmentId = d.Id) IN (0, 1, 2) AND e.DepartmentId = d.Id ORDER BY d.Name, e.Salary DESC;