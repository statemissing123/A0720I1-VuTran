use furama;

select hoten , substring_index(hoten,' ',-1) as TenNV 
FROM nhanvien
having (TenNV Like 'K%' or
TenNV Like 'T%' or 
TenNV Like 'H%') and length(TenNV) <=15




