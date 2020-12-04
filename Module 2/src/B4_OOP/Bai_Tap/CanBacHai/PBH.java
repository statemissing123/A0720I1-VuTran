package B4_OOP.Bai_Tap.CanBacHai;

import java.util.Scanner;

public class PBH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ax2: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập bx: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        CBH cbh = new CBH(a, b, c);
        if (cbh.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm: \nR1= " + cbh.getRoot1() + "\n" + "R2= " + cbh.getRoot2());
        } else {
            if (cbh.getDiscriminant() == 0) {
                System.out.println("Phương trình 1 nghiệm: " + cbh.getRoot1());
            } else {
                System.out.println(cbh.getRoot3());
            }
        }
    }
}
