package BaithiModule2.MainController;

import BaithiModule2.Common.FuncFileCSV;
import BaithiModule2.Model.SoTKCoThoiHan;
import BaithiModule2.Model.SoTKDaiHan;
import BaithiModule2.Model.SoTKVoThoiHan;

import java.util.ArrayList;
import java.util.Scanner;

public class mainController {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<SoTKDaiHan> listSoTKDaiHan = new ArrayList<>();
    public static ArrayList<SoTKCoThoiHan> listSoTKCoThoiHan = new ArrayList<>();
    public static ArrayList<SoTKVoThoiHan> listSoTKVoThoiHan = new ArrayList<>();
    public static void displayMenu() {
        System.out.println("-----Chương Trình Quản Lí Sinh Viên-----");
        System.out.println(" Chọn chúc năng theo số(để tiếp tục): ");
        System.out.println("1. Thêm sổ tiết kiệm ");
        System.out.println("2. Xóa sổ tiết kiệm");
        System.out.println("3. Xem danh sách sổ tiết kiệm");
        System.out.println("4. Xem thông tin khách hàng");
        System.out.println("5. Tìm kiếm sổ tiết kiệm");
        System.out.println("6. Thoát ");
        System.out.println("Chọn Chức năng : ");
        String choose = sc.nextLine();
        switch (choose) {
            case "1": {
                themSoTietKiem();
                break;
            }
            case "2":{
                xoaSoTietKiem();
                break;
            }
            case "3":{
                xemSoTietKiem();
                break;
            }
            case "6":{
                System.exit(0);
            }
            default:{
                System.out.println("Please choose again !!!");
                displayMenu();
            }
        }
    }

