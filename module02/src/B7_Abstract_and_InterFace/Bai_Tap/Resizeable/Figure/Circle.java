package B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Figure;

import B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
        super(5, 6, "yellow", true);
    }

    public Circle(double radius) {
        super(5, 6, "yellow", true);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(4, color, filled);
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

    @Override
    public void resize(double percent) {
        this.radius=this.radius+ this.radius*(percent/100);

    }
}
