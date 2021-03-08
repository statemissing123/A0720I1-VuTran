create database truyentranh;
use truyentranh;
create table truyen(
	IDtruyen int auto_increment primary key,
    TenTruyen nvarchar(45),
    HinhAnhTruyen mediumtext,
    LoaiTruyen nvarchar(45),
    SoChuong nvarchar(45),
    Quocgia nvarchar(45),
    TacGia nvarchar(45)
);
create table chuong(
	ChuongID int  primary key,
	chuongSo int,
    chuongten nvarchar(45),
    IDtruyen int auto_increment,
    foreign key (IDtruyen) references truyen(IDtruyen)
);
create table chuong_hinhanh(
	chuong_Hinhanh_id int  primary key,
    chuong_hinhanh_tenhinh mediumtext,
    ChuongID int,
    foreign key(ChuongId) references chuong(ChuongID)
);
