package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_VILLA = "nameServices,areaUse,priceRent,maxCapacity,typeRent,roomStandard,descriptionRoom,areaOfPool,floor";
    private static final String FILE_HEADER_HOUSE = "nameServices,areaUse,priceRent,maxCapacity,typeRent,roomStandard,descriptionRoom,floor";
    private static final String FILE_HEADER_ROOM = "nameServices,areaUse,priceRent,maxCapacity,typeRent,IncludedServices";
    private static final String VILLA_FILE_PATH = "E:\\Codegym\\module02\\src\\CaseStudy\\Data\\Villa.csv";
    private static final String HOUSE_FILE_PATH = "E:\\Codegym\\module02\\src\\CaseStudy\\Data\\House.csv";
    private static final String ROOM_FILE_PATH = "E:\\Codegym\\module02\\src\\CaseStudy\\Data\\Room.csv";


    public static void villaWriteCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(VILLA_FILE_PATH);
            fileWriter.append(FILE_HEADER_VILLA);
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
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(VILLA_FILE_PATH);

            } catch (Exception ex) {
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
                Villa villa = new Villa();
                villa.setNameServices(splitData[0]);
                villa.setAreaUse(splitData[1]);
                villa.setPriceRent(splitData[2]);
                villa.setMaxCapacity(splitData[3]);
                villa.setTypeRent(splitData[4]);
                villa.setRoomStandard(splitData[5]);
                villa.setDescriptionRoom(splitData[6]);
                villa.setAreaOfPool(splitData[7]);
                villa.setFloor(splitData[8]);
                listVilla.add(villa);
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

    public static void houseWriteCSV(ArrayList<House> houseArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(HOUSE_FILE_PATH);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : houseArrayList) {
                fileWriter.append(house.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getAreaUse());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getPriceRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getDescriptionRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getFloor());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e) {
            System.out.println("Error  is CSVFileWrite !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close !!! ");
            }
        }
    }

    public static ArrayList<House> getReadFileListHouse() {
        BufferedReader br = null;
        ArrayList<House> houseArrayList = new ArrayList<House>();

        try {
            String line;
            br = new BufferedReader(new FileReader(HOUSE_FILE_PATH));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                House house = new House();
                house.setNameServices(splitData[0]);
                house.setAreaUse(splitData[1]);
                house.setPriceRent(splitData[2]);
                house.setMaxCapacity(splitData[3]);
                house.setTypeRent(splitData[4]);
                house.setRoomStandard(splitData[5]);
                house.setDescriptionRoom(splitData[6]);
                house.setFloor(splitData[7]);
                houseArrayList.add(house);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return houseArrayList;
    }

    public static void roomWriteToFileCsv(ArrayList<Room> roomArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(ROOM_FILE_PATH);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : roomArrayList) {
                fileWriter.append(room.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getAreaUse());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getPriceRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getIncludedServices());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }
    public static ArrayList<Room> getFileCsvRoom() {
        BufferedReader br = null;
        ArrayList<Room> roomArrayList = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(ROOM_FILE_PATH));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name Services")) {
                    continue;
                }
                Room room = new Room();
                room.setNameServices(splitData[0]);
                room.setAreaUse(splitData[1]);
                room.setPriceRent(splitData[2]);
                room.setMaxCapacity(splitData[3]);
                room.setTypeRent(splitData[4]);
                room.setIncludedServices(splitData[5]);
                roomArrayList.add(room);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return roomArrayList;
    }
}
