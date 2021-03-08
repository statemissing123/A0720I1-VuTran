create database demo;
use demo;
create table Customer (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 address varchar(120),
 PRIMARY KEY (id)
);
insert into Customer(name, email, address) values('Minh','minh@codegym.vn','Viet Nam');
insert into Customer(name, email, address) values('Kante','kante@che.uk','Kenia');
DELIMITER $$

CREATE PROCEDURE get_Customer_by_id(IN Customer_id INT)

BEGIN

    SELECT Customer.name, Customer.email, Customer.country

    FROM Customer

    where Customer.id = Customer_id;

    END$$

DELIMITER ;

  

DELIMITER $$

CREATE PROCEDURE insert_Customer(

IN Customer_name varchar(50),

IN Customer_email varchar(50),

IN Customer_address varchar(50)

)

BEGIN

    INSERT INTO Customer(name, email, address) VALUES(Customer_name, Customer_email, Customer_address);

    END$$

DELIMITER ;
create table Permision(
id int(11) primary key,
name varchar(50)
);

create table Cus_Permision(
permision_id int(11),
Cus_id int(11)
);
insert into Permision(name) values('add');
insert into Permision(name) values('edit');
insert into Permision(name) values('delete');
insert into Permision(name) values('view');



