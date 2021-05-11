create database resteasy;
use resteasy;

create table `Address_Details`(`Address_id` int(10) NOT NULL, `City` varchar(20) Default null, 
                         `Country` varchar(20) Default null, `State` varchar(20) Default null, 
                         `Street` varchar(20) Default null, `ZipCode` varchar(6) Default null,
                         primary key (`Address_id`));


create table `Customer_Details`(`Customer_id` int(10) NOT NULL, `First_Name` varchar(50) Default null, 
                         `Last_Name` varchar(50) Default null, `Email` varchar(50) Default null,
                         primary key (`Customer_id`));
                         
create table `Order_Details`(`Order_id` int(10) NOT NULL, `Total_Quantity` int(10) Default null, 
                         `Total_Price` double Default null, `Address_id` int(10) Default null, `Customer_id` int(10) NOT NULL,
                         foreign key(Address_id) references Address_Details(Address_id), foreign key(Customer_id) references Customer_Details(Customer_id), primary key (`Order_id`));
                         

