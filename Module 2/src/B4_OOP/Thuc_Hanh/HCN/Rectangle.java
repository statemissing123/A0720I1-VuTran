package B4_OOP.Thuc_Hanh.HCN;

public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + getWidth() + ", height=" + getHeight() + "}";
    }



}
