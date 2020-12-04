package CaseStudy.Controllers;

import CaseStudy.Commons.FuncFileCSV;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainController {
    public static ArrayList<Villa> listVilla = new ArrayList<>();
    public static ArrayList<House> listHouse = new ArrayList<>();
    public static ArrayList<Room> listRoom = new ArrayList<Room>();
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("MENU FURAMA" + "\n" +
                "1. Add New Services" + "\n" +
                "2. Show Services" + "\n" +
                "3. Add New Customer" + "\n" +
                "4. Show Information of Customer" + "\n" +
                "5. Add New Booking" + "\n" +
                "6. Show Information of Employee" + "\n" +
                "7. Exit" + " \n" +
                "What do you want to do, please choose: ");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1": {
                addNewServices();
                break;
            }
            case "2": {
                showServices();
                break;
            }
            case "7": {
                System.exit(0);
            }
            default: {
                System.out.println("Please choose again !!!");
                displayMainMenu();
            }

        }
    }


    public static void addNewServices() {
        System.out.println("----------------");
        System.out.print("SERVICES: \n" +
                "1. Add new villa\n" +
                "2. Add new house\n" +
                "3. Add new room\n" +
                "4. Back to menu\n" +
                "5. Exit\n" +
                "What do you want to do, please choose: ");
        String addServices = scanner.nextLine();
        switch (addServices) {
            case "1": {
                Villa villa = new Villa();
                System.out.println("Input Infor Villa:\n ");
                villa.setNameServices(scanner.nextLine());
                System.out.println("Enter areaUse:\n");
                villa.setAreaUse(scanner.nextLine());
                System.out.println("Enter priceRent:\n");
                villa.setPriceRent(scanner.nextLine());
                System.out.println("Enter maxCapacity:\n");
                villa.setMaxCapacity(scanner.nextLine());
                System.out.println("Enter typeRent:\n");
                villa.setTypeRent(scanner.nextLine());
                System.out.println("Enter roomStandard:\n");
                villa.setRoomStandard(scanner.nextLine());
                System.out.println("Enter descriptionRoom:\n");
                villa.setDescriptionRoom(scanner.nextLine());
                System.out.println("Enter areaOfPool:\n");
                villa.setAreaOfPool(scanner.nextLine());
                System.out.println("Enter floor:\n");
                villa.setFloor(scanner.nextLine());
                listVilla.add(villa);
                FuncFileCSV.villaWriteCSV(listVilla);
                System.out.println("Add New Villa complete !");
                scanner.nextLine();
                displayMainMenu();
                break;
            }
            case "2": {
                House house = new House();
                System.out.println("Input infor House: \n ");
                house.setNameServices(scanner.nextLine());
                System.out.println("Enter areaUse: \n");
                house.setAreaUse(scanner.nextLine());
                System.out.println("Enter priceRent: \n");
                house.setPriceRent(scanner.nextLine());
                System.out.println("Enter maxCapacity: \n");
                house.setMaxCapacity(scanner.nextLine());
                System.out.println("Enter typeRent: \n");
                house.setTypeRent(scanner.nextLine());
                System.out.println("Enter roomStandard: \n");
                house.setRoomStandard(scanner.nextLine());
                System.out.println("Enter descriptionRoom: \n");
                house.setDescriptionRoom(scanner.nextLine());
                System.out.println("Enter floor:\n");
                house.setFloor(scanner.nextLine());
                listHouse.add(house);
                FuncFileCSV.houseWriteCSV(listHouse);
                scanner.nextLine();
                displayMainMenu();
                break;
            }
            case "3":{
                Room room = new Room();
                System.out.println("Input infor Room: \n ");
                room.setNameServices(scanner.nextLine());
                System.out.println("Enter areaUse: \n");
                room.setAreaUse(scanner.nextLine());
                System.out.println("Enter priceRent: \n");
                room.setPriceRent(scanner.nextLine());
                System.out.println("Enter maxCapacity: \n");
                room.setMaxCapacity(scanner.nextLine());
                System.out.println("Enter typeRent: \n");
                room.setTypeRent(scanner.nextLine());
                System.out.println("Enter IncludedServices: \n");
                room.setIncludedServices(scanner.nextLine());
                listRoom.add(room);
                FuncFileCSV.roomWriteToFileCsv(listRoom);
                scanner.nextLine();
                displayMainMenu();
                break;
            }
            default: {
                System.out.println("Please choose again !!!");
                displayMainMenu();
            }
        }

    }

    private static void showServices() {
        System.out.println("---------------");
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Room Not Duplicate");
        System.out.println("7.Back to menu");
        System.out.println("8.Exit");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1": {
                showAllVilla();
                listVilla = FuncFileCSV.getReadCSVListVilla();
                for (Villa villa: listVilla){
                    System.out.println(villa.showInfo());
                }
                System.out.println();
                System.out.println(" Enter to continue......");
                scanner.nextLine();
                showServices();
                break;
            }
        }
    }
    public static void showAllVilla(){
        listVilla = FuncFileCSV.getReadCSVListVilla();
        int i = 1;
        for (Villa villa: listVilla){
            System.out.println(i + ". "+ villa.showInfo());
            i++;
        }
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
