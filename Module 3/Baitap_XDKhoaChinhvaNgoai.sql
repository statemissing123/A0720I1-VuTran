create database Baitap_XacdinhKcKn;
use Baitap_XacdinhKcKn;
create table customers(
	makhachhang INT AUTO_INCREMENT PRIMARY KEY,
    name nvarchar(30),
    email varchar(50),
    phone int(9)
    );
create table accounts(
	stk INT primary key,
    account_type varchar(10),
    Opendate date not null,
    sodu double not null,
    makhachhang Int,
    foreign key(makhachhang)references customers(makhachhang)
);
create table transactions(
	magiaodich Int primary key,
    money double not null,
    Time_giaodich date not null,
    mota_thongtin text,
	makhachhang Int,
    foreign key(makhachhang)references customers(makhachhang)
);