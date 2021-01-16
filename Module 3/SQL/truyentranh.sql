create database truyentranh;
use truyentranh;
create table truyen(
	IDtruyen int auto_increment primary key,
    TenTruyen nvarchar(45),
    HinhAnhTruyen mediumtext,
    LoaiTruyen nvarchar(45),
    SoChuong nvarchar(45),
    TacGia nvarchar(45)
);
create table chuong(
	ChuongID int auto_increment primary key,
	chuongSo nvarchar(45),
    chuongten nvarchar(45),
    foreign key (IDtruyen) references truyen(IDtruyen)
);
create table chuong_hinhanh(
	chuong_Hinhanh_id int auto_increment primary key,
    chuong_hinhanh_tenhinh mediumtext,
    foreign key(ChuongId) references chuong(ChuongID)
);
