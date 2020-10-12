package B5_Access_moderfier.Bai_Tap;

import java.util.Scanner;

public class Run_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
