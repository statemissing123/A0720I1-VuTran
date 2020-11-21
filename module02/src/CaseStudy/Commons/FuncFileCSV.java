package CaseStudy.Commons;

import CaseStudy.Models.Villa;

import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_SERVICES = "nameServices,areaUse,priceRent,maxCapacity,typeRent,roomStandard,descriptionRoom,areaOfPool,floor";
    private static final String VILLA_FILE_PATH = "E:\\Codegym\\module02\\src\\CaseStudy\\Data\\Villa.csv";


    public static void writeCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(VILLA_FILE_PATH);
            fileWriter.append(FILE_HEADER_SERVICES);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getAreaUse());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getPriceRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getDescriptionRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getAreaOfPool());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getFloor());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error In CsvFileWriter !!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error When flush or close");
            }
        }

    }

    public static ArrayList<Villa> getReadCSVListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Path path = Paths.get(VILLA_FILE_PATH);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(VILLA_FILE_PATH);

            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(VILLA_FILE_PATH));

            while ((Line = br.readLine()) != null) {
                String[] splitData = Line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Villa villa=new Villa();
                villa.setNameServices(splitData[0]);
                villa.setAreaUse(splitData[1]);
                villa.setPriceRent(splitData[2]);
                villa.setMaxCapacity(splitData[3]);
                villa.setTypeRent(splitData[4]);
                villa.setRoomStandard(splitData[5]);
                villa.setDescriptionRoom(splitData[6]);
                villa.setAreaOfPool(splitData[7]);
                villa.setFloor(splitData[8]);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listVilla;

    }
}
