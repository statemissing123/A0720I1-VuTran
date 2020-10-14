package B6_Ke_Thua.Thuc_Hanh.Circle;

import B6_Ke_Thua.Thuc_Hanh.Shape;

public class Circle_TH extends Shape {
    private double radius = 1.0;

    public Circle_TH() {
    }

    public Circle_TH(double radius) {
        this.radius = radius;
    }

    public Circle_TH(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
