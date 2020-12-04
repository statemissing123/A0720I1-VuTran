package B12_Collection_Framework.BaiTap.QuanLiSanPham;

import B10_DSA_List.BaiTap.ArrayList.MyList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager<product> {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productList = new ArrayList<Product>();
    private static int id;
    private static String name;
    private static long price;

    public static void menuProduct() {
        System.out.println("MENU PRODUCT" + "\n" +
                "1. add product" + "\n" +
                "2. edit product" + "\n" +
                "3. delete product" + "\n" +
                "4. show product" + "\n" +
                "5. search product" + "\n" +
                "6. sort product" + "\n" +
                "7. Exit"+ " \n" +
                "What do you want to do, please choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                addproduct();
                break;
            }
            case 2: {
                editproduct();
                break;
            }
            case 3: {
                deleteproduct();
                break;
            }
            case 4: {
                showproduct();
                break;
            }
            case 5: {
                searchproduct();
                break;
            }
            case 6:{
                System.out.println("You want to Sort up or down " + "\n" +
                        "1. ascending " + "\n" +  // tăng dần
                        "2. decrease ");   // giảm dần
                int sort = scanner.nextInt();
                switch (sort){
                    case 1:
                        for (Product product:productList) {
                            System.out.println(product);
                        }
                        System.out.println(" ");
                        break;
                    case 2:
                        for (int i = productList.size()-1;i >=0;i--){
                            System.out.println(productList.get(i));
                        }
                        System.out.println(" ");
                        break;
                }
                break;
            }
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Please again Enter number 1-->7 ");
        }
    }

    public static void addproduct() {
        id +=1;
        System.out.println("2. Name Product: ");
        scanner.skip("\n");
        name = scanner.nextLine();
        System.out.println("3. Price Product");
        price = scanner.nextLong();
        productList.add(new Product(id, name, price));
        System.out.println("Successfully");
        menuProduct();
    }

    public static void editproduct() {
        System.out.println("Choose ID want to edit: ");
        id = scanner.nextInt();
        System.out.println("Name: ");
        scanner.skip("\n");
        String nameNew = scanner.nextLine();
        System.out.println("Price: ");
        long priceNew = scanner.nextLong();
        for (Product product : productList) {
            if (id == product.getId()) {
                product.setName(nameNew);
                product.setPrice(priceNew);
                System.out.println("Edit Successfully");
                System.out.println(" ");
            } else {
                System.out.println("Id you choose not to have");
                break;
            }
        }
        menuProduct();
        showproduct();
    }

    public static void deleteproduct() {
        System.out.println("Choose ID want to delete Product: ");
        id = scanner.nextInt();
        for (Product product : productList) {
            if (id == product.getId()) {
                productList.remove(product);
                System.out.println("Delete Successfully ");
            } else {
                System.out.println("Id you choose not to have");
                break;
            }
        }
        menuProduct();
        showproduct();
    }

    public static void showproduct() {
        for (Product product : productList) {
            System.out.println("ID Product: " + product.getId() +
                    ", Name Product: '" + product.getName() + '\'' +
                    ", Price Product: " + product.getPrice());
        }
        menuProduct();
    }

    public static void searchproduct() {
        System.out.println("Enter Name Product: ");
        scanner.skip("\n");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product.toString());
                System.out.println(" ");
            } else {
                System.out.println("Name you choose not to have ");
            }
        }
    }


    public static void main(String[] args) {
        productList.add(new Product(1, "Iphone6", 30000));
        productList.add(new Product(2, "Iphone6s", 40000));
        System.out.println(" ");
        menuProduct();
    }
}
