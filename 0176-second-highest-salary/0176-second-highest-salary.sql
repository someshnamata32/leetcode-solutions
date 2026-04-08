select 
(select distinct salary from Employee order by salary desc limit 1,1) 
as SecondHighestSalary;
-- (select distinct salary from Employee order by salary desc limit 1 offset 1)
-- offset mean kitna row skip karna hai 
-- limit mtlb uske baad kitne row lena hai
