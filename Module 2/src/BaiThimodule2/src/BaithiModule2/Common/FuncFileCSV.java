package BaithiModule2.Common;

import BaithiModule2.Model.SoTKCoThoiHan;
import BaithiModule2.Model.SoTKDaiHan;
import BaithiModule2.Model.SoTKVoThoiHan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static final String FILE_HEADER_DAIHAN = "maSoSo,maKhachHang,ngayMoSo,thoiGianGui,kyHan,soTienGui,laiSuat,uuDai";
    public static final String FILE_HEADER_COHAN = "maSoSo,maKhachHang,ngayMoSo,thoiGianGui,kyHan,soTienGui,laiSuat,uuDai";
    public static final String FILE_HEADER_VOHAN = "maSoSo,maKhachHang,ngayMoSo,thoiGianGui,kyHan,soTienGui,laiSuat,uuDai";
    public static final String DAIHAN_FILE_PATH = "E:\\Codegym\\module02\\src\\BaiThimodule2\\src\\BaithiModule2\\Data\\SoTKDaiHan.csv";
    public static final String COHAN_FILE_PATH = "E:\\Codegym\\module02\\src\\BaiThimodule2\\src\\BaithiModule2\\Data\\SoTKCoHan.csv";
    public static final String VOHAN_FILE_PATH = "E:\\Codegym\\module02\\src\\BaiThimodule2\\src\\BaithiModule2\\Data\\SoTKVoHan.csv";

    public static void DaiHanWriteCSV(ArrayList<SoTKDaiHan> listSoTKDaiHan) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(DAIHAN_FILE_PATH);
            fileWriter.append(FILE_HEADER_DAIHAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoTKDaiHan soTKDaiHan : listSoTKDaiHan) {
                fileWriter.append(soTKDaiHan.getMaSoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getMaKhachHang());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getThoiGianGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getKyHan());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getLaiSuat());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKDaiHan.getUuDai());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error In CSVFileWriter !!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error When flush or close");
            }
        }
    }

    public static ArrayList<SoTKDaiHan> getReadSoDaiHan() {
        BufferedReader br = null;
        ArrayList<SoTKDaiHan> listSoTKDaiHan = new ArrayList<SoTKDaiHan>();
        Path path = Paths.get(DAIHAN_FILE_PATH);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(DAIHAN_FILE_PATH);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(DAIHAN_FILE_PATH));

            while ((Line = br.readLine()) != null) {
                String[] splitData = Line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                SoTKDaiHan soTKDaiHan = new SoTKDaiHan();
                soTKDaiHan.setMaSoSo(splitData[0]);
                soTKDaiHan.setMaKhachHang(splitData[1]);
                soTKDaiHan.setNgayMoSo(splitData[2]);
                soTKDaiHan.setThoiGianGui(splitData[3]);
                soTKDaiHan.setKyHan(splitData[4]);
                soTKDaiHan.setSoTienGui(splitData[5]);
                soTKDaiHan.setLaiSuat(splitData[6]);
                soTKDaiHan.setUuDai(splitData[7]);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {

            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return listSoTKDaiHan;
    }

    public static void CoHanWriteCSV(ArrayList<SoTKCoThoiHan> listSoTKCoThoiHan) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(COHAN_FILE_PATH);
            fileWriter.append(FILE_HEADER_COHAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoTKCoThoiHan soTKCoThoiHan : listSoTKCoThoiHan) {
                fileWriter.append(soTKCoThoiHan.getMaSoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getMaKhachHang());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getThoiGianGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getKyHan());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKCoThoiHan.getLaiSuat());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error In CSVFileWriter !!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error When flush or close");
            }
        }
    }
    public static ArrayList<SoTKCoThoiHan> getReadSoCoHan() {
        BufferedReader br = null;
        ArrayList<SoTKCoThoiHan> listSoTKCoHan = new ArrayList<SoTKCoThoiHan>();
        Path path = Paths.get(COHAN_FILE_PATH);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(COHAN_FILE_PATH,true);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(COHAN_FILE_PATH));

            while ((Line = br.readLine()) != null) {
                String[] splitData = Line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                SoTKCoThoiHan soTKCoThoiHan = new SoTKCoThoiHan();
                soTKCoThoiHan.setMaSoSo(splitData[0]);
                soTKCoThoiHan.setMaKhachHang(splitData[1]);
                soTKCoThoiHan.setNgayMoSo(splitData[2]);
                soTKCoThoiHan.setThoiGianGui(splitData[3]);
                soTKCoThoiHan.setKyHan(splitData[4]);
                soTKCoThoiHan.setSoTienGui(splitData[5]);
                soTKCoThoiHan.setLaiSuat(splitData[6]);

            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {

            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return listSoTKCoHan;
    }

    public static void VoHanWriteCSV(ArrayList<SoTKVoThoiHan> listSoTKVoThoiHan) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(VOHAN_FILE_PATH);
            fileWriter.append(FILE_HEADER_VOHAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoTKVoThoiHan soTKVoThoiHan : listSoTKVoThoiHan) {
                fileWriter.append(soTKVoThoiHan.getMaSoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKVoThoiHan.getMaKhachHang());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKVoThoiHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKVoThoiHan.getThoiGianGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKVoThoiHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soTKVoThoiHan.getLaiSuat());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error In CSVFileWriter !!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error When flush or close");
            }
        }
    }
    public static ArrayList<SoTKVoThoiHan> getReadSoVoHan() {
        BufferedReader br = null;
        ArrayList<SoTKVoThoiHan> listSoTKVoHan = new ArrayList<SoTKVoThoiHan>();
        Path path = Paths.get(VOHAN_FILE_PATH);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(VOHAN_FILE_PATH,true);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(VOHAN_FILE_PATH));

            while ((Line = br.readLine()) != null) {
                String[] splitData = Line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                SoTKVoThoiHan soTKVoThoiHan = new SoTKVoThoiHan();
                soTKVoThoiHan.setMaSoSo(splitData[0]);
                soTKVoThoiHan.setMaKhachHang(splitData[1]);
                soTKVoThoiHan.setNgayMoSo(splitData[2]);
                soTKVoThoiHan.setThoiGianGui(splitData[3]);
                soTKVoThoiHan.setSoTienGui(splitData[4]);
                soTKVoThoiHan.setLaiSuat(splitData[5]);

            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {

            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return listSoTKVoHan;
    }
}
