create database bai5;
use bai5;
create table  Products
(Id int auto_increment primary key,
productCode varchar(50),
productName varchar(50),
productPrice double,
productAmount int,
productDescription varchar(50),
productStatus varchar(50));

insert into products(
productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus)
value
('p12','iphone 12',1000,1000,'tran vien tai tho',1),
('p11','iphone 11',800,1000,'tran vien lcd',1),
('p10','iphone 10',600,2000,'tai tho',0);