    public static void themSoTietKiem() {
        System.out.println("------------------");
        System.out.println("1.Thêm sổ tiết kiệm dài hạn ");
        System.out.println("2.Thêm sổ tiết kiệm ngắn hạn ");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":{
                SoTKDaiHan soTKDaiHan = new SoTKDaiHan();
                System.out.println("Nhập Mã số sổ: ");
                soTKDaiHan.setMaSoSo(sc.nextLine());
                System.out.println("Nhập Mã Khách Hàng: ");
                soTKDaiHan.setMaKhachHang(sc.nextLine());
                System.out.println("Nhập Ngày mở sổ: ");
                soTKDaiHan.setNgayMoSo(sc.nextLine());
                System.out.println("Nhập Thời gian bắt đầu gửi: ");
                soTKDaiHan.setNgayMoSo(sc.nextLine());
                System.out.println("Nhập Kỳ hạn: ");
                soTKDaiHan.setThoiGianGui(sc.nextLine());
                System.out.println("Nhập Số tiền gửi: ");
                soTKDaiHan.setSoTienGui(sc.nextLine());
                System.out.println("Nhập Kỳ hạn: ");
                soTKDaiHan.setKyHan(sc.nextLine());
                System.out.println("Nhập Lãi suất: ");
                soTKDaiHan.setLaiSuat(sc.nextLine());
                System.out.println("Nhập Ưu đãi: ");
                soTKDaiHan.setUuDai(sc.nextLine());
                listSoTKDaiHan.add(soTKDaiHan);
                FuncFileCSV.DaiHanWriteCSV(listSoTKDaiHan);
                System.out.println("Đã thêm thành công..");
                sc.nextLine();
                displayMenu();
                break;
            }
            case "2":{
                System.out.println("1.Sổ tiết kiệm có thời hạn: ");
                System.out.println("2.Sổ tiết kiệm vô thời hạn: ");
                System.out.println("Mời bạn chọn");
                String chon = sc.nextLine();
                switch (chon){
                    case "1": {
                        SoTKCoThoiHan soTKCoThoiHan = new SoTKCoThoiHan();
                        System.out.println("Nhập Mã số sổ: ");
                        soTKCoThoiHan.setMaSoSo(sc.nextLine());
                        System.out.println("Nhập Mã Khách Hàng: ");
                        soTKCoThoiHan.setMaKhachHang(sc.nextLine());
                        System.out.println("Nhập Ngày mở sổ: ");
                        soTKCoThoiHan.setNgayMoSo(sc.nextLine());
                        System.out.println("Nhập Thời gian bắt đầu gửi: ");
                        soTKCoThoiHan.setThoiGianGui(sc.nextLine());
                        System.out.println("Nhập Kỳ hạn: ");
                        soTKCoThoiHan.setKyHan(sc.nextLine());
                        System.out.println("Nhập Số tiền gửi: ");
                        soTKCoThoiHan.setSoTienGui(sc.nextLine());
                        System.out.println("Nhập Kỳ hạn: ");
                        soTKCoThoiHan.setKyHan(sc.nextLine());
                        System.out.println("Nhập Lãi suất: ");
                        soTKCoThoiHan.setLaiSuat(sc.nextLine());
                        listSoTKCoThoiHan.add(soTKCoThoiHan);
                        FuncFileCSV.CoHanWriteCSV(listSoTKCoThoiHan);
                        System.out.println("Đã thêm thành công..");
                        sc.nextLine();
                        displayMenu();
                        break;
                    }
                    case "2":{
                        SoTKVoThoiHan soTKVoThoiHan = new SoTKVoThoiHan();
                        System.out.println("Nhập Mã số sổ: ");
                        soTKVoThoiHan.setMaSoSo(sc.nextLine());
                        System.out.println("Nhập Mã Khách Hàng: ");
                        soTKVoThoiHan.setMaKhachHang(sc.nextLine());
                        System.out.println("Nhập Ngày mở sổ: ");
                        soTKVoThoiHan.setNgayMoSo(sc.nextLine());
                        System.out.println("Nhập Thời gian bắt đầu gửi: ");
                        soTKVoThoiHan.setThoiGianGui(sc.nextLine());
                        System.out.println("Nhập Số tiền gửi: ");
                        soTKVoThoiHan.setSoTienGui(sc.nextLine());
                        System.out.println("Nhập Lãi suất: ");
                        soTKVoThoiHan.setLaiSuat(sc.nextLine());
                        listSoTKVoThoiHan.add(soTKVoThoiHan);
                        FuncFileCSV.VoHanWriteCSV(listSoTKVoThoiHan);
                        System.out.println("Đã thêm thành công..");
                        sc.nextLine();
                        displayMenu();
                        break;
                    }
                }
            }
        }
    }
    public static void xoaSoTietKiem(){
        System.out.println("Chọn Sổ muốn xóa: ");
        sc.nextLine();
    }
    public static void xemSoTietKiem(){
        System.out.println("1.Sổ Vô hạn");
        System.out.println("2.Sổ Có hạn");
        String choose = sc.nextLine();
        switch (choose){
            case "1":{
                showVoHan();
                listSoTKVoThoiHan = FuncFileCSV.getReadSoVoHan();
                for (SoTKVoThoiHan soTKVoThoiHan: listSoTKVoThoiHan){
                    System.out.println(soTKVoThoiHan.showInfo());
                }
                System.out.println();
                System.out.println("Enter để tiếp tục");
                sc.nextLine();
                displayMenu();
                break;
            }
            case "2":{
                showCoHan();
                listSoTKCoThoiHan = FuncFileCSV.getReadSoCoHan();
                for (SoTKCoThoiHan soTKCoThoiHan: listSoTKCoThoiHan){
                    System.out.println(soTKCoThoiHan.showInfo());
                }
                System.out.println();
                System.out.println("Enter để tiếp tục");
                sc.nextLine();
                displayMenu();
                break;
            }
        }

    }
    public static void showVoHan(){
        listSoTKVoThoiHan = FuncFileCSV.getReadSoVoHan();
        int i = 1;
        for (SoTKVoThoiHan soTKVoThoiHan: listSoTKVoThoiHan){
            System.out.println(i + " . "+ soTKVoThoiHan.showInfo());
            i++;
        }
    }
    public static void showCoHan(){
        int i = 1;
        listSoTKCoThoiHan = FuncFileCSV.getReadSoCoHan();
        for (SoTKCoThoiHan soTKCoThoiHan: listSoTKCoThoiHan){
            System.out.println(i + ". "+ soTKCoThoiHan.showInfo());
            i++;
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}