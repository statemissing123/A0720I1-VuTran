create database Furama;
create table LoaiKhach(
	IDLoaiKhach Int auto_increment primary key,
    tenLoaiKhachHang Varchar(45)
);
create table NhanVien(
	IDNhanVien  Int auto_increment primary key,
    Hoten nvarchar(45),
    IDVitri INT,
    IDTrinhDo INT,
    IDBoPhan Int,
    NgaySinh Date not null,
    SoCMTND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    email varchar(45),
    DiaChi varchar(45)
);
create table ViTri(
	IDViTri int primary key,
    TenViTri varchar(45)
);
create table BoPhan(
	IDBoPhan int primary key,
    TenBoPhan VARCHAR(45)
);
create table TrinhDo(
	IDTrinhDo Int primary key,
    TrinhDo varchar(45)
);
create table KhachHang(
	IDKhachHang INT primary key,
	IDLoaiKhach INT,
    Hoten nvarchar(45),
    NgaySinh Date,
    SoCMTND Varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45)
);
create table DichVu(
	IDDichVu INT primary key ,
    TenDichVu varchar(45),
	DienTich INT ,
	SoTang INT,
    SoNguoiToiDa Varchar(45),
    ChiPhiThue Varchar(45),
    IDKieuThue Varchar(45),
    IDLoaiDichVu Int,
    TrangThai varchar(45)
);
create table LoaiDichVu(
	IDLoaiDichVu Int primary key,
    TenLoaiDichVu varchar(45)
);
create table DichVuDiKem(
	IDDichVuDiKem INT primary key,
    TenDichVuDikem varchar(45),
    Gia Int,
    DonVi Int,
    TrangThaiKhaDung varchar(45)
);
create table HopDong(
	IDHopDong Int primary key,
	IDNhanVien Int,
	IDKhachHang Int,
	IDDichVu Int,
    NgayLamHopDong Date not null,
    NgayKetThuc Date not null,
    TienDatCoc INT,
    TongTien INT
);
create table HopDongChiTiet(
	IDHopDongChiTiet INT primary key,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong Int
);