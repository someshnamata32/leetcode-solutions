select name as Customers 
from Customers 
left join Orders on Customers.id = Orders.CustomerId 
where CustomerId is null;