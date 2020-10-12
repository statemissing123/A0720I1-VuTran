package B6_Ke_Thua.Thuc_Hanh.Circle;

import B6_Ke_Thua.Thuc_Hanh.Circle.Circle;

public class Run_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
