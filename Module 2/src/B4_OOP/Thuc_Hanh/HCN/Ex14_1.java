package B4_OOP.Thuc_Hanh.HCN;

import B4_OOP.Thuc_Hanh.HCN.Rectangle;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập width: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập Height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle= new Rectangle(width,height);
        System.out.println(rectangle.getArea()+" là Diện Tích HCN");
        System.out.println(rectangle.getPerimeter()+" là Chu Vi HCN");
        System.out.println(rectangle.display()+" is info");
    }
}
