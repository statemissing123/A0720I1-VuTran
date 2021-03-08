create database furamaresort;
use Furamaresort;
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
create table Vaitro(
	IDVaitro Int auto_increment primary key,
    TenVaiTro nvarchar(255)
);
create table NguoiDung(
	TenNguoiDung nvarchar(255) primary key,
    MatKhau nvarchar(255)
);
create table NguoiDung_VaiTro(
	IDVaitro Int auto_increment,
	TenNguoiDung nvarchar(255)
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
    DiaChi varchar(45),
    TenNguoiDung nvarchar(45),
	Foreign key (IDViTri) REFERENCES vitri(IDViTri),
    Foreign key (IDBoPhan) References BoPhan(IDBoPhan),
    Foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
    Foreign key (TenNguoiDung) references NguoiDung(TenNguoiDung)
);
create table LoaiKhach(
	IDLoaiKhach Int auto_increment primary key,
    tenLoaiKhach Varchar(45)
);
create table KhachHang(
	IDKhachHang INT primary key,
	IDLoaiKhach INT,
    Hoten nvarchar(45),
    NgaySinh Date,
    SoCMTND Varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    Foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table KieuThue(
	IDKieuThue INT primary key,
    TenKieuThue varchar(45),
    Gia INT
);
create table LoaiDichVu(
	IDLoaiDichVu Int primary key,
    TenLoaiDichVu varchar(45)
);
create table DichVu(
	IDDichVu INT primary key ,
    TenDichVu varchar(45),
	DienTich INT ,
	SoTang INT,
    SoNguoiToiDa Varchar(45),
    ChiPhiThue int not null,
    IDKieuThue int,
    IDLoaiDichVu Int,
    TrangThai varchar(45),
    Foreign key (IDKieuThue) references KieuThue(IDKieuThue),
    Foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
	IDHopDong Int primary key,
	IDNhanVien Int,
	IDKhachHang Int,
	IDDichVu Int,
    NgayLamHopDong Date not null,
    NgayKetThuc Date not null,
    TienDatCoc INT,
    TongTien INT,
    Foreign key (IDNhanVien) references NhanVien(IDNhanVien),
    Foreign key (IDKhachHang) references KhachHang(idkhachhang),
    Foreign key (iddichvu) references dichvu(iddichvu)
);
create table DichVuDiKem(
	IDDichVuDiKem INT primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi varchar(45),
    TrangThaiKhaDung varchar(45)
);
create table HopDongChiTiet(
	IDHopDongChiTiet INT primary key,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong Int not null,
    Foreign key (idhopdong) references hopdong(idhopdong),
    Foreign key (iddichvudikem) references dichvudikem(iddichvudikem)
);
Insert into ViTri values (1,'LeTan'),(2,'PhucVu'),(3,'ChuyenVien'),(4,'GiamSat'),(5,'QuanLy'),(6,'GiamDoc');
Insert into BoPhan values (1,'Sale-Maketting'),(2,'HanhChinh'),(3,'PhucVu'),(4,'QuanLy');
Insert into TrinhDo values (1,'TrungCap'),(2,'CaoDang'),(3,'DaiHoc'),(4,'SauDaiHoc');
Insert into NhanVien values (1,'Tran Le Viet Vu',6,3,4,'1999-11-26','206316652','30000000','0123456789','zittt@gmail.com','TamKy'),
(2,'Nguyen Thanh Quoc',3,3,3,'1999-07-25','206316651','10000000','1234567890','Quoccc@gmail.com','DaNang'),
(3,'Phan Quoc Don',5,3,4,'1991-09-02','206316649','20000000','1023456789','Donn@gmail.com','DaNang'),
(4,'Nguyen Phi Khanh',1,2,2,'1999-03-13','206316640','5000000','1024456789','Khanh@gmail.com','QuangTri');
Insert into LoaiKhach values (1,'Member'),(2,'Sliver'),(3,'Gold'),(4,'Platium'),(5,'Diamont');
Insert into KhachHang values (1,2,'MiMi','1992-09-08','206316655','0787709450','mimitk92@gmail.com','Tamky'),
(2,1,'Cuong','1999-12-01','206316655','0708462556','Cuongtk99@gmail.com','Quang Tri'),
(3,5,'Linh','1999-09-16','162609999','0708462555','nthl1609@gmail.com','Da Nang'),
(4,5,'Quoc','2007-07-25','250709999','0777777777','ntq2507@gmail.com','Da Nang');
Insert into KieuThue values (1,'Nam',500000),(2,'Thang',300000),(3,'Ngay',200000),(4,'Gio',50000);
Insert into LoaiDichVu values (1,'massage'),(2,'karaoke'),(3,'thucan'),(4,'nuocuong'),(5,'thuexe');
Insert into DichVu values (1,'Villa',1000,10,'5','2000000',2,3,'VuiVe');
Insert into HopDong values (1,1,1,1,'2020-11-30','2030-11-30',300000,5000000);
Insert into DichVuDiKem values (1,2,100000,'VND','KhaDung');
Insert into HopDongChiTiet values (1,1,1,5);
drop database furamaresort