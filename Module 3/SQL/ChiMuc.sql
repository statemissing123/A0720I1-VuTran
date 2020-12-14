SELECT * FROM customers WHERE customerNumber = 175; 

---------
alter table customers add index idx_fukk_name(contactFirstName,contactLastName);
explain SELECT * FROM customers WHERE customerNumber = 175; 
explain select * from customers where contactFirstName = 'jean' or contactFirst;
ALTER TABLE customers DROP INDEX idx_full_name;