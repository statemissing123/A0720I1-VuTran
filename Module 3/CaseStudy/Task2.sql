use furama;

select hoten , substring_index(hoten,' ',-1) as TenNV 
FROM nhanvien
having (TenNV Like 'K%' or
TenNV Like 'T%' or 
TenNV Like 'H%') and length(TenNV) <=15;
-- task3 -- 
select * ,year(curdate())-year(NgaySinh) as Tuoi
From khachhang
having (DiaChi = 'Da Nang' or DiaChi = 'Quang Tri') and Tuoi >18;
-- task4 -- 
select Khachhang.IDKhachHang , KhachHang.Hoten, count(hopdong.IDKhachHang) as SoLanDatPhong 
From KhachHang 
join hopdong on KhachHang.IDKhachHang = hopdong.idkhachhang
join loaikhach on Khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
where loaikhach.tenloaikhachhang =1
group by khachhang.idkhachhang order by SoLanDatPhong;







