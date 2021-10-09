use bai2;
insert into customer
values
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
delete  from `order`;
insert into `order`
values
(1,1,'2006/3/21 00:00:00' ,null),
(2,2,'2006/3/23 00:00:00' ,null),
(3,1,'2006/3/16 00:00:00',null);

insert into product
values
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into OrderDetail
values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

select  oID, oDate, oTotalPrice
from `order`;

select customer.CName,product.pName 
from orderdetail
inner join `order` on `order`.oID=orderdetail.oID
join customer on customer.cID=orderdetail.oID
inner join product on product.pID=orderdetail.oID;


select customer.CName 
from customer
left join `order`
on `order`.cID=customer.cID
where oID is null;

select orderdetail.oID,(odQTY*pPrice) as total,`order`.oDate from `order` 
inner join product on product.pID=`order`.oID
inner join orderdetail on orderdetail.pID=`order`.oID

 












