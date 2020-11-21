package CaseStudy.Controllers;

import CaseStudy.Commons.FuncFileCSV;
import CaseStudy.Models.Villa;
import sun.security.mscapi.CPublicKey;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static ArrayList<Villa> listVilla = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String VILLA_FILE_PATH = "E:\\Codegym\\module02\\src\\CaseStudy\\Data\\Villa.csv";

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
                System.out.println("Input infor Villa:\n ");
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
                FuncFileCSV.writeCSV(listVilla);
                System.out.println("Add New Villa complete !");
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
        listVilla = FuncFileCSV.getReadCSVListVilla();
        for (Villa villa : listVilla) {
            System.out.println("-------------------");
            System.out.println("Name Services: " +villa.getNameServices());
            System.out.println("Area Use: " +villa.getAreaUse());
            System.out.println("Price Rent: " +villa.getPriceRent());
            System.out.println("Max Capacity: " +villa.getMaxCapacity());
            System.out.println("TypeRent: " +villa.getTypeRent());
            System.out.println("Room Standard: " +villa.getRoomStandard());
            System.out.println("Description Room: " +villa.getDescriptionRoom());
            System.out.println("Area Of Pool: " +villa.getAreaOfPool());
            System.out.println("Floor: " +villa.getFloor());

        }
        System.out.println("Enter to Continue... ");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
