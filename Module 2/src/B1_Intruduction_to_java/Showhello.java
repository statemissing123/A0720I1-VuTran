package B1_Intruduction_to_java;

import java.util.Scanner;

public class Showhello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
    }
}
