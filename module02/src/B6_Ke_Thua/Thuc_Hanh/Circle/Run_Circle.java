package B6_Ke_Thua.Thuc_Hanh.Circle;

public class Run_Circle {
    public static void main(String[] args) {
        Circle_TH circle = new Circle_TH();
        System.out.println(circle);

        circle = new Circle_TH(3.5);
        System.out.println(circle);

        circle = new Circle_TH(3.5, "indigo", false);
        System.out.println(circle);
    }
}
